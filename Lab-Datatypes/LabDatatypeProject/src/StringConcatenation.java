public class StringConcatenation {
    
    public static void main(String[] args) {
        System.out.println("\n\n");

        //Practicing String Concatenation
        String beginning = "Hello ";
        String end = "World";
        String combo = beginning + end;
        System.out.println(combo);

        //------adding a primitive (ie varriable) to a string
        //Create a long var datatype & print its value 
        //concatenated to a string to the console
        long l = 203L;
        System.out.println("THe value of l: " + l);

        //------adding a primitive to the biginning of a string
        boolean b = true;
        System.out.println(b + ": is 'b\'  current value");
        //or add it to the middle of a string
        System.out.println("the value of 'b\' is: " + b + " we are OK \n");

        //------ Order Matters in String Concat
        int x = 2;
        int y = 3;

        //We will get string concat not correct math 
        System.out.println("The sum of x and y is  " + x + y ); //23

        //Parenthesis () is give The correct math calculation
        System.out.println("Now the new sum of x and y is  " + (x + y) ); //5

        //since x + y  is math order first we will get correct math calculation
        System.out.println(x + y + " is the sum of x and y"); //5

        /*
        A key point to remember here is that order matters when evaluating 
        the + operator to either be a String concatenation statement or
        a mathematical sum. An easy rule of thumb is that whatever is 
        on the left-hand side of the + operator determines whether 
        it will be a string concatenation or a sum.

        If the value on the left-hand side is a String, then the operation is 
        a String concatenation and the resultant value will be a String. 
        If, however, the operand is a number (short, int, double, etc.), 
        then the two will produce a mathematical sum.

        */

        System.out.println("\n\n");

    }
}
