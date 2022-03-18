package com.tns.coreJava;

public class IntDataType 
{
   //range ---> -2147483648 to 2147483647
	 
	   public static void main(String[] args) 
	    {
		    int num = 10354;
		    System.out.println(num);
		 
		    //int num1 = 2147483648;      //Error
		  
		    int num1 = 2147483647;
		    System.out.println(num1);
		  
		    int num2 = -2147483648;
		    System.out.println(num2);
		  
		    //int num3 = -2147483649;    //Error
		 }
}
