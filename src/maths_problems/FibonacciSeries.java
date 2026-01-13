package maths_problems;

//FIBONACCI SERIES  (Print N terms)

import java.util.Scanner;
class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your number");
        int n = sc.nextInt();
        
        int first = 0;
        int second = 1;
        
        if(n>=1){
            System.out.println(first + " ");
        }
        if(n>=2){
            System.out.println(second + " ");
        }
        
        for(int i=3 ; i<=n ;i++){
            int next = first + second ;
            
            System.out.println(next + " ");
            
            first = second;
            second = next;
             
            
        }
        sc.close();;
        
    }
}