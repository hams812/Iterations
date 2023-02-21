//IterationExplore.java

/**
 * Lab that explores iteration in Java via the "for loop".
 *
 */
public class IterationExplore {
    public static void main( String[] args) {
        int sumInt, squareI;
        
        System.out.println();  //blank line for separation in terminal
        
        //Print a header for a table (the \t prints a tab)
        System.out.println("i\tsumInt\tsquareI");  //table header
       
        sumInt = 0;  //Thie INITIALIZES sumInt to zero
        for(int i = 1; i <= 10; i = i + 1) {
            sumInt = sumInt + i;
            squareI = i * i;
            System.out.println(i + "\t" + sumInt + "\t" + squareI);
        }  //end for
        
        //CREATE A FOR LOOP that computes the factorial of each number from 1 to 10
        
        
    } //end main method
}  //end IterationExplore class