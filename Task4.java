package IterationLab;

/*
 * Task #4: Determine if a user-entered integer is prime
 */

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) { 
		int userNum = 0;
		Scanner sc = new Scanner(System.in);
		boolean isPrime = true;
		
		while(userNum < 1) {
			System.out.println("Enter a positive integer to determine if it is prime:");
			userNum = sc.nextInt();
			if(userNum < 1) {
				System.out.println("*** ERROR: The number must be 1 or greater, try again.");
			}
		}
		
		if(userNum == 2) {
			System.out.println("The number " + userNum + " is prime.");
		}
		else if(userNum == 1 || userNum % 2 == 0) {
			System.out.println("The number " + userNum + " is not prime.");
		} else {
			for(int i = 3; i <= userNum / 2; i += 2) {
				if(userNum % i == 0) {
					isPrime = false;
				}
			}
			if(isPrime) {
				System.out.println("The number " + userNum + " is prime.");
			}
		}
		sc.close();
	}
}
