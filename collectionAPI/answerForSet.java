import java.util.HashSet;
import java.util.Set;

//--------- A class to Print  SET Data Collection 
public class answerForSet extends setInterfaceExample {
    //constructor
    public answerForSet(String title, int id, int ISBN, String publisher) {
        super(title, id, ISBN, publisher);
    }
    public static void main(String[] args) {
        System.out.println("\n");

        //Create an Object
        answerForSet  data = new answerForSet(" ", 1, 000000, " ");

        //Accessing the data from Parent setter Methods
        String answerTitle = data.setTitle();
        String answerPublisher = data.setPublisher();
        int bookId = data.setId();
        Long bookISBN =  data.setISBN();

        // Casting Int & long primitives to String 
        String answerBookId = String.valueOf(bookId); 
        String answerBookISBN = String.valueOf(bookISBN);

        //create Set Interface object 
        Set<String> myNewSet = new HashSet<>();
        
        //------------ C.R.U.D Operations on a Collection Interface API --------//
        // Create or add data to the set
        myNewSet.add(answerTitle);
       // myNewSet.add(answerTitle); //No duplicate & will not be added to SET
        myNewSet.add(answerPublisher);
        myNewSet.add("\n Book ID: " + answerBookId);
        myNewSet.add("\nBook ISBN Number: " + answerBookISBN);
        
        //Read the data
        System.out.println(myNewSet);
                
        //Deleting  Data from the SET 
        //Read the data after Deleting Title
        myNewSet.remove(answerTitle);
        
        //Printing the Updated SET Elements after one was remove
        System.out.println("\n------- Book Title Remove------");
        System.out.println(myNewSet);
        System.out.println("\n");
    }    
}