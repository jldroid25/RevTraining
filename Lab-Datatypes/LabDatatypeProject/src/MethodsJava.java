public class MethodsJava {
     //---------Working with Methods -----------
    /*
    A Method:
    is a reusable block of code that is given a specific label.
    A method must be defined outside the Main() Method but within the class.

    Method declarations syntax follows :
    a modifier, return type, method name(paremters), exception {
        method body...
    }
    The return type: 
    is a specified data type that your method will return. 
    It can be any primitive type (boolean, int, char, etc.) 
    or object type (a class). If your method doesn't return anything, 
    you'll use the void keyword.

    Method name: must start with letters, or underscore but no numbers,
    symbols cannot use reserver's Java Words.

    Parameters: are
     input values that your method can accept. 
    You can have any number of parameters that you like. 
    A good rule of thumb though, is if your parameter list is long (above 6 items), 
    then there is probably an easier way to write your method.
    
    To declare a parameter you'll specify the datatype and a name for your parameter. 
    The same rules that apply to variable names apply to parameter names
    */

    //Method example 1

    public static void sayHello(){
        System.out.println("Hello \n");
    }

    // Method Example 2
    public void talk(){
        System.out.println("Inside the talk method \n");
    }

    //Method example 2 with Parameter
    public int getInt(int input){
        return input;
    }

    // Method with multiple params
    public double sum(int x, int y, double z) {
        return x + y + z;
    }


    //Create a random method to display numbers up to 50
    public int randomNum(){

       int m = (int ) (Math.random() * 50 + 1);
       System.out.println("\nFrom RandomNum Method: ");
        return m;
    }

    //more Pracice with String Method 
    public static String stringReturner(){
      return "\n Hello Stranger";
    }

    //Practice to return a boolean method type
    public boolean returnbool() {
        return true;
    }

    //Method to return Pi
    public double returnPi() {
        double d = Math.PI;
        return d;
    }

    // Method to getAlphabets's Array
    public char[] getAlphabetsArray(){

        char[] letters = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h','i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    
        
        return letters;
    }

    // Method to search through parameters to discover which word should come first.
    public String findFirstWord(String a, String b){

        //Convert Strings to array for iterating over
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();

        // Loop through letters of each 
        for (int i =0; i < aArray.length; i++){
            //if letter in a comes before b then return a
            if(aArray[i] < bArray[i]){
                return a;
            }

            //check if letter in b comes before a
            if(aArray[i] > bArray[i]){
                return b;
            }
            //Otherwise they are equal we can move on to the next letter
        }
        //This line is needed in case the above loop doesn't return anything
        return a; //this is for the compiler.
    }


    //-----------------------------------------
    public static void main(String[] args) {
        System.out.println("\n\n");

       // Call your method inside the main() Method
       sayHello();

       //Since our method is not 'static' we must create an object of the class
       // to access the method
       MethodsJava mj = new MethodsJava();
       //calling the talk method
       mj.talk();

       //call our getInt() param method.
       MethodsJava gint = new MethodsJava();
       int value = 12;
       System.out.println(gint.getInt(value));

       //Calling our sum() with multi param
       MethodsJava sumMeth = new MethodsJava();
       int value1 = 2;
       int value2 = 7;
       double value3 = 13.6;
       System.out.println(sumMeth.sum(value1, value2, value3));

       // Calling Random Number method 
       MethodsJava raNum = new MethodsJava();
       System.out.println(raNum.randomNum());

       //Since stringReturner() is 'static' we call without obj creation
       System.out.println(stringReturner());

       //Calling returnbool method
       MethodsJava rb = new MethodsJava();
       System.out.println(rb.returnbool());

       System.out.println("\n");

       //Calling returnPi method
       MethodsJava rp = new MethodsJava();
       System.out.println("\n Pi is: " + rp.returnPi());

       System.out.println("\n");

       //Calling getAlphabetsArray()
       MethodsJava gA = new MethodsJava();
       System.out.println(gA.getAlphabetsArray() );
      
       System.out.println("\n");

       //calling findFirstWord() method
       MethodsJava findWord = new MethodsJava();
       System.out.println(findWord.findFirstWord("Morning", "Good"));


        System.out.println("\n\n");
    }//main  

}//class
