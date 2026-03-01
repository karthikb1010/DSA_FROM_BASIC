package _4_Two_Pointers_AND_Sliding_Window_Patterns;

import java.util.HashSet;

public class _K_11_LongestSubStringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String s = "abcabcbb";
		int left = 0;
		int maxLength = 0;
		
		HashSet<Character> set = new HashSet<>();
		
		for(int right = 0; right < s.length(); right++) {
			
			char ch= s.charAt(right);
			
			while(set.contains(ch)) {
				set.remove(s.charAt(left));
				left++;
			}
			set.add(ch);
			
			maxLength = Math.max(maxLength, right -left +1);
		}
		System.out.println("Maxlength is " + maxLength);

	}

}
