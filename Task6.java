package IterationLab;


import java.util.Scanner;

/*
 * Task #6: Determine the nth Fibonacci number in the sequence 1, 1, 2, 3, 5, 8, 13, ...
 */
public class Task6 {

    public static void main(String[] args) {
        int prev1 = 1, prev2 = 1, fib = 1;
        int desiredFibIndex = 0;
        Scanner sc = new Scanner(System.in);
        
        while(desiredFibIndex < 1) {
            System.out.println("Enter the position of the Fibonacci number you want:");
            desiredFibIndex = sc.nextInt();
            if(desiredFibIndex < 1) {
                System.out.println("*** ERROR: The position must be 1 or greater, try again.");
            }
        }
        
        //Only compute the Fibonacci numbers if the position is 2 or higher
        for(int i = 3; i <= desiredFibIndex; i++) {
            fib = prev2 + prev1;
            prev1 = prev2;
            prev2 = fib;
        }
        
        System.out.println("The Fibonacci number at position " + desiredFibIndex + " is " + fib);
        
        sc.close();
    }

}
