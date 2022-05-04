
package com.tns.corejava;

import java.util.Scanner;

class MinNumber 
{
 public int process(int num1, int num2) 
 {
  int min = num1;
  if (num1 > num2) 
  {
   min = num2;
  }
  else 
  {
   min = num1;
  }
 return min;
 }
}


public class IfElse_MinumumFrom2Number {

	
	public static void main(String[] args) {
		int num1;
		System.out.println("Enter your first number");
     
		Scanner input = new Scanner(System.in);
		num1 =input.nextInt();
		
		int num2;
		System.out.println("Enter your first number");

		num2 = input.nextInt();
		
		  int min = new MinNumber().process(num1, num2);
		 System.out.println(" the minimun number is : " + min);
	}

}
