package com.tns.coreJava;

public class Array_Demo_2D {

	public static void main(String[] args) {
		
		int arr[][]= {{24,43,56,88},{50,99,34,20}};
		System.out.println("Zero RferenceFirst Value  :"+arr[0][0]);
		System.out.println("Zero Rference Second Value :"+arr[0][1]);
		System.out.println("Zero Rference Third Value  :"+arr[0][2]);
		System.out.println("Zero Rference Fourth Value :"+arr[0][3]);
		
		System.out.println();
		
		System.out.println("First Reference First Value  :"+arr[1][0]);
		System.out.println("First Reference Second Value :"+arr[1][1]);
		System.out.println("First Reference Third Value  :"+arr[1][2]);
		System.out.println("First Reference Fourth Value :"+arr[1][3]);
	}
}
