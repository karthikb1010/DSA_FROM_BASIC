package _5_Stack;

import java.util.Stack;

public class _G_7_Valid_Paranthesis {

	public static void main(String[] args) {
		
		String s = "([{}])";
		int n = s.length();
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<n ; i++) {
			char ch = s.charAt(i);
			
			if(ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}
			else {
				if(stack.isEmpty()) {
					System.out.println("Invalid ");
					return;
				}
			
			char top = stack.pop();
			
			if(ch == ')' && top!= '(' ||
				ch == '}' && top!= '{' ||
				ch == ']' && top!= '[' ) {
				System.out.println("Invalid");
				return;
			}
		}
		}
		if(stack.isEmpty()) {
			System.out.println("Valid parenthesis");
		}else {
			System.out.println("Invalid parenthesis");
		}
	}

}
