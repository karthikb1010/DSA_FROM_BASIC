package _4_Two_Pointers_AND_Sliding_Window_Patterns;

import java.util.HashMap;

public class _N_14_Count_Occurences_Of_Anagrams {

	public static void main(String[] args) {

		String s = "forxxorfxdofr";
		String p = "for";

		HashMap<Character,Integer> map = new HashMap<>();

		for(char c : p.toCharArray()) {
			map.put(c, map.getOrDefault(c ,0)+ 1);
		}

		int count = map.size();
		int k = p.length();
		int ans = 0;
		int left = 0;
		

		for(int right =0; right<s.length(); right++) {
			char ch = s.charAt(right);

			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch) -1);

				if(map.get(ch) ==0) {
					count--;
				}
			}
				if(right - left + 1 ==k ) {
					if(count ==0) {
						ans++;
					}

					char leftChar = s.charAt(left); 
					
					if(map.containsKey(leftChar)){ 
						map.put(leftChar, map.get(leftChar) + 1); 
						if(map.get(leftChar) == 1){ 
							count++; 
						}
					} 
					left++; 
				}
			}
			System.out.println("Total anagrams = " + ans);
		}
	}

