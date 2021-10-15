import java.util.concurrent.CyclicBarrier;

public class LoopsJava {
    public static void main(String[] args) {
        System.out.print("\n\n");

        //--------------Practicing with Java Loops
    
        /* 
        While Loop: 
        Will repeat a block of code based on a condition; it essentially tells
        the program to start back up at the top from where its defined.

         -- Syntax --
         //initial desired variable

        //The actuall while-loop
         while(condition) {
             ......
         }

        */
        //While loop example to print numbers 1 to 5
        //This  infinate loop: <<<< AVOID THIS AT ALL TIME >>>

        /* 
        
        The only real way to handle infinite loops is to recognize them beforehand 
        in code. Make sure that your code at some point changes the condition, 
        so that your while loop will eventually stop. 
        
        Otherwise, you’ll have to terminate your program when it reaches a point 
        of infinitely looping and identify what block caused it.
        */

        // while(true){
        //     //recall: 1 is true, 0 is false
        //     System.out.print(1);
        // }

        /*
        //A better solution:
        //create a variable count ouside the loop
        int counter = 1;

        //Define loop with desire condition
        while(counter < 6){
            //The results 1...5
            System.out.print(counter + "\n");

            //1st: update/increment the counter by 1 in order to print the values 1 ... 5
            //2nd: To know if we had exited the loop or have infinate loop.
            counter++;
        }
        System.out.println("\n");

        boolean on = true;
        while(on){
        System.out.println("inside the while loop");
        //Now set variable to false to stop the loop/prevent infinate loop
        on = false;
        }

        //Challenge create a loop to print numbers 1 to 10
        int counTen = 1;

        while(counTen < 11){
            System.out.println(counTen + "\n");
            counTen++;
        }
        System.out.print("-----------\n");

        //Challenge: print even numbers from -100 to 100
        int countHundred = 100;

        //Condition needs to be greater-equal than lower number
        while(countHundred >= -100){
            //print it
            System.out.println(countHundred);
            //Keep decreasing counter by 2 while looping
            //countHundred = countHundred - 2;
            countHundred -= 2; //same as above
        } 
        
        */
        
        /*
         -------------Do-While Loop:
         Difference between Do-while-Loop & While-Loop:
         
         Do-While-Loop guarantee to execute a statement at least once
         regardless a condition is true or not  before exiting.
         A While-Loop will only execute a statement only if that condition is true.

         Note: all conditions that can cause infinate loop in while-loops
         are also true for do-While-loop.

         syntax:
         do {
             //Statements to run
         } while(condition);
        */

        /*
        // Do while loop example 1:
        do {
            //Run this statement at least once
            System.out.println("1 + 1 = 2");

        //Loop condition is set/evaluate to false
        } while(false);

        System.out.println("--------------\n");

        //Challenge: create a do-while-loop to calculate 
        //the sum of an increase set of numbers
        
        //initial desired variable
        int value = 1;

        do {
            //Statement to run at least once
            System.out.println(value + "+" + value + "=" + (value + value));

            //to update & let us know if loop stop or infinate
            value++;
        }             
        //Loop condition
        while(value < 11);
        
        System.out.println("--------------\n");

        boolean on = false;

        do{
            System.out.println("inside Do while Loop");

        } while(on);

        System.out.println("--------------\n");

        int oddNum = 1;

        do {
            System.out.println(oddNum);
            //oddNum = oddNum + 2;
            oddNum += 2;
        } 
        while(oddNum < 50);

        System.out.println("--------------\n");

        //Challenge do-While-Loop to print alpahbets letters
        char letter = 'a';
        char end = 'z';

        do {
            System.out.println(letter);
            letter++;

        } while(letter <= end);
        
        System.out.print("\n\n");

        */

        /* 
        For-Loop:
        Is a structure used to repeat a block of code.
        A Foor-Loop manage 3 statements that control how it operates.
        Forr-loops are naturaly use with arrays.

        syntax:
        //declare statement, condition, counter
        for(int x = 2; x < 10; x+=2){
         //Do Something
        }
        */

        /*
        // For-Loop print number 2 to 8 Example 1 :
        for(int count = 2; count < 10; count +=2){
            System.out.println(count);
        }

        System.out.println("\n\n");

        System.out.println("------------\n");

        //Using a for-Loop on an array
        int[] myArray = {1,2,3,4,8,11,22,45,66};

        //since array starts a zero, set counter to 0
        //condition (using array's length property)
        // increment/move inside array 1 element by 1
        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }

        System.out.println("-------\n");

        //Challenge 2: For-loop array fo 10 bites
        int[] arrTwo = {1,2,3,41,52,61,76,81,97,128};

        for(int x = 0; x < arrTwo.length; x++){
            System.out.println(arrTwo[x]);
        }

        System.out.println("-------\n");

        String[] cities = {"Atlanta","Charlotte","Dallas","Los Angeles",
         "New York", "Orlander", "Philadelphia","Seattle"};

        for(int a = 0; a < cities.length / 2;  a++){
            //Store temporary value
            String city = cities[a];
            
            //Swap the elements from front to back
            cities[a] = cities[cities.length -1 - a];
            cities[cities.length-1 - a] = city;
        }

        //Print the result 
        for (int i = 0; i < cities.length; i++){
            System.out.println(cities[i] );
        }

        */

        /*
        Nested statement:
        is one that resides within the scope of another.
        A statement within another
        */

        int precipitation = 0;
        int waterOutput = 0;
        int temperature = 80;

        if(precipitation < 20){

            if(temperature <= 75){
                waterOutput = 30;
            } else {
                waterOutput = 45;
            }

        } else if(precipitation < 31){
            if(temperature <= 75){
                waterOutput = 10;
            } else {
                waterOutput = 25;
            }

        }  else if(precipitation < 56){
            if(temperature <= 75){
                waterOutput = 0;
            } else {
                waterOutput = 15;
            }
        }  else { 
            waterOutput = 0;
        }
        System.out.println("The Water output should be " + waterOutput + "\n");
    
        
    //--------------------------------
        
        int[] arr1 = {1, 2, 3, 4,5};
        int[] arr2 = {102, 345, 910, 45, 69};

        //Nested for-loops (loop within loop) to print both arrays elements
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                //It is here to print both arrays values
                System.out.println(arr1[1] * arr2[j]);   
            }
        }
        //Refering to any loop indexes outside their scope will give an error

    System.out.println("-------\n");

    String[] firstName = {"James", "Marie", "Nordic"};
    String[] lastNAme = {"Lemaire", "Antoinette", "Volkan"};

    for(int firstN = 0; firstN < firstName.length; firstN++){

        //Get CurrentFirstName
        String CurrentFirstName = firstName[firstN];

        for(int lastN =0; lastN < lastNAme.length; lastN++) {

            //Get CurrentLastName
            String currentLastName = lastNAme[lastN];

            System.out.println(CurrentFirstName + " " + currentLastName);
        }
    }
    System.out.println("-------\n");

    }//main
}//class
