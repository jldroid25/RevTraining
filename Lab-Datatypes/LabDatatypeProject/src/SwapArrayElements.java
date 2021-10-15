public class SwapArrayElements {

    // Challenge: Swap Array first elements with the last one

    public static void main(String[] args) {
        System.out.println("\n\n");

        //Variables & Array declation
        int first = 0;
        int last = 0;
        int[] elements = {1, 2, 3, 4, 5};

        //printing current array values
        System.out.println("\n Array before the swap");
        for(int a = 0; a < elements.length; a++){
            System.out.print(elements[a]);
        }

        //Let's find the length of the array 
        System.out.println("\n Array Length is : ");
        System.out.print(elements.length);

        //My way: Array's elements re-assignment/swap
        last = elements[0];
        first = elements[4];
        elements[0] = first;
        elements[4] = last;

        // Instructor's way
        //Assign array's first element (at indez 0) into a var
        // int temp = elements[0];

        // now assign arrays' last element to first element (index 0)
        // elements[0] = elements[elements.length -1];

        //Now let's assigne temp var( with first elem) to array's last element  
        // elements[elements.length -1] = temp;

        //Using a for loop to print array's swapping elements
        System.out.println("\n after the swap: ");
         for (int i = 0; i < elements.length; i++){
             System.out.print(elements[i]);
         }
        System.out.println("\n\n");
    }  
}