
/**
 * Task 1: Print the cubes of integers from 1-10 inclusive.
 * Task 2: Consecutive Odd Integers in Decreasing order from 99 to 1
 * Task 3: Sum of Even Integers 2 to 10 inclusive
 */
public class Task123
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
    double j;
    System.out.println("Cubes of Integers from 1 to 10");
    for(double i=1; i<=10; i++){
        j=Math.pow(i,3);// or just i*i*i
        System.out.println(j);
    }
    
    System.out.println("\n Consecutive Odd Integers in Decreasing order from 99 to 1");
    for(int k=99; k>=1; k--){   
        if(k%2!=0){
        System.out.println(k);
        }   
    }
    
    System.out.println("\n Sum of Even Integers 2 to 10 inclusive");
    int sum=0;
    for(int n=2; n<=10; n+=2){
        sum=sum+n;
    }   
    System.out.println(sum);
    }
}
