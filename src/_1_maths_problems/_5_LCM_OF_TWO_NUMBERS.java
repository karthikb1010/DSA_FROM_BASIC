package _1_maths_problems;


// FIND LCM OF TWO NUMBERS

import java.util.Scanner;

public class _5_LCM_OF_TWO_NUMBERS {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter the 1st number");
		int num1 = sc.nextInt();


		System.out.println("Enter the 2nd number");
		int num2 = sc.nextInt();


		int gcd = 1;
		int min = Math.min(num1, num2);

		for(int i = 1;i <= min ;i++) {
			if( num1 % i == 0 && num2 % i ==0 ) {
				gcd = i;


			}}
		int lcm  = (num1 * num2)/ gcd;
		System.out.println(lcm);
		sc.close();

	}

}
