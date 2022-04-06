package com.tns.application;

import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;

public class Main {

	public static void main(String[] args) 
	{
		PrimeAcc prime = new GSPrimeAcc(1, "Sayali", 6000, true);
		NormalAcc normal = new GSNormalAcc(2, "Shravani", 12000, 49);
		
		prime.bookProduct(6000);
		normal.bookProduct(12000);
		
		System.out.println(prime.toString());
		System.out.println();
		System.out.println(normal.toString());
	}
}
