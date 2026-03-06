package _5_Stack;

/*
🔴 Celebrity Problem

A celebrity is a person who:

1️⃣ Everyone knows the celebrity
2️⃣ Celebrity knows no one

Matrix meaning:

M[i][j] = 1 → person i knows person j
M[i][j] = 0 → person i does NOT know person j
🔴 Your Input Matrix
int[][] M = {
 {0,1,1},
 {0,0,1},
 {0,0,0}
};

Matrix meaning:

Person	Knows
0	1,2
1	2
2	none

So person 2 knows nobody, but everyone knows person 2.

👉 Therefore 2 is the celebrity.

*/

public class _I_9_Celebrity_Problem {

	public static void main(String[] args) {
		
		int[][] M = {{0,1,1},{0,0,1},{0,0,0}};
		
		int n = M.length;
		
		int candidate = 0;
		
		for(int i = 1;i<n ;i++) {
			if(M[candidate][i] == 1) {
				candidate = i;
			}
		}
		
		boolean isCelebrity = true;
		
		for(int i =0; i<n; i++) {
			if(i != candidate) {
				if(M[candidate][i] == 1 || M[i][candidate] == 0) {
					isCelebrity = false;
					break;
				}
			}
		}
		if(isCelebrity) {
			System.out.println("celebrity is " + candidate);
		}else {
			System.out.println("Not a celebrity");
		}

	}

}


/*
Celebrity Problem Using Stack (Java)

package _5_Stack;

import java.util.Stack;

public class _I_9_Celebrity_Problem_Stack {

    public static void main(String[] args) {

        int[][] M = {{0,1,1},{0,0,1},{0,0,0}};
        int n = M.length;

        Stack<Integer> stack = new Stack<>();

        // Step 1: Push all people into stack
        for(int i = 0; i < n; i++) {
            stack.push(i);
        }

        // Step 2: Find potential celebrity
        while(stack.size() > 1) {

            int a = stack.pop();
            int b = stack.pop();

            if(M[a][b] == 1) {
                stack.push(b); // a knows b → a not celebrity
            }
            else {
                stack.push(a); // a does not know b → b not celebrity
            }
        }

        int candidate = stack.pop();

        // Step 3: Verify candidate
        for(int i = 0; i < n; i++) {
            if(i != candidate) {
                if(M[candidate][i] == 1 || M[i][candidate] == 0) {
                    System.out.println("Not a celebrity");
                    return;
                }
            }
        }

        System.out.println("Celebrity is " + candidate);
    }
}

*/




