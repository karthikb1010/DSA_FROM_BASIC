package _5_Stack;

import java.util.Stack;

public class _J_10_Evaluate_Postfix_Expression {

	public static void main(String[] args) {
		
		String s = "231*+9-";
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0;i < s.length();i++) {
			char ch = s.charAt(i);
			
			if(Character.isDigit(ch)) {
				stack.push(ch - '0');
			}else {
				
				int b = stack.pop();
				int a = stack.pop();
				
				if(ch == '*' )  stack.push(a * b);
				if(ch == '+' )  stack.push(a + b);
				if(ch == '-' )  stack.push(a - b);
				
			}
		}
		System.out.println(stack.pop());

	}

}
