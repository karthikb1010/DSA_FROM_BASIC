package _1_maths_problems;

import java.util.Scanner;

//CHECK THE GIVEN NUMBER IS ARMSTRONG NUMBER OR NOT

public class _8_ArmStrong_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = sc.nextInt();

		int original = n;
		int sum =0;

		//step1: count digits
		int digits = 0;
		int temp = n;

		while(temp >0) {
			digits++;
			temp = temp  /10;
		}

		//step2: calculate power sum

		while(n> 0) {
			int digit = n % 10;
			sum = sum + (int)Math.pow(digit, digits);
			n = n / 10;
		}
		if(sum == original) {
			System.out.println("It is Armstrong Number");
		}
		else {
			System.out.println("It is NOT a Armstrong Number");
		}
		sc.close();


	}

}
