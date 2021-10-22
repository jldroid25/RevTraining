import java.util.ArrayList;
import java.util.List;

public class ListInterfaceExample extends BasicParentClassData {
    
    public ListInterfaceExample(String title, int id, int ISBN, String publisher) {
        super(title, id, ISBN, publisher);
    }

    public static void main(String[] args) {
        System.out.println("\n");

        //Create an Object
        ListInterfaceExample  data = new ListInterfaceExample("Boston In Winter ", 123, 234667, "Pengiun House");

        //Accessing the data from Parent setter Methods
        String answerTitle = data.getTitle();
        String answerPublisher = data.getPublisher();
        int bookId = data.getId();
        Long bookISBN =  data.getISBN();
        //Testing for--> Casting Int & long primitives to String 
        String answerBookId = String.valueOf(bookId); 
        String answerBookISBN = String.valueOf(bookISBN);

        //create List Interface object 
        List<String> myList = new ArrayList<String>();
        
        //------------ C.R.U.D Operations on a Collection Interface API --------//
        // Create or add data to the - List
        myList.add(answerTitle);
        myList.add(answerPublisher);
        myList.add("\n Book ID: " + answerBookId);
        myList.add("\nBook ISBN Number: " + answerBookISBN);
        
        //Read the data
        System.out.println(myList);
                
        //Deleting  Data from the List
        myList.remove(answerTitle);

        //Read the data after Deleting Title
        //Printing the Updated List Elements after one was remove
        System.out.println("\n------- Book Title Remove------");
        System.out.println(myList);

        System.out.println("\n----------");

        //add an item at a specific index (location 1) on the list
        myList.add(1,"Canada Press");
        System.out.println(myList);

        //-------Keep testing with other methods java doc
        
        System.out.println("\n");
    }//main    
}//class    