package maths_problems;

import java.util.Scanner;

//COUNT THE NUMBER OF SET BITS( 1s) 
//Set bit means a bit that is 1

public class _9_Set_Bits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number");
		int n = sc.nextInt();

		int count = 0;
		while( n> 0) {
			if( n % 2 == 1 ) {
				count++;
			}
			n = n/2;
		}
		System.out.println("Number of set bits : " + count);
		sc.close();
	}


}


