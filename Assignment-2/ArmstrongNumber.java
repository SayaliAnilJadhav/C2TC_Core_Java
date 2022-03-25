package com.tns.coreJava;
import java.util.Scanner;

public class ArmstrongNumber 
{
  public static void main(String[] args) 
    {
	     int num,rem,temp,arm=0;
	     System.out.println("Enter number= ");
	   
	     Scanner input = new Scanner(System.in);
	     num =input.nextInt();
	   
	     temp = num;
	  	
	     while(num > 0)
	       {
		       rem = num % 10;
		       num = num/10;
		       arm = arm + rem * rem * rem;
	       }
	    if(arm == temp)
		      System.out.println(temp + " is an Armstrong number");
	    else
		      System.out.println(temp + " is not a Armstrong number");
	 }
}
