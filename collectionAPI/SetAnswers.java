import java.util.HashSet;
import java.util.Set;

//--------- A class to Print  SET Data Collection 
public class SetAnswers extends basicParentClassData {
    //constructor
    public SetAnswers(String title, int id, int ISBN, String publisher) {
        super(title, id, ISBN, publisher);
    }
    public static void main(String[] args) {
        System.out.println("\n");

        //Create an Object
        SetAnswers  data = new SetAnswers("Boston In Winter ", 123, 234667, "Pengiun House");

        //Accessing the data from Parent setter Methods
        String answerTitle = data.getTitle();
        String answerPublisher = data.getPublisher();
        int bookId = data.getId();
        Long bookISBN =  data.getISBN();

        //Testing for--> Casting Int & long primitives to String 
        String answerBookId = String.valueOf(bookId); 
        String answerBookISBN = String.valueOf(bookISBN);

        //create Set Interface object 
        Set<String> myNewSet = new HashSet<>();
        
        //------------ C.R.U.D Operations on a Collection Interface API --------//
        // Create or add data to the set
        // Will not print duplicate 
        myNewSet.add(answerTitle);
        myNewSet.add(answerPublisher);
        myNewSet.add("\n Book ID: " + answerBookId);
        myNewSet.add("\nBook ISBN Number: " + answerBookISBN);
        
        //Read the data
        System.out.println(myNewSet);
                
        //Deleting  Data from the SET 
        myNewSet.remove(answerTitle);

        //(whatever string added must be the exact same one removed .
        // else Hashcode underneath will be different & not revove
        //myNewSet.remove("Title will not be remove: " + answerTitle); //not same string

        //Read the data after Deleting Title
        //Printing the Updated SET Elements after one was remove
        System.out.println("\n------- Book Title Remove------");
        System.out.println(myNewSet);
        
        System.out.println("\n");
    }    
}
