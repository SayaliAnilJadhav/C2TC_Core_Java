package com.tns.coreJava;

public class Diamond_StarPattern 
{
  public static void main(String[] args) 
	{
	  int row = 5;
	  
	  for(int i = 1; i <=row; i++)
	   {
		  for(int j = row; j > i; j--)
		    {
			    System.out.print(" ");
		    }
		  for(int k = 0; k < i * 2 - 1; k++)
		    {
			    System.out.print("*");
		    }
		  System.out.println();
	   }
	  
	  for(int i = 1; i <=row-1; i++)
	    {
		    for(int j = 0; j < i; j++)
		     {
			     System.out.print(" ");
		     }
		    for(int k = (row - i)* 2 - 1; k >0; k--)
		     {
			     System.out.print("*");
		      }
		    System.out.println();
	   }
	}

}
