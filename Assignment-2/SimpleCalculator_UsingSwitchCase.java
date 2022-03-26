package com.tns.coreJava;
import java.util.Scanner;

public class SimpleCalculator_UsingSwitchCase 
{
  public static void main(String[] args) 
	 {
		  char operator;
		  double num1,num2,ans;
		
		  Scanner input = new Scanner(System.in);
		
		  System.out.println("Enter First Number= ");
		  num1 = input.nextDouble();
		
		  System.out.println("Chooose an operator : +, -, *, /");
		  operator = input.next().charAt(0);
		
	    System.out.println("Enter Second Number= ");
		  num2 = input.nextDouble();
		
		  switch(operator)
		   {
		     case '+' :
			      ans = num1 + num2;
			      System.out.println(num1 + " + " + num2 + " = " + ans);
			      break;
			  
		    case '-' :
			     ans = num1 - num2;
			     System.out.println(num1 + " - " + num2 + " = " + ans);
			     break;
			   
		    case '*' :
			    ans = num1 + num2;
			    System.out.println(num1 + " * " + num2 + " = " + ans);
			    break;
			   
		   case '/' :
			   ans = num1 + num2;
			   System.out.println(num1 + " / " + num2 + " = " + ans);
			   break;
		 }
  }

}
