//This program tells us if the user entered number is Prime or not

import java.util.Scanner;

public class PrimeTime
{
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        
        System.out.println("Enter a positive integer to test primeness (negative to exit)");
        int num = keys.nextInt();
        while(num > 0) {
            boolean isPrime = true;
            
            //Determine if the number is prime
            if(num == 1 || (num > 2 && num % 2 == 0)) {
                isPrime = false;
            } else {
                for(int i = 3; i <= num / 2; i++) {
                    if(num % i == 0) {
                        isPrime = false;
                        break;  //this kills the for loop when a factor is found
                    }
                }
            }
            
            //Output the result
            String result = " is not ";
            if(isPrime) {
                result = " is ";
            }
            System.out.print("The number " + num + result + "prime.\n");
            
            System.out.println("Enter another number (negative to exit)");
            num = keys.nextInt();
        }
        keys.close();
    }
}
