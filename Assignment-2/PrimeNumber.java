package com.tns.coreJava;
import java.util.Scanner;

class Prime
{ 
  String checkPrime(int num)
   {
     boolean b=true;
  
     for(int i=2;i<num;i++)
      {
        if(num%i==0)
        {
         b=false;
         break;
        }
      }
     if(b)
        return "Prime";
     else
        return "Not prime"; 
   }
}

public class PrimeNumber 
{
   public static void main(String args[])
	 {
	    System.out.println("Enter Number= ");
	    Scanner input = new Scanner(System.in);
	    int num = input.nextInt();
	    
	    Prime p= new Prime();
	    System.out.println("The numner "+num+" is "+p.checkPrime(num)); 
	 }
}
