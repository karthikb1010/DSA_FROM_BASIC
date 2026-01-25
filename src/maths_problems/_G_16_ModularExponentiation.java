package maths_problems;

import java.util.Scanner;

//Calculate Big power efficiently

public class _G_16_ModularExponentiation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the base:");
		long a = sc.nextLong();

		System.out.println("Enter the power:");
		long b = sc.nextLong();

		System.out.println("ENter the mod:");
		long mod = sc.nextLong();

		long result = 1;

		while(b>0) {
			if(b % 2 == 1) {
				result = (result * a) % mod;
			}
			a = (a * a) % mod;
			b = b/2; 
		}
		System.out.println("Result is : " + result);

		sc.close();
	}

}
