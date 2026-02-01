package _3_Strings;

import java.util.Scanner;

public class _D_4_Count_Vowels_Consonants {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.next();
		
		int vowels = 0;
		int consonants = 0;
		for(int i=0;i< str.length();i++) {
			char ch = str.charAt(i);
			
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
				vowels++;
			}else {
				consonants++;
			}
			
		}
		System.out.println("vowels are: " + vowels);
		System.out.println("consonants are: " + consonants);

		sc.close();
	}

}

/*

//////////////////optimised
import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine().toLowerCase(); // convert once

        int vowels = 0;
        int consonants = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(Character.isLetter(ch)) {   // only letters
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }
}
*/

/*

👉 This line:
String str = sc.nextLine().toLowerCase();


It is actually doing TWO things in one line:

1️⃣ Taking input (full line)
sc.nextLine()


👉 Reads the whole line including spaces.

Example input:

HeLLo World


Now:

sc.nextLine() = "HeLLo World"

2️⃣ Converting it to lowercase
.toLowerCase()


👉 Converts all characters to small letters.

So:

"HeLLo World" → "hello world"





⭐ Even cleaner using switch (interview style)
if(Character.isLetter(ch)) {
    switch(ch){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            vowels++;
            break;
        default:
            consonants++;
    }
}


👉 Interviewers LOVE this version 😄

*/