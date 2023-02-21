package IterationLab;
import java.util.Scanner;

/*
 * Task #2: Determine if a user-supplied year is a leap year
 */
public class Task2 {

    public static void main(String[] args) {
        int testYear = 0;
        Scanner sc = new Scanner(System.in);
        
        while(testYear <= 0) {
            System.out.println("Enter an A.D. year to determine if it is a leap year or not:");
            testYear = sc.nextInt();
            if(testYear <= 0) {
                System.out.println("*** Error: The year must be greater than zero");
            }
        }
               
        if((testYear % 4 == 0 && testYear%100!=0) || testYear % 400 == 0) {
            System.out.println(testYear + " is a leap year.");
        } else  {
            System.out.println(testYear + " is not a leap year.");
        }
        
        /*if(testYear % 4 != 0 || (testYear % 100 == 0 && testYear % 400 != 0)) {
            System.out.println(testYear + " is not a leap year.");
        } else if(testYear % 4 == 0 || testYear % 400 == 0) {
            System.out.println(testYear + " is a leap year.");
        }*/
        
        sc.close();
    }

}
