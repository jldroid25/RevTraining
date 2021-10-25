import java.util.Scanner;

public class CodeChallenge1 {


   /*
   Write a method that takes a string and only prints the volwes 
   strings entered . 
   
   */
    public static String printVowels(String s){

        String userInput = s;
        //To iterate through input 
        for (int i =0; i <  userInput.length(); i++){

            //store each index in this variable
            char letter =  userInput.charAt(i);

            //if there is a vowel in var , continue until no more
            if(isThisAVowel(letter)) {
                System.out.println(letter);
            }
        }
        //System.out.println(userInput);        
        return userInput;
    }
    //check is input is a vowel
    public static boolean isThisAVowel(char letter){
        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        
        System.out.println("\n\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please typed in  a Word ");

        //Grab user's entire input
        String userString = scanner.nextLine();
        printVowels(userString);
        scanner.close();//close 

        System.out.println("\n\n");
    }//Main
  }//class