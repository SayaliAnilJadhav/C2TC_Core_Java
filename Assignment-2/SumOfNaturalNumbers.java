package com.tns.coreJava;

import java.util.Scanner;

public class SumOfNaturalNumbers 
{
  public static void main(String[] args) 
    {
	  int num, i ;
	  int sum = 0;
	  
	  Scanner obj = new Scanner(System.in);
	  
	  System.out.println("Sum from= ");
	  i = obj.nextInt();
	  
	  System.out.println("Sum up to= ");
	  num =obj.nextInt();
	  
	  while(i <= num)
	    {
	  	sum=sum+i;
	  	i++;
	    }
	 System.out.println("Sum Of Natural Numbers = " +sum);
    }
}


