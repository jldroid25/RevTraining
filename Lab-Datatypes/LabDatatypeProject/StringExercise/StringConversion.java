public class StringConversion {

    public static void main(String[] args) {

      //----------------Create a string variable
      String str = "Hello";

      //Practice with the equal() method
      System.out.println(str.equals("Hello")); //true 
      System.out.println(str == "Hello"); //true, on same memory addr as above 
  
      //Note:  Diff result if string is created with 'new' Keyword
      // due to new address allocated in memory for the byte
      String s = new String("Hello");
      System.out.println(str == s ); //False
  
      //When making string comparison you sould always use dot equals .equals() 
      System.out.println(str.equals(s)); //true
  
      System.out.println("------------------ \n");
  
      //Practicing with length() Methods to return 
      // the size of the associated String
  
      String howlongString = new String("CodingJavaPrep");
  
      //Using the length method
      System.out.println("New string has : " + howlongString.length() + " Characters\n ");
  
      System.out.println("------------------ \n");
      
      /* 
      Indexof() :
      will treat the String as an array of characters
      (Think of 'char' datatype) and return the index of the specified
      character.
      If the character is not within the String, then it will return -1.
      */
      System.out.println("'J\' location index is: " + howlongString.indexOf("J"));
      
      //Other common methods:
      System.out.println(howlongString.toUpperCase());
      System.out.println(howlongString.toLowerCase());
      System.out.println(howlongString.charAt(6));//J
      //Compare existing string with the one being pass here
      System.out.println(howlongString.equalsIgnoreCase("CodingJavaPrep"));//True
      //Display characters from index 0 to 5 (not including 6)
      System.out.println(howlongString.substring(0, 6));
  
      // --------- More String ----------//
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

    //------------------Convert String to Integer 
    System.out.println("\n");
    String number59 = "59";
    System.out.println("String value: " + number59);// Before conversion
    //int fiftyNine = (int) Integer.parseInt(number59);
    @Deprecated
    Integer fiftyNine = new Integer(number59); 
    System.out.println("Succesfully converted '59' string to integer :" + fiftyNine);
    System.out.println("\n");

    //Convert String to float 
    System.out.println("\n");
    String numberFloat = "45.6";
    System.out.println("Before conversion");
    System.out.println(numberFloat);// Before conversion
    float fortyFivePointSix = (float) Float.parseFloat(numberFloat);
    System.out.println("Succesfully converted '45.6' string value to a float :" + fortyFivePointSix);
    System.out.println("\n");

    //Convert String to Double
    System.out.println("\n");
    String numberDouble = "72.60";
    System.out.println("Before conversion");
    System.out.println(numberDouble);// Before conversion
    double sevenTwoSixZero = (double) Double.parseDouble(numberDouble);
    System.out.println("Succesfully converting '72.60' string value to a double :" + sevenTwoSixZero);
    System.out.println("\n");


  

    }
}
