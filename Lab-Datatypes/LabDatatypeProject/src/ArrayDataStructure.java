public class ArrayDataStructure {
    /*
    array is our first data structure which 
    a tool to organize information in a meaningful way. 

    - Array: can hold a single type of data (primitive or class type)
      in a linear fashion (one by one).
    - Arrays are fast at retrieving data because of the way the system
      stores them in memory. They store items in sequence in memory 
      which allow for fast retrieval because each item is store next to each other.
    - Each array item is called an element & 
      each element has an index (string from zero to x).
    - The length of an array is the number of elements that it can hold. 
 
    */

    public static void main(String[] args) {
        System.out.println("\n\n");


        /**
         * - To create an Array:
        Specify the datatype follow by brackets ([]), follow by variable name.
        int[] arrayName;

        
        - Arrays limitation (fix size on declaration)
        Arrays have fixed size when declared that cannot be resized later on.

        Assign element to an array 
         1st way: if already know array's length  before before creating it.
         notice we use the keyword "new" 
        */
         
        // int[] myArrayName = new int[5];

         // float[] myArrayName2 = new float[10];

        /* 2nd way: We don't use the "new" keyword
            but we initialize array with values directly in curly braces.
        */
        
        int[] myArray = {1,2,3,4,5};

        // double[] myArray2 = {1.2,2.0,3.1,4.7,5.6};

        /* Accessing Array values(Elements)
            To access your array values we will need to
            use the "index" to access a specific element
        */
        // Access the 4th element
        System.out.println("myArray's 4th element is: " + myArray[3]);

        /* To change/update an array's element: 
        Use brackets to access the element and the assignment operator to assign
        or re-assign a value for a specfic element.
        */

        // Le's re-assign a value to the array's existing 2nd Element
        myArray[1] =7;
        // Access the 2nd element
        System.out.println("myArray's update 2nd element is: " + myArray[1]);

        /**
         * Array Exception:
         
         - When one assigned a value to an element't  that doesnt exist.
         - No Compiler errors  will happen.
         - The Program will exhibit a runtime error called 
           "ArrayIndexOutOfBoundsException"

           Example if array has only 5 elements but program try to 
            add,update, delete the 6th or 99th element

         */

         /*
          Array Properties:
          - Use the dot operator & length ".length" property to access the length
            (number of elements) of the array.
           - length property is helpful when iterating over arrays with
             a for loop
          
          - Note: we can only use.length  property to know the size/length
          of the array.
            We cannot use .length to change/update the array.
         */

         //Let's find/access the length of myArray
        System.out.println("MyArray's length is: " + myArray.length);

        System.out.println("MyArray's address in memory: " + myArray);

        
        // Using .length in a for-loop to access all elements 
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
            
        }
        // Java For-Loop practice
        // for(int a =0; a < myArray.length; a++){
            //System.out.println(myArray[a]);
        // }

        //ArrayIndexOutOfBoundIndexException
        //System.out.println("Accessing non-existing elements: " + myArray[99]);


        System.out.println("\n\n");
    }
    
}
