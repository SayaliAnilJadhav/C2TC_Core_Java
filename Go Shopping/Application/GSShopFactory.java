package com.tns.application;

import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class GSShopFactory extends ShopFactory 
{
  @Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) 
	 {
		GSPrimeAcc GSPrime = new GSPrimeAcc(accNo, accNm, charges,  isPrime);
		
		System.out.println(GSPrime.toString());
		return GSPrime;
	 }

	@Override
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) 
	 {
		GSNormalAcc GSNormal = new GSNormalAcc(accNo, accNm, charges, deliveryCharges);

		System.out.println(GSNormal.toString());
		return GSNormal;
	 }
}
