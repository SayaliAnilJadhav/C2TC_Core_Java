package com.tns.coreJava;

public class ByteDataType 
{
  //range ----> -128 to 127
  
      public static void main(String[] args)
	 {
	     byte num = 10;
	     System.out.println(num);
		
             //byte num1 = 128;                //Error
	     //System.out.println(num1);
        
	     //byte num2= -129;                //Error
	     //System.out.println(num2);
		
	     byte num3 = 127;
	     System.out.println(num3);
		
             byte num4 = -128;
             System.out.println(num4);
		
	     byte num5 = -120;
             System.out.println(num5);
		
             byte num6 = 126;
             System.out.println(num6);
       }
}
