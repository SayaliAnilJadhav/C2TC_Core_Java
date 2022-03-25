package com.tns.coreJava;

public class BitwiseUnsigned 
{
  public static void main(String[] args) 
    {
	   int num1 = 40;
	   int num2 = -40;
	   int ans = 0;
	  
	   ans = num1 >>> 2;
	   System.out.println(ans);
	  
	   ans = num1 >>> 5;
	   System.out.println(ans);
	  
	   ans = num2 >>> 2;
	   System.out.println(ans);
	  
	   ans = num2 >>> 5;
	   System.out.println(ans);
    }
}
