package IterationLab;


import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		int userNum = 0;
		int origUserNum;
		Scanner sc = new Scanner(System.in);
		
		while(userNum <= 0) {
			System.out.println("Enter a positive integer to determine if it is a palindrome:");
			userNum = sc.nextInt();
			if(userNum <= 0) {
				System.out.println("*** ERROR: The number must be greater than zero, try again.");
			}
		}
		
		origUserNum = userNum;
		int onesDigit;
		int reversedNum = 0;
		while(userNum > 0) {
			onesDigit = userNum % 10;
			reversedNum = reversedNum * 10 + onesDigit;
			userNum /= 10;
		}
		
		if(origUserNum == reversedNum) {
			System.out.println(origUserNum + " is a palindrome.");
		} else {
			System.out.println(origUserNum + " is not a palindrome.");
		}
		sc.close();
	}

}

