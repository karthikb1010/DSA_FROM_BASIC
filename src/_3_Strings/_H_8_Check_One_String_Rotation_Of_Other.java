package _3_Strings;

import java.util.Scanner;

/*
✅ CHECK IF ONE STRING IS ROTATION OF ANOTHER ✅
📌 PROBLEM IN SIMPLE WORDS

You are given two strings.
You must check if the second string is a rotation of the first.

🧪 Examples:
s1 = "abcd"
s2 = "cdab"   → rotation ✅

Because:
abcd → cdab (rotated)

s1 = "abcd"
s2 = "acbd"   → not rotation ❌


🧠 SIMPLE IDEA (VERY IMPORTANT TRICK)

👉 If we join first string with itself:

s1 + s1


and if s2 is found inside it → rotation exists.

Example:
s1 = "abcd"
s1+s1 = "abcdabcd"

 */
public class _H_8_Check_One_String_Rotation_Of_Other {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter string1 :");
		String str1 = sc.next();

		System.out.println("Enter string2 :");
		String str2 = sc.next();

		if(str1.length() != str2.length()){
			System.out.println("Not rotation");
			return;
		}

		String combined = str1 +str1;

		if(combined.contains(str2)) {
			System.out.println("The string contains rotated");
		}else {
			System.out.println("Not rotated");
		}

		sc.close();
	}

}
