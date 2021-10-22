import java.util.ArrayList;
import java.util.List;

public class ArrayListAnswers extends BasicParentClassData{

    //cosntructor 
    public ArrayListAnswers(String title, int id, int ISBN, String publisher) {
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
        List<String> myArrayList = new ArrayList<String>();
        
        //------------ C.R.U.D Operations on a Collection Interface API --------//
        // Create or add data to the - List
        myArrayList.add(bookTitle);
        myArrayList.add(bookPublisher);
        myArrayList.add("\n Book ID: " + answerBookId);
        myArrayList.add("\nBook ISBN Number: " + answerBookISBN);
        
        //Read the data
        System.out.println(myArrayList);
                
        //Deleting  Data from the List
        myArrayList.remove(bookTitle);

        //Read the data after Deleting Title
        //Printing the Updated List Elements after one was remove
        System.out.println("\n------- Book Title Remove------");
        System.out.println(myArrayList);

        System.out.println("\n----------");

        //Replace an item at a specific index (location 1) on the list
        myArrayList.set(2,"6969");
        System.out.println(myArrayList);

        //Check if ArrayList contains BookID
        System.out.println("\n ArrayList contains bookId : " + myArrayList.contains("\n Book ID: " + answerBookId));

        //-------Keep testing with other methods java doc
        
        System.out.println("\n");
    }//main 
}
