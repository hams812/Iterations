package IterationLab;


/**
 * Computes the GCF of 2 user supplied integers.
 */
import java.util.Scanner;
public class Task5
{
    public static void main(String[] args){
    Scanner keys= new Scanner(System.in);
    System.out.println("Enter 2 positive integers and I will give the Greatest Common Factor between them");
    System.out.println("Enter the 1st number");
    int x=keys.nextInt();
    while (x<0){
        System.out.println("Error: The number should be a positive integer. Try again.");
        x=keys.nextInt();
    }
    System.out.println("Enter the 2nd number");
    int y=keys.nextInt();
    while (y<0){
        System.out.println("Error: The number should be a positive integer. Try again.");
        y=keys.nextInt();
    }
    
    int GCF=0;
        
        for(int i=1;i<=x;i++){
            if(x%i==0 && y%i==0){
                GCF=i;
            }
        } 
    
    System.out.println("The GCF of "+x+" and "+y+" is "+GCF);
}
}
