/**
 * Perform sum,average, maximum and minimum of some user entered numbers.
 */
import java.util.Scanner;
public class Challenge{
    
    public static void main(String[] args) {
        Scanner keys= new Scanner(System.in);
        System.out.println("How many numbers do you intend to enter?");
        int num=keys.nextInt();
        double sum=0;
        double maximum=0,minimum=0;
        System.out.println("Enter the numbers one by one.");
        
        for(int x=1;x<=num;x++){
            System.out.println("Enter number "+x+":");
            double n1= keys.nextInt(); 
            sum=sum+n1;  
            maximum=Math.max(maximum,n1);
            minimum=Math.min(minimum,n1);   
            if(minimum==0)
               minimum=n1;
        }
        double avg=sum/num;
        System.out.println("The sum of the numbers you have entered is: "+sum);
        System.out.println("The average of the numbers you have entered is: "+avg);
        System.out.println("The maximum of the numbers you have entered is: "+maximum);
        System.out.println("The minimum of the numbers you have entered is: "+minimum);
    }
}    
        
    