package maths_problems;

import java.util.Scanner;

// CHECK IF A NUMBER IS POWER OF TWO

public class _B_11_Power_Of_Two {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int n =  sc.nextInt();
		
		if(n <0) {
			System.out.println("Number is not a power of two");
			return;
		}
		
		while(n>1) {
			if( n % 2 != 0) {
				System.out.println("Number is not a power of two");
				return;
			}
			n = n / 2;
		}
		System.out.println("Number is a power of two ");
		
		sc.close();

	}


}
