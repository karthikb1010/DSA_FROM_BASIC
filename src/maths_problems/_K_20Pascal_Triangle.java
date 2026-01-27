package maths_problems;

import java.util.Scanner;

public class _K_20Pascal_Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number:");
		int n = sc.nextInt();
		
		for(int i =0;i<n;i++) {
			int value = 1;
			
			for(int j=0;j<=i;j++) {
				System.out.print(value + " ");
				value = value * (i-j)/(j+1);
			}
			System.out.println();
		}
		
		
		sc.close();

	}

}
