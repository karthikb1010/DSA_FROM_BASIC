package _2_Arrays;

/*
You are given two arrays.

Find the elements that appear in both arrays.

(Intersection = common elements)

*/
import java.util.Arrays;
import java.util.Scanner;

public class _N_14_Intersection_Of_Two_Arrays {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter array1 size:");
		int n1 = sc.nextInt();

		int[] arr1 = new int[n1];
		
		System.out.println("Enter array1 elements:");
		for(int i=0;i<n1;i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter array2 size:");
		int n2 = sc.nextInt();
		
		int[] arr2 = new int[n2];
		
		System.out.println("Enter array2 elements:");
		for(int i=0;i<n2;i++) {
			arr2[i] = sc.nextInt();
		}

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		
		int i =0 , j=0;
		
		while( i < n1 && j < n2) {
			if(arr1[i] == arr2[j]) {
				System.out.print(arr1[i] + " ");
				i++;
				j++;
			}else if(arr1[i] < arr2[j]) {
				i++;
			}else {
			
				j++;
			}
		}
		
		sc.close();
	}

}
