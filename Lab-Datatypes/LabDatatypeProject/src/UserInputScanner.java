import java.util.Scanner;

public class UserInputScanner {
    // ----------Getting User Input with Scanner Java Class------

    /*
    Scanner: 
    is a class that organized in the java.util package,
    and can be used to read input from different sources.

    - We can use Scanner to process data from string variables, System.in,
      Streams, or from files stored on your computer.

    - You can also use Scanner to parse data using a delimeter.

    - Scanners' most common Methods are 'Next()' and hasNext(),
      and their variations ( NextInt(), nextShort(), nextLine() ..) 
      to iterate through data.

    - hasNext() retuns a boolean true if more token(info to process)s are available from the input.
    - next() moves the Scanner through the data one value, and returns the last 
      observed value. Or to retrieve the subsequent data point.

    */

    /*

    //method that uses a Scanner to parse any input from the console (System.in) 
    //and prints out the number of vowels in the line.
    public static void printVowels(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please typed in a line and hit Enter. ");

        //Grab user's entire input
        String line = scanner.nextLine();
        //create counter
        int count = 0;

        //To iterate through input 
        for (int i =0; i < line.length(); i++){

            //store each index in this variable
            char letter = line.charAt(i);

            //if there is a vowel in var , continue until no more
            if(isVowel(letter)) {
                count++;
            }
        }
        System.err.println("The number of vowels: " + count);
        scanner.close();//close 
    }

    //check is input is a vowel
    public static boolean isVowel(char letter){
        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
            return true;
        }
        return false;
    }

    */
    public static void mover(){
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("Please type in one of the following: ");
        System.out.println("* 1 -  Move Right");
        System.out.println("* 2 -  Move Left ");
        System.out.println("* 3 -  Move Up ");
        System.out.println("* 4 -  Move Down");
        System.out.println("* q -  Exit Program");

        while(scanner.hasNext()){

            String input = scanner.next();

            switch(input) {
                case "1": {
                    System.out.println("Moving Right"); break;
                }
                case "2": {
                    System.out.println("Moving Left"); break;
                }
                case "3": {
                    System.out.println("Moving Up"); break;
                }
                case "4": {
                    System.out.println("Moving Down"); break;
                }
                case "q": {
                    System.out.println("Exit Program"); exit = true; break;
                }
                default: {
                    System.out.println("Try Again. Acceptable input: [1 - Move Right , 2 - Move Left, 3 - Move Up, 4 - Move Down, q - Exit Program] "); break;
                }
            }
            if(exit){
                System.out.println("Exiting Program");
                break; 
            }
        }
        scanner.close();
    }

    //---------------------------Main-----------------------


    public static void main(String[] args) {
        System.out.println("\n\n");

    
        /*
        //import & Define a Scanner object 
        //System.in is an inputStream that we can use to read text from the console.
        Scanner devScanner = new Scanner(System.in);

        String result ="";

        System.out.println("Please type in a line and hit Enter");
        //grab user's entire input & save it in variable result
        //note: if used next() here each word would be considered separately
        result = devScanner.nextLine();
        
        //always use the close() method with scanner 
        //to Deallocate the unneeded resources.
        devScanner.close();
        //Let's print 
        System.out.println("\n You Typed in: " + result);
        System.out.println("\n");
        
        */
   
        /*

        //-----Using Scanner hasNext() method

        //setup some string data
        String numbers = "1 2 3 4 5 7 9";

        //create scanner over string
        Scanner scanner = new Scanner(numbers);

        //iterate over data
        while(scanner.hasNextInt()) {
            System.out.print(scanner.nextInt());

            //print a comman if more numbers are available
            if(scanner.hasNextInt()){
                System.out.print(",");
            }
        }
        //As always close scanner to deallocate resources
        scanner.close();

        */

        //calling PrintVowels()
        //printVowels();

        //Calling mover()
        mover();

        System.out.println("\n\n");
    }//main
    
}//class
