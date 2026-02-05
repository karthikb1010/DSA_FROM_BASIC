package _3_Strings;
/*
Given array of strings:

["eat","tea","tan","ate","nat","bat"]


Group them like:

[eat, tea, ate]
[tan, nat]
[bat]

🧠 BIG IDEA (simple)

If two words are anagrams:

👉 when you SORT their letters → they become SAME

Example:

"eat" → sort → "aet"
"tea" → sort → "aet"
"ate" → sort → "aet"
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _O_15_Group_Anagrams {

	public static void main(String[] args) {

		String[] words = {"eat","tea","tan","ate","nat","bat"};

		HashMap<String, List<String>> map = new HashMap<>();

		for(String word : words){

			char[] arr = word.toCharArray();
			Arrays.sort(arr);
			String key = new String(arr);

			if(!map.containsKey(key)){
				map.put(key, new ArrayList<>());
			}

			map.get(key).add(word);
		}

		for(List<String> group : map.values()){
			System.out.println(group);
		}
	}

}

