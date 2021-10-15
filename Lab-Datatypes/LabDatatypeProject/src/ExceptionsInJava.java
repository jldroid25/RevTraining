
import java.util.Scanner;

public class ExceptionsInJava {

    /* 
    
    There 2 types of Exceptions in Java:

    - Unchecked Exception : Error, RuntimeException, IndexOutOfBoundsException
                            Arithmetic Exception, ClassCastException

    - Checked Exception:  Throwable, Exception, IOException, classNotFoundException

    Exceptions in Java has a Try block , 
    a try block must at least has a catch block or a finally block

    FYI: 
      -Stacktrace is a debug message that shows exception that ocurred,
       its location in the code, and other lines of code impacted by the exception.

       - Multiple catch blocks are evaluated top to bottom
       - Only the first catch block applicable to the exception thrown will be invoked
       not subsequen ones.

    - The Throw Clause
      A methos declaration can have a throws clause, 
      indicating that it may throw and will not handle certain exception.

      Good Practice:
      A method with a throws clause is a source for checked exception.
      You must handle exception somewhere if not immediately 
    
    */
    
    /*
    //----------Fix the bug on method 
    public static void getInput() throws EvenNumberException{
        Scanner devScanner = new Scanner(System.in);

        //get user's input
        System.out.println("Enter a number & Press Enter...");
        
        String line = devScanner.nextLine();
        System.out.println("You've entered: " + line);

        //Test if Number is even, throw exception if true
        if(isEven(line)){
            throw new EvenNumberException();
        }

        devScanner.close(); 
        }

        public static boolean isEven(String num){
            //Convert value to number
            int value = Integer.parseInt(num);

            return(value % 2== 0);
        }

        */


    public static void main(String[] args) {

        //--------------------Main----------------------------------
        System.out.println("\n\n");

        // // Exception Practice 1
        // try {
        //     System.out.println("1/0 = " + (1 /0));
        // } catch(ArithmeticException e) {
        //     System.out.println("Caught an Arithmetic Exception");
        //     //Print the stack trace programatically
        //     e.printStackTrace();
        // } finally {
        //     System.out.println("This is the optional \"finally\" block.");
        // }
        // System.out.println("The code has continued on, as normal !");

        
        
        System.out.println("--------------------\n"); 
        
        // //calling getInput()
        // try {

        //     getInput();

        // } catch(EvenNumberException e){
        //     e.printStatckTrace();
        // }

        System.out.println("\n\n");         
    }//main
}//class
