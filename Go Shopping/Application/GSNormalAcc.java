package com.tns.application;

import com.tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc 
{
  //Here defining the constructor of GsNormalAcc class
  public GSNormalAcc(int accNo, String accNm, float charges , float deliveryCharges)
    {
       super(accNo,accNm,charges);
    }
	    
  //Here defiining the method of bookProduct
  @Override
  public void bookProduct(float d) 
    {
	// TODO Auto-generated method stub
	super.bookProduct(d);
    }
	 
  @Override
  public String toString() 
    {
        // TODO Auto-generated method stub
	return super.toString();
    }
}
