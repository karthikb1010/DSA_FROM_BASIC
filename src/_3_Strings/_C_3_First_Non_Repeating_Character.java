package _3_Strings;

/*
FIRST NON-REPEATING CHARACTER ✅
📌 PROBLEM IN SIMPLE WORDS

You are given a string.
You must find the first character that appears only once.

Examples:
"swiss"  → w
"loveleetcode" → v
"aabbcc" → none

*/

import java.util.HashMap;
import java.util.Scanner;

public class _C_3_First_Non_Repeating_Character {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string:");
		String str = sc.next();
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i< str.length();i++) {
			char ch = str.charAt(i);
			
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+ 1);
			}else {
				map.put(ch, 1);
			}
		}
		for(int i=0;i< str.length();i++){
			char ch = str.charAt(i);
			
			if(map.get(ch) == 1) {
				System.out.println("First non repeating character is : " + ch);
				return;
			}
		}
		System.out.println("No non repeating character found");

		sc.close();
	}

}
