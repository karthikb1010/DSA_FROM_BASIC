package _2_arrays;

import java.util.HashMap;
import java.util.Scanner;

public class _K_11_Two_Sum_Problem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the array size:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the target:");
		int target = sc.nextInt();


		HashMap<Integer ,Integer> map = new HashMap<>();

		for(int i =0;i<n;i++) {
			int need = target - arr[i];


			if(map.containsKey(need)) {
				System.out.println("Pair found " + need + " and " + arr[i]);
				return;
			}
			map.put(arr[i], i);

		}
		System.out.println("No pair found");

		return;
	}

}







////////////////////////////////////////////////////other method(BASIC METHOD (NESTED LOOP))
/*
import java.util.Scanner;

public class TwoSumBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("Pair found: " + arr[i] + " " + arr[j]);
                    return;
                }
            }
        }

        System.out.println("No pair found");
    }
}


 */
