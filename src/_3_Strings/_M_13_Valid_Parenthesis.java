package _3_Strings;

import java.util.Scanner;
import java.util.Stack;

public class _M_13_Valid_Parenthesis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter paranthesis string:");
		String s = sc.next();

		Stack<Character> stack = new Stack<>();

		for(int i=0;i< s.length();i++){
			char ch = s.charAt(i);

			if(ch == '{' || ch =='[' || ch=='(') {
				stack.push(ch);

			}else {
				if(stack.isEmpty()) {
					System.out.println("invalid");
					return;
				}
				char top = stack.pop();

				if((ch ==')' && top!='(') ||
					(ch =='}' && top!='{') ||
					(ch ==']' && top!='[')) {
					System.out.println("Invalid");
					return;
				}
			}
		}
		if(stack.isEmpty()) {
			System.out.println("valid");
		}else {
			System.out.println("Invalid");
		}

	}

}


/*

📌 Problem Summary

Given a string containing:

(  )  {  }  [  ]

👉 Check if:

Every opening bracket has a matching closing bracket
Order is correct
Proper nesting is followed
🧠 Core Idea (IMPORTANT)

👉 Use Stack (LIFO)

Opening bracket → push
Closing bracket → pop & match

💡 Reason:

Last opened bracket must be closed first

⚙️ Algorithm Steps
Create empty stack
Traverse string
If opening bracket → push
If closing bracket:
If stack empty → ❌ invalid
Pop and check match
After loop:
Stack empty → ✅ valid

*/
 */