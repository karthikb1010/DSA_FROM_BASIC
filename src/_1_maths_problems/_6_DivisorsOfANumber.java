package _1_maths_problems;


//PRINT ALL DIVISORS OF A NUMBER

import java.util.Scanner;

public class _6_DivisorsOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		System.out.println("Divisors are :");
		
		for(int i = 1;i <=n;i++) {
			if( n% i==0) {
				System.out.print(i+ " ");
			}
			sc.close();
		}

	}

}
