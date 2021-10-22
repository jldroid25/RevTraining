import java.util.ArrayDeque;
import java.util.Stack;

public class StackAnswers extends BasicParentClassData {
    //constructor
    public StackAnswers(String title, int id, int ISBN, String publisher) {
        super(title, id, ISBN, publisher);
    } 
    public static void main(String[] args) {
        System.out.println("\n");

        //Create an Object
        StackAnswers data = new StackAnswers("Boston In Winter ", 123, 234667, "Pengiun House");

        //Accessing the data from Parent setter Methods
        String bookTitle = data.getTitle();
        String bookPublisher = data.getPublisher();
        int bookId = data.getId();
        Long bookISBN =  data.getISBN();
        //Testing for--> Casting Int & long primitives to String 
        String answerBookId = String.valueOf(bookId); 
        String answerBookISBN = String.valueOf(bookISBN);

        //create Stack Interface object with initial capacity of 2
        ArrayDeque<String> myStack = new ArrayDeque<>();
        
        //------------ C.R.U.D Operations on a Collection Interface API --------//
        // Create or add data to the - List
        myStack.push(bookTitle);
        myStack.push(bookPublisher);
        myStack.push("\n Book ID: " + answerBookId);
        myStack.push("\nBook ISBN Number: " + answerBookISBN);
        
        //Read the data
        System.out.println(myStack);
                
        //Deleting  first item  at the top of Stack --> BookISBN
        //Remember L.I.F.O so it will remove last added element
        myStack.pop();

        //Read the data after Deleting Title
        //Printing the Updated Stack  first Elements  was remove
        System.out.println("\n------- Book Title Remove------");
        System.out.println(myStack);

        System.out.println("\n----------");

        //add an item at a specific index (location 1) on the list
        myStack.push("Canada Press");
        System.out.println(myStack);

        //Check the  size of the Stack
        System.out.println("Stack Size is : " + myStack.size());

        System.out.println("\n Current Element at the top of Stack : " + myStack.peek());


        //-------Keep testing with other methods java doc
        
        System.out.println("\n");
    }//main 
    
}
