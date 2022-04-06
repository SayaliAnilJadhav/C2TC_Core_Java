package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc 
{
   //Here declaring the isPrime instance member variable
   private boolean isPrime=true;
   
   float charges;
   
   //Here declaring the Delivery Charges For the product,initial will put Zero Balance
   private static final float deliveryCharges=0;
   
   
  //Here declaring the method isPrime which return the whether isPrime is true or false
  public boolean isPrime() 
  {
	  return isPrime;
  }

  //Here getting Delivery charges
  public static float getDeliverycharges() 
  {
	  return deliveryCharges;
  }

  //Here defining the Constructor for PrimeAcc:
  public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) 
  {
	  super(accNo, accNm, charges);
	  this.isPrime = isPrime;
	  this.charges = charges;
  }

 @Override
  public void bookProduct(float a) 
  {
	  System.out.println();
  }

  @Override
  public String toString()
   {
	   return "Dear Prime user, Your Product charges are:" +charges;
   }
}

