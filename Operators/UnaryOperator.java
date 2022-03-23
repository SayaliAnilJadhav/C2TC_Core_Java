package com.tns.coreJava;

public class UnaryOperator 
{
  public static void main(String[] args) 
   {
	    int num = 10;
	    int ans = 0;
	 
	    ans = +num;
	    System.out.println(ans);
	 
	    ans = -num;
	    System.out.println(ans);
	 
	    ans = ++num;                //PreIncrement
	    System.out.println(ans);
	 
	    ans = --num;                //PreDecrement
	    System.out.println(ans);
	 
	    ans = num++;                //PostIncremet
	    System.out.println(ans);
	 
	    ans = +num;                 //PostDecrement
	    System.out.println(ans);
	 
	    boolean  cond = true;
	    System.out.println(!cond);
  }
}
