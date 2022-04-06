package com.tns.framework;

 public abstract class ShopAcc 
 {
	  //Here  declaring account number, account name, charges for shopping
	  private int accNo;
	  private String accNm;
	  private float charges;
	
	  //Here getting account number
	   public int getAccNo() 
	  { 
            return accNo;
	  }

	  //Here getting account name
	  public String getAccNm() 
	  {
	    return accNm;
	  }

         //Here setting account name
         public void setAccNm(String accNm)
         {
	   this.accNm = accNm;
	 }

       //Here getting charges for shopping
       public float getCharges() 
        {
	  return charges;
	}

       //Here defining the constructor for shopping account class
       public ShopAcc(int accNo, String accNm, float charges) 
        {
          this.accNo = accNo;
          this.accNm = accNm;
          this.charges = charges;
	}
 
       //Here defining abstract bookProduct
       public void bookProduct(float pro)
	 {
      
	 }
	
	//Here defining item method  to display the item
	public void item(float value)
	 {
		
	 }
	
        @Override
	public String toString() 
	  {
            return accNm;
	  }
}
