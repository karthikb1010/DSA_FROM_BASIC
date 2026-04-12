package _3_Strings;

import java.util.Scanner;



public class _G_7_Longest_Common_Prefix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string array size:");
		int n = sc.nextInt();
		
		String[] arr = new String[n];
		
		System.out.println("Enter string elements:");
	for(int i=0;i<n;i++) {
		arr[i] = sc.next(); 
	}
	
	String prefix = arr[0];
	
	for(int i=1;i<n;i++) {
		while(arr[i].indexOf(prefix) != 0) {
			prefix = prefix.substring(0, prefix.length()-1);
			
			if(prefix.isEmpty()) {
				System.out.println("No commom prefix");
				return;
			}
		}
		
	}
	
	System.out.println("The common prefix is: " + prefix);
	
	}

}


/*
You are given multiple strings.

You must find the longest starting part (prefix) that is common in all strings.

Example 1:
["flower", "flow", "flight"]

Common prefix:
"fl"


🧪 Example 2:
["dog", "racecar", "car"]
Common prefix:
""   (nothing common)

🧠 BASIC IDEA (VERY SIMPLE)

👉 Take the first string as reference
👉 Compare its characters with same position in other strings
👉 Stop when mismatch happens

*/
