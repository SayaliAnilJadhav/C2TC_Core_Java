package com.tns.coreJava;

public class RelationalOperators 
{
 /* There are 6 types of Relational operators in java :- ==,!=,>,<,>=,<=.
  * The output of relational operator is (true/false) boolean value */
    
   	 public static void main(String[] args) 
   	 {
        int num1 = 12;
        int num2 = 2;
        
        boolean ans;
        
        //==  ---> is equal to
        ans = (num1 == num2);
        System.out.println("num1 == num2= " + ans);
        
        //!= ---> is not equal to
        ans = (num1 != num2);
        System.out.println("num1 != num2= " + ans);
        
        //> ---> Greater than
        ans = (num1 > num2);
        System.out.println("num1 > num2= " + ans);
        
        //< ---> Less than
        ans = (num1 < num2);
        System.out.println("num1 < num2= " + ans);
         
        //>= ---> Greater than or equal to
        ans = (num1 >= num2);
        System.out.println("num1 >= num2= " + ans);
        
        //<= ---> Less than or equal to
        ans = (num1 <= num2);
        System.out.println("num1 <= num2= " + ans);
	 }
}
