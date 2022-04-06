package com.tns.framework;

public abstract class NormalAcc extends ShopAcc 
{
  //Here declaring deliveryCharges who is not belong to prime user
  private final float deliveryCharges=49;
  
  float charges;
  
 //Here getting delivery charges 
 public float getDeliveryCharges() 
  {
      return deliveryCharges;
  }
 
 //Here defining constructor for the NormalAcc:
 public NormalAcc(int accNo,String accNm,float charges)
 {
     super(accNo,accNm,charges);
 }
 
 @Override
 public void bookProduct(float b) 
 {
     System.out.println();
 }

  @Override
  public String toString() 
   {
	return "Dear Normal user, Your Product charges are: " + charges + " with Delivery Charges is : " + deliveryCharges ;
   }
}


