package com.tns.coreJava;

public class BitwiseOperator 
{
  public static void main(String[] args) 
    {
	    int num1 = 5;
	    int num2 = 9;
	    int ans = 0;
	  
	    ans = num1 & num2;                             //bitwise and
	    System.out.println("Bitwise and= " + ans);
	  
	    ans = num1 | num2;                             //bitwise or
	    System.out.println("Bitwise or= " + ans);
	  
	    ans = num1 ^ num2;                            //bitwise xor
	    System.out.println("Bitwise xor= " + ans);
	  
	    ans = ~num1  ;                                //bitwise not
	    System.out.println("Bitwise not= " + ans);
	  }
}
