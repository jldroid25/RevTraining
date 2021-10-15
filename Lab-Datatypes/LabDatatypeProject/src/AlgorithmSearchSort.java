public class AlgorithmSearchSort {

    /* 
    - Searching an unsorted set is (almost) always an O(n)
     or linear (depends on how big/small n is ) operation .

     - Search Algorithm thus target an O(log(n)) or O(1) complexity.

     - To achieve this, most algorithms require sorted data.

    
     ---------------Searching Algorithm:
     Simples Kind of search is 'Binary Search'.
     
    <<< Binary Search: >>>
     runs in O(Log(n)) time.
     It works by comparing target to middle element of sorted collection.
       to determine if that element is greater or less than the target.
      
    - If midpoint is greater target, move the right endpoint to the old midpoint, 
       and recalculate mid.

     - if midpoint is less, move the left endpoint to the old midpoint,
       and recalculate mid.


   -------------- Sorting Algorithm:
    <<< Sorting Algo >>>:
     is more difficult than seaching because programs needs to look
    for every elements in order to know where each are.
    So it's hard for a sorting algorithm to get as low as O(n)

    Bubble Sort:
    - Starting at the first elment, 
      compare every other element to the first(i = 0)

      - if the value at index n is less than the first element, (n < i) swap them
      - When the end of the array is reached, move the target to the next element
        and repeat (i = i + 1)

    - Smaller values "bubble up" to the front of the array.

    Merge Sort: 
    provides a way to sort algorithm faster 

    - Runs in O(n* log(n)) time, O(n) additional memory
    - Divide a collection log(n) times, perform 'n' operations to each subdivision.
    - divide a collection into partitions of size 1.
      - adjacent partition are com[ared and merged into a temp array in sorted order.
      - temp array merged back into main array. 
        This becomes a new partition as the recursion works backward.
    */

   //Linear Search 
   // Method to search for a given input in a sorted array of unique values.
   public int findLetter(char target, char[] data){

       //Check if data[] parameter is null, if yes return -1
       if(data == null) return -1;

       //Return -1 as index item not found in the array (nerver 0 or positive value)
       int result = -1;

       //since  datastructure is an araay let's Use a for-loop for the search.
       // search(entire array) start at index 0 to the end
       for (int i = 0; i < data.length ; i++){

           //variable to store current letter in the iteration
           char temp = data[i];

           //check if the current letter match our target
           if(temp == target){
               return i;//return the current index
           }
       }

       /*
       //For Searching backward
       for (int i =  data.length -1; i > -1;  i--){

        //variable to store current letter in the iteration
        char temp = data[i];

        //check if the current letter match our target
        if(temp == target){
            return i;//return the current index
        }
    }
    */
       return result;
   }

     /*
    Recursion:
    Recursion is a common technique in many algorithms. 

    You can easily identify a recursive method because it invokes itself.
    Think of it as a method that invokes another method of the same signature. 
    The instructions for the program to follow are the same, 
    but the inputs to the new invocation should be different.

    It is very important to define a good base case and to clearly
    manipulate the data so that it eventually resolves to the base case 
    after successive recursive invocations. 

    The key to writing good recursive functions is following a good structure. 
    Writing pseudocode is also very helpful in organizing your thoughts. 


    public someMethod(){
        ...
        someMethod(...); // Recursive call here
        ...
    }

   --- The Recommand way to use a recursive algorithm is to
    use a 'Momoization' (array) to cache recursive calls. 
    Otherwise recursion will have heavy memeory useage. 
    
    */
    
    //Create a recursive algorithm to calculate factorial of a number
    // Recall that a factorial or N! 
    //is calculated as the sum of n * (n-1) * (n-2) * (n-3),.. * (n-(n-1)). 

    public int factorial(int num) {

        //Base case if param is 0 or 1
        if(num <= 0) return 0;
        if (num == 1) return 1;

        //recursive call
        return num * factorial(num - 1);
    }

    /*
    -recursive method to 'print itself' and 'all previous letters 
    of the alphabet given a single letter on the same line'.

    All letters will be lowercase.
    
    HINT: Use the char data type as it is easy to convert one letter
     to the next using mathematical operators.

    */
    public static  void printChar(char input){

        //Base case
        if (input < 'a' || input > 'z') return;

        System.out.print(input);
        input -= 1;
        printChar(input);
    }

     //-----------Binary Search using Recursion---
    
    /* 
     Search upon an int array and return the index of a given int. 
     If the number is not in the list, then return -1
    */

    public int binarySearch(int[] data, int target){
        
        //return -1 the given array is empty
        if(data == null || data.length == 0) return -1;

        //define the range of indexes
        int minRange = 0;
        int maxRange = data.length;

        //find the midpoint value
        int midpoint = data[maxRange/2];

        if(midpoint == target){
            return maxRange/2; //Return the position

        } else if (data.length == 1){
            return -1; //This stop additional recursive calls

        } else if(midpoint < target) {
            minRange = (maxRange/2);

            //create new data to search upon
            int[] temp = copyArray(data, minRange, maxRange);

            /* 
            Need to add the range if it is in the upper half to  keep
            track of the index otherwise the index is based on the smaller range.
            */
            int indexAdder = (maxRange / 2);

            //find the index in smaller array
            int search = binarySearch(temp, target);

            //check if the search found the value
            if(search == -1){
                return -1; //return -1, if the search didn't find it
            } else {
                //Return the value pls the adder if found
                return indexAdder + search;
            }
        }
        else if(midpoint > target){
            maxRange = (maxRange /2);

            //create new data to search upon
            int[] temp = copyArray(data, minRange, maxRange);

            //since we're searching the lower half,
            // there is no need to keep track of the index
            return binarySearch(temp, target);
        }
        return -1;
    }
    
    //A method used to copy the values of one array into the next one.
    public int[] copyArray(int[] original, int min, int max) {

        int[] target = new int[max - min];

        for(int i = 0; i < target.length; i++){
            target[i] = original[min+i];
        }
        return target;
    }


    //-----------------Main--------------------//
    public static void main(String[] args) {
        System.out.println("\n\n");
        
        //Dummy data for our method
        char letter = 'm';
        char[] letters = {
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h','i', 'j', 'k', 'l', 'm', 'n',
        'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        //char[] letters = null; //corner case check

        //Method call here
        AlgorithmSearchSort linearSearch = new AlgorithmSearchSort();
        System.out.println(linearSearch.findLetter(letter, letters));   
        
        System.out.println("\n"); 
        
        // Dummy Data for Recursive algorithm
        int input = 5;
        AlgorithmSearchSort fn = new AlgorithmSearchSort();
        System.out.println(fn.factorial(input));

        // call recursive data here
        System.out.println("\n"); 
        printChar('c');

        System.out.println("-----------\n"); 

        //Dummy data for binary Search Algo
        int[] myData = {1, 5, 66, 77, 88, 1, 2, 9, 104, 55};
        int searchTarget = 5;

        //Calling our BinarySearh() algo
        AlgorithmSearchSort bns = new AlgorithmSearchSort();
        System.out.println(bns.binarySearch(myData, searchTarget));

        System.out.println("\n\n");        
    }//main
}//class
