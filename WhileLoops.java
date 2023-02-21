/* Lab 6: While Loops
*/
import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        //Task 1: Translate the following for loop into a while loop.
        /*
            for(int j = 1; j <= 2007; j++) {
                if(j % 3 == 1) {
                    System.out.println(j);
                }
            }
         */
        System.out.println("\n*** TASK 1 ***\n");
        int j = 1;
        while(j <= 2007) {
            if(j % 3 == 1) {
                System.out.println(j);
            }
            j++;
        }
        
        //Task 2: Translate the following while loop into a for loop.
        /*
            int a = 1;
            int i = 10;
            while(i > 0){
                a = a * i;
                i--;
            }
            System.out.println(a);
         */
        System.out.println("\n*** TASK 2 ***\n");
        int a = 1;
        for(int i = 10; i > 0; i--) {
            a = a * i;
        }   
        
        System.out.println("The factorial of 10 is " + a);
        
        //Task 3: gets an integer from the user and prints out all the multiples of 3 or 5 that are
        //less than the user’s integer
        //Task 4: compute the sum of the multiples of 3 or 5 that are less than the user's integer
        System.out.println("\n*** TASKS 3 & 4 ***");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer and I will print all multiples of 3 or 5 less than it:");
        int num = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i < num) {
            if(i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
                sum += i;
            }
            i++;
        }
        System.out.println("\nThe sum of the multiples is " + sum);
        
        //Task 5: Get an integer from the user and print out the sum of its digits
        System.out.println("\n*** TASK 5 ***\n");
        System.out.println("Enter another integer and I will sum its digits:");
        num = sc.nextInt();
        int onesDigit, sumDigits = 0;
        while(num > 0) {
            onesDigit = num % 10;
            sumDigits += onesDigit;
            num = num / 10;
        }
        System.out.println("The sum of the digits is " + sumDigits);
        
        //Task 6: Implement a menu of three items that runs continuously
        int menuSelection = 0;
        double x;
        System.out.println("\n*** TASK 6 ***\n");
        while(menuSelection != 3) {
            System.out.println("Select 1,2 or 3 from below.");
            System.out.println("1) Square a number");
            System.out.println("2) Cube a number");
            System.out.println("3) Quit");
            menuSelection = sc.nextInt();
            
            if(menuSelection == 1) {
                System.out.println("Enter a number to square:");
                x = sc.nextDouble();
                System.out.println(x + " squared = " + x * x);
            } else if(menuSelection == 2) {
                System.out.println("Enter a number to cube:");
                x = sc.nextDouble();
                System.out.println(x + " cubed = " + x * x * x);
            }
        }
        System.out.println("Thanks for playing!");
        
        //Task 7: Division by subtracting
        System.out.println("\n*** TASK 7 ***\n");
        System.out.println("Division n/d by subtracting...");
        int n, d, diff, numSubs = 0;
        System.out.println("Enter the dividend, n:");
        n = sc.nextInt();
        System.out.println("Enter the divisor, d:");
        d = sc.nextInt();
        
        if(n == d) {
            System.out.println(n + "/" + d + " = 1");
        } else if(n % d == 0) {
            System.out.println(n + "/" + d + " = " + n / d);
        } else if(n < d) {
            System.out.println(n + "/" + d);
        } else {
            diff = n - d;
            numSubs = 1;
            while(diff > d) {
                diff -= d;
                numSubs++;
            }
            System.out.println(n + "/" + d + " = " + numSubs + " " + diff + "/" + d);
        }
        
        //Task 8: Knock, knock. Who's there?
        System.out.println("\n*** TASK 8 ***\n");
        String response = "";
        sc.nextLine();
        while(!response.equalsIgnoreCase("orange")) {
            System.out.println("Knock, knock. Who's there?");
            response = sc.nextLine();
            if(response.equalsIgnoreCase("banana")) {
                System.out.println("Banana who?");
            } else if(response.equalsIgnoreCase("orange")) {
                System.out.println("Orange you glad you didn't type banana?");
            } else {
                System.out.println("You aren't playing my game very well.");
            }
        }
        System.out.println("\n*** ALL DONE ***");

        sc.close();
    }
}