package maths_problems;

import java.util.Scanner;

//Seive of Eratosthones--- find all primes <= N

public class _C_12_Seive_Of_Eratosthenes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		boolean[] isPrime = new boolean[n+1];
		
		for( int i =2 ; i<=n ;i++) {
			isPrime[i] = true;
		}
		
		for(int i =2; i*i <=n ;i++) {
			if (isPrime[i]) {
				for(int j =i*i ;j<=n ;j=j+i) {
					isPrime[j] = false;
				}
				
			}
			
		}
		System.out.println("Prime numbers are:" );
		for(int i =2 ;i<=n; i++) {
			if (isPrime[i]) {
				System.out.println(i + " ");
			}
		}
		
		sc.close();

	}

}
