package com.tns.coreJava;

public class Array_Demo_3D {

	public static void main(String[] args) {
	
    int arr[][][]= {{{10,48,35,90}},{{79,80,56}},{{15,55}},{{100}}};
		
		System.out.println("3D Zero Rference 2D Zero Rference First Value  :"+arr[0][0][0]);
		System.out.println("3D Zero Rference 2D Zero Rference Second Value :"+arr[0][0][1]);
		System.out.println("3D Zero Rference 2D Zero Rference Third Value  :"+arr[0][0][2]);
		System.out.println("3D Zero Rference 2D Zero Rference Fourth Value :"+arr[0][0][3]);
		
		System.out.println();
		
		System.out.println("3D First Reference 2D Zero Reference First Value  :"+arr[1][0][0]);
		System.out.println("3D First Reference 2D Zero Reference Second Value :"+arr[1][0][1]);
		System.out.println("3D First Reference 2D Zero Reference Third Value  :"+arr[1][0][2]);
		
		System.out.println();
		
		System.out.println("3D Second Reference 2D Zero Reference First Value :"+arr[2][0][0]);
		System.out.println("3D Second Reference 2D Zero Reference Second Value :"+arr[2][0][1]);
		
		System.out.println();
		System.out.println("3D Third Reference 2D Zero Reference First Value :"+arr[3][0][0]);
	}
}
