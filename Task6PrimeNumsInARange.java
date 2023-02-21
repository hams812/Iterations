import java.util.Scanner;
//Task 6: Takes starting and ending number from the user and prints all the prime numbers in that range

public class Task6PrimeNumsInARange
{
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        System.out.println("Enter the start of your range:");
        int start=keys.nextInt();

        System.out.println("Enter the end of your range:");
        int end=keys.nextInt();
        
        
         boolean isPrime;
        
        for(int num=1;num<=20;num++){

            if((num==2)||((num!=1)&&(num%2!=0))){//if num is 2 or an odd num sets isPrime to be true
                isPrime = true;
                //Determines if the number is prime
                for(int i = 2; i <= num/2; i++) {
                    if(num % i == 0) {
                        isPrime = false;
                        break;
                    }   
                 }
            }
            else{
                isPrime=false;
            }
        
            if(isPrime)
                System.out.println(num);
                
        }  
            
    }
        
}

