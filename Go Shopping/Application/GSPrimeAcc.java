package com.tns.application;

import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc 
{
  //Here declaring the Charges variable 
  private static final float Charges=0;
	
 //Here getting the method of Charges
 public float getCharges()
   {
	return Charges;
   }
	
 //Defining the Constructor of GSPrimeAcc
 public GSPrimeAcc(int accNo,String accNm, float charges, boolean isPrime)
   {
	super(accNo,accNm,charges,isPrime);
   }
	
 //Here defining the method of bookProduct
 @Override
 public void bookProduct(float c) 
  {
	super.bookProduct(c);
  }

 //Here defining the toString Method
 @Override
 public String toString() 
  {
        return super.toString();
  }
}
