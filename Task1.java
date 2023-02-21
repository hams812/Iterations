package IterationLab;
/*
 * Task #1: Add the odd natural numbers from 1 to 2n+1, where n is a user supplied integer greater than one
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) { 
        int userNum = 0;
        int sumOfOdds = 0;
        Scanner sc = new Scanner(System.in);
        
        while(userNum < 1) {
            System.out.println("Enter an integer that is 1 or greater:");
            userNum = sc.nextInt();
            if(userNum < 1) {
                System.out.println("Error: Entered value must be 1 or greater, please try again.");
            }
        }
        
        for(int i = 1; i <= 2 * userNum + 1; i += 2) {
            sumOfOdds += i;
        }
        
        System.out.println("The sum of the odd natural numbers from 1 to " + (2 * userNum + 1) + " is " + sumOfOdds);
        sc.close();
    }
}
