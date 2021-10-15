public class StringMethods {
    public static void main(String[] args) {
        
        // ------Working with Common Java String Methods -------//
        System.out.println("\n\n");
        
        //Create a string variable
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

        System.out.println("\n\n");
    }//main   
}//class