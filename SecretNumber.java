
/**
 * I will find your SecretNumber.
 * Can you find mine?
 */
import java.util.Scanner;
import java.util.Random;
public class SecretNumber
{
    public static void main(String[] args){
                
        System.out.println("Think of a number.");
        System.out.println("Multiply it with 4.");
        System.out.println("Add 10 to it.");
        System.out.println("Divide by 2.");
        System.out.println("Subtract 5 from it.");
        System.out.println("Now enter your answer.");
        
        Scanner keys=new Scanner(System.in);
        double x= keys.nextDouble();
        double y;
        
        y=(((x+5)*2)-10)/4;
        
        System.out.println("If you did the Math correct,the number you thought of is "+y+":)");
        System.out.println("\n");
        
        System.out.println("Now I will think of an integer between 1 to 5 and you try and guess it");
        
        Random r=new Random();
        int mysecret=r.nextInt(5-1)+1;
        int guess=mysecret-1;
        
        while(guess!=mysecret){
        System.out.println("Enter your guess");
        guess=keys.nextInt();
        if(guess!=mysecret)
        System.out.println("Oops!Try again..");
        }
            
        if(guess==mysecret){
            System.out.println("Yay!You guessed it correct!)");
        }
        
        
    }
}
