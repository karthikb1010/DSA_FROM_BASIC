package _4_Two_Pointers_AND_Sliding_Window_Patterns;

import java.util.HashMap;

public class _L_12_Minimum_Window_SubString {

	public static void main(String[] args) {

		String s = "ADOBECODEBANC";
		String t = "ABC";

		if(s.length() < t.length()) {
			System.out.println("");
			return;
		}

		HashMap<Character, Integer> map = new HashMap<>();

		for(char c : t.toCharArray()) {
			map.put(c, map.getOrDefault(c,0)+1);
		}

		int left =0;
		int minLength = Integer.MAX_VALUE;
		int count = t.length();
		int start = 0;

		for(int right = 0; right<s.length(); right++) {

			char ch = s.charAt(right);

			if(map.containsKey(ch)) {
				if(map.get(ch) >0) {
					count--;
				}
				map.put(ch, map.get(ch)-1);
			}

			while(count == 0) {

				if(right - left + 1 < minLength) {
					minLength = right - left +1;
					start = left ;
				}

				char leftChar = s.charAt(left);

				if(map.containsKey(leftChar)) {
					map.put(leftChar, map.get(leftChar) +1);
					if(map.get(leftChar) > 0) {
						count++;
					}
				}
				left++;
			}
		}
		if(minLength == Integer.MAX_VALUE) {
			System.out.println("");
		}else {
			System.out.println(s.substring(start , start + minLength));
		}

	}

}
