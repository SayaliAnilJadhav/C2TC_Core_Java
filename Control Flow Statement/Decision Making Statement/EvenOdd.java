package com.tns.coreJava;
import java.util.Scanner;

public class EvenOdd 
{
  public static void main(String[] args) 
    {
	    int num;
	  	System.out.println("Enter Number= ");
	  
	  	Scanner input = new Scanner(System.in);
	  	num = input.nextInt();
	  	
	  	if(num % 2 == 0)
	  		System.out.println("The " + num + " is even");
	  	else
	  		System.out.println("The " + num + " is odd");
	 }
}
