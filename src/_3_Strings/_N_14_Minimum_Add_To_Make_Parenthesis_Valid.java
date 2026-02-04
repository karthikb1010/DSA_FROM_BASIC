package _3_Strings;

import java.util.Scanner;
import java.util.Stack;

public class _N_14_Minimum_Add_To_Make_Parenthesis_Valid {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the parenthesis string");
		String s = sc.next();

		Stack<Character> stack = new Stack<>();

		for(int i =0;i< s.length();i++) {
			char ch = s.charAt(i);

			if(ch == '(') {
				stack.push(ch);
			}else {
				if(!stack.isEmpty() && stack.peek() =='(' ) {
					stack.pop();
				}else {
					stack.push(ch);
				}
			}
		}
		System.out.println("The length of parenthesis to be added " + stack.size());
		sc.close();
	}

}
