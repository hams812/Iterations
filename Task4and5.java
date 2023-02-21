
/**
 * Task 4: Print each character of the String on a separate line.
 * Task 5: Print the factors of a user entered number.
 * ExtensionTask5: Print the Prime Factors of the same user entered number.
 */
import java.util.Scanner;
public class Task4and5
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) {
        String str = "Super fun";
        
        int length = str.length();
        System.out.println("Length: " + length);
            for(int i=0;i<=(length-1);i++){
        System.out.println(str.charAt(i));
        }
        
        Scanner keys=new Scanner(System.in);
        System.out.println("Enter the number you want to get the factors of:");
        int num=keys.nextInt();
        System.out.println("The factors of the number "+num+" are:");
            for(int j=2;j<=num/2;j++){
                if(num%j==0){
                    System.out.println(j);
                }
            }
            
        System.out.println("The Prime Factors of the number "+num+" are:");
        for(int j=2;j<=num;){  
                if(num%j==0){
                System.out.println(j);
                num=num/j;
                }
                else{
                    j++;
                }
                
        }
    }
            
}
               
    
