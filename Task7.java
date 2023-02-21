package IterationLab;

import java.util.Scanner;

/*
 * Print the Collatz sequence that begins with a user-supplied integer
 */
public class Task7 {

    public static void main(String[] args) {
        int startNum = 0;
        Scanner sc = new Scanner(System.in);
        
        while(startNum < 1) {
            System.out.println("\nEnter an integer that is 1 or greater to print the Collatz sequence:");
            startNum = sc.nextInt();
            
            if(startNum < 1) {
                System.out.println("*** ERROR: The starting number must be 1 or greater, try again.");
            }
        }
        
        int collatzNum = startNum;
        if(startNum == 1) {
            System.out.println("Collatz sequence: " + 1);
        } else {
            int numElements = 1;
            System.out.print("Collatz sequence:\n" + startNum + " ");
            while(collatzNum > 1) {
                if(collatzNum % 2 == 0) {
                    collatzNum /= 2;
                } else {
                    collatzNum = collatzNum * 3 + 1;
                }
                System.out.print(collatzNum + " ");
                
                //Keep track of the number of elements and print a newline character every 20 elements
                //This is for readability only
                numElements++;
                if(numElements % 20 == 0) {
                    System.out.println();
                }
            }
            System.out.print("\nTotal steps taken to reach 1: "+numElements);
        }
        sc.close();
    }

}
