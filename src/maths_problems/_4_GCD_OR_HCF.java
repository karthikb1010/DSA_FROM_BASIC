package maths_problems;

import java.util.Scanner;

//FIND THE GCD/HCF OF TWO NUMBERS


public class _4_GCD_OR_HCF {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter your 1st number");
		int num1 = sc.nextInt();

		System.out.println("Enter your 2nd number");
		int num2 = sc.nextInt();

		int gcd = 1;
		
		int min = Math.min(num1,num2);
		
		for(int i=1; i<= min ; i++) {
			if(num1 % i ==0 && num2 % i ==0) {
				gcd = i;
			
			}
			
		}
		System.out.println(gcd);
		sc.close();
	}
	


}
