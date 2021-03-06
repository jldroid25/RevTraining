
public class ControlFlowStatements {

    public static void main(String[] args) {
        System.out.println("\n\n");

        /**
         * Note: all if statements must be decalre inside a method in your code
         * or the main() class method itself.
         * 
         * if(condition) {
          // execute code/logic 1
            
          }  else {
              //execute code/logic 2
          }
         */

        //A basic if statement
        if(true) {
            System.out.println("Inside the If-Statement \n");
        }

        //example 2
        boolean isOn = false;
        //boolean isOn = true;

        if(isOn){
            System.out.println("The variable 'isOne' was True\n");
        }

        //--------------Using if & Else-if() & else statement
        boolean b = true;
        boolean a = false;
        if(a){
            System.out.println("a is true so printing Inside the If-Statement\n");  
        }
          /* Else-If() statement allows your program to specify
           additional conditions to execute blocks of code
           in association with the if-statement.*/  
        else if(b){
            System.out.println("b is true: printing Inside the else if-Statement\n");
        }

        /* Else statement is to specify what needs to happen in opposite
            direction of an if-statement */
        else{
            System.out.println("Inside the else-Statement\n");
        }

        //-----------Working with Switch Statement ------------------//
        
        /*
         A Switch statement specifies cases through which a program will
         enter base on matching a value and executing the associateed statements.

        */

        int value = 7;
        switch(value){
            case 4:
            System.out.println("Case 4");
            break;
            case 5:
            System.out.println("Case 5");
            break;
            case 6:
            System.out.println("Case 6");
            break;
            case 7:
            System.out.println("Case 7");
            break;
            default:
            System.out.println("Default Case ");
            break;
            

        }

        /*

         Conditional Statements with conditional Operators:

         < less than
         <= less than or equal to 
         > greater than
         >= greater than or equal to 
         == equal
         != not equal

         */ 
        /*  Compound operator (short circuit operator "check only left side operation"):
          && logical AND
          ||  logical OR

          The short-circuit operators && (AND) and || (OR) 
          are used to create compound statements and directly relate back 
          to the lesson on boolean logic where we compared a logical
           value to another and retrieved a logical result (true or false)
         
         */


        System.out.println("\n\n");

        // //---------- Array Program if Conditional statements------------------

        // int[] someArray = {1, 2, 3, 4, 5};
        // int temp = 0;
    
        // //Print current array
        // System.out.println("Current Array Elements");
        // for(int x =0; x < someArray.length; x++){
        //     System.out.println(someArray[x]);
        // }

        // //Swap array values
        // temp = someArray[0];
        // someArray[0] = someArray[someArray.length -1];
        // someArray[someArray.length -1] = temp;
        
        // //---To test other conditions
        // //int temp2 = someArray[2]; //just change index
        // //someArray[someArray.length -1] = temp2;

        // //---Lets Print base on if-Else conditions
        // if(someArray[0] == 5 && someArray[4] == 1 ){
        //     System.out.println("\n New Elements After the Swap");
        //     for(int i =0; i < someArray.length; i++){
        //         System.out.println(someArray[i]);
        //     }

        // } else if(someArray[0] !=5 && someArray[4] != 1) {
        //     System.out.println("failed different value array \n");

        // } else {
        //     System.out.println("\n Swap unsuccesful check the code");
        //     for(int i =0; i < someArray.length; i++){
        //         System.out.println(someArray[i]);
        //     }
        // }
        // System.out.println("\n\n");

        // //-------------------------- end Program 

    }// main()
} // class