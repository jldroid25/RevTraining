public class MathematicalOperators {
    public static void main(String[] args) {

        System.out.println("\n\n");

        // Performing some basic math Java Operators

        // Defime some variables
        int x = 5;
        int y = 3;
        int z;
        float f = 3.6f;
        int i = 22;
        //double i = 22;;
        //long i = 22;

        // Simple Addition
        z = x + y;
        System.out.println(" addition Z = " + z);

        // Simple Substraction

        z = x - y;
        System.out.println("\n subst z = " + z);

        // Simple multiplication
        z = x * y;
        System.out.println("\n  Multp z = " + z);

        // Simple Division
        z = x / y;
        System.out.println("\n div  z = " + z);

        // Simple Modulus
        z = x % y;
        System.out.println("\n modulus z = " + z);

        // float vs int
        /* the "(int)" is a cast , 
        casting allow us to store one datatype  into another.
        Note: Casting only works on numbers not boolean datatpe.
         */
        //int result = (int) f + i;
        
        // int cast for long datatype "(int)"
        //long result = (int) f + i;
        
        // No cast needed double can support precision of the sum for float & int
        double result = f + i;

        System.out.println("\n flot & int for var result= " + result);

        System.out.println("\n\n");

    }
}
