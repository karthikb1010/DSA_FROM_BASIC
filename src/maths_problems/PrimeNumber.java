package maths_problems;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int n = sc.nextInt();

		if(n <=1) { 
			System.out.println("Not prime");
		}

		boolean isPrime = true;


		for(int i=2; i <=n-1; i++) {
			if( n % i == 0) {
				isPrime = false;
				break;
			}}
		if(isPrime) {
			System.out.println("The number is prime");
		}
		else {
			System.out.println("The number is not prime");
		}

		sc.close();

	}

}
