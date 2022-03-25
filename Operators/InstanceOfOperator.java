package com.tns.coreJava;

public class InstanceOfOperator 
{
 public static void main(String[] args) 
   {
	   InstanceOfOperator operator = new InstanceOfOperator();
	   InstanceOfOperator operator1 = null;
	 
	   boolean res;
	   res = operator instanceof InstanceOfOperator;
	 
	   System.out.println(res);
	 
	   res = operator1 instanceof InstanceOfOperator;
	   System.out.println(res);
   }
}
