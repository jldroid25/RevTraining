public class ExceptionDataFile {

    // Here we have unchecked Exception and  should never be coded in your codes.
    // Your codes should handle such exceptions Programatically with if-else etc
    // & not with TRY-CATCH Block.
    //However, you can use TRY-CATCH block for Chekked Exception,
    //ie fileException, databaseException things the developer have no 
    // control over 
    public static void myExceptionFunctionExample (int number1, int number2 ) {
        int result = 0;
        /*
        Result  = num1 / num2; // will throw an Exception
        ---------Provide a Try-Catch block to handle with Exception
        Note: code will jump to Try-Catch Block only if an Exception 
        is triggered Otherwise it will skip the Try-Catch Block
       */
       try {
        result  = number1 / number2;

        //What will happen to this line after Exception is thrown?
        // If Exception is raise this line will not be executed 
        //code will skip to catch block below
        result  = number2 / number1;

        /* Always Make sure the right Exception is past here . 
        (Correspond to the thrown Exception i, e if Arithmetic you must the respective one.
        */
        } catch (ArithmeticException ae) {
            System.out.println("Division by zero not allowed on this programs");
            result  = number1 / number2;
        }
        // Yes multiple catches are allowed in Try-Block but subsequent 
        //catches must be different from previous ones
        catch (NullPointerException np) {
            System.out.println("\n No Null values allowed Buddy !");
            System.out.println("\nYes multiple catches are allowed in Try-Block\n" 
            + ",but subsequent catches must be different from previous ones");

          } 
          //This is a non-Specific Exception , must be place below specific one
          // It will cause code not to reach specific catch above.
          catch (Exception e) {
              System.out.println(e.getMessage());
          }
          
          finally {
            System.out.println("\n This is inside 'Finally' & will be executed Exception or not\n\n");
            // --- The type of code to put her (Good Practice)
            //This is a good place to clone any connecttion open oon your Try-block
            //send some data to a file
            //Always close whatever you open once you done
          }
          /*
           although we can have an Empty Try-Catch block never ever  do it .
           It is poor programing practice , if an expection does occur on the program
           and was missed by other specific try-catch know will ever know an exception was thrown
          try {
              
          } catch (Exception e);
          */
          
        //Again If no Exception is triggered code will jump here directly
        System.out.println("\n-------Basic Calculator Program -----"); 
        System.out.println("Answer is : " + result + "\n");
        System.out.println("\n Thank You Bye … \n");  
       }

       //--------- Methods to using Throw vs Throws-------//

       //This method use throw to Launch an Explicit exceptional 
       public static void checkNumber (int etfValue){
           if(etfValue <= 1) {
            System.out.println("\n\n");
               throw new ArithmeticException("ETF Value must be at least 2");    
           } else {
               System.out.println("You can start trading ETF on the Market: " + etfValue);
               System.out.println("\n\n");
           }
       }
       //This method use throws similarily to Try-Catch Block Clause.
       /** 
        * is use to inform the caller that this method is capable of throwing an 
        exception please handle it.
       */
       public static int goodDivisionMethod(int number1, int number2 ) throws ArithmeticException, NullPointerException{
           int result = number1 / number2;
           return result;
       }
}