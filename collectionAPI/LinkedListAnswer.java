import java.util.LinkedList;
import java.util.List;

public class LinkedListAnswer extends BasicParentClassData{
    //cosntructor 
    public LinkedListAnswer (String title, int id, int ISBN, String publisher) {
        super(title, id, ISBN, publisher);
    }
    public static void main(String[] args) {
        System.out.println("\n");

        //Create an Object
        ArrayListAnswers  data = new ArrayListAnswers("Boston In Winter ", 123, 234667, "Pengiun House");

        //Accessing the data from Parent setter Methods
        String bookTitle = data.getTitle();
        String bookPublisher = data.getPublisher();
        int bookId = data.getId();
        Long bookISBN =  data.getISBN();
        //Testing for--> Casting Int & long primitives to String 
        String answerBookId = String.valueOf(bookId); 
        String answerBookISBN = String.valueOf(bookISBN);

        //create Vector Interface object with initial capacity of 2
        List<String> myLinkedList = new LinkedList<String>();
        
        //------------ C.R.U.D Operations on a Collection Interface API --------//
        // Create or add data to the - List
        myLinkedList.add(bookTitle);
        myLinkedList.add(bookPublisher);
        myLinkedList.add("\n Book ID: " + answerBookId);
        myLinkedList.add("\nBook ISBN Number: " + answerBookISBN);
        
        //Read the data
        System.out.println(myLinkedList);
                
        //Deleting  Data from the List
        myLinkedList.remove(bookTitle);

        //Read the data after Deleting Title
        //Printing the Updated List Elements after one was remove
        System.out.println("\n------- Book Title Remove------");
        System.out.println(myLinkedList);

        System.out.println("\n----------");

        //Replace an item at a specific index (location 1) on the list
        myLinkedList.set(2,"6969");
        System.out.println(myLinkedList);

        //Check if LinkedList contains BookID
        System.out.println("\n LinkedList contains bookId : " + myLinkedList.contains("\n Book ID: " + answerBookId));

        //-------Keep testing with other methods java doc
        
        System.out.println("\n");
    }//main 
}