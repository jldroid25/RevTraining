import java.util.HashSet;
import java.util.Set;

public class HashsetAnswers  extends basicParentClassData {

    // constructor
    public HashsetAnswers(String title, int id, int ISBN, String publisher) {
        super(title, id, ISBN, publisher);
    }

    public static void main(String[] args) {
        HashsetAnswers answersForHashSet = new HashsetAnswers("Eastern Front ", 4567, 100009, "New England Publishing");

        //Accessing the data from Parent setter Methods
        String bookTitle = answersForHashSet.getTitle();
        String bookpublisher = answersForHashSet.getPublisher();
        int bookId = answersForHashSet.getId();
        long bookISBN =  answersForHashSet.getISBN();
        
        //create HashSet Interface object 
        //HashSet<String> myNewHashset = new HashSet<>();
        //HashSet implements SET 
        Set<String> myNewHashset = new HashSet<>();


        //------------ C.R.U.D Operations on a Collection Interface API --------//
        
        // Create or add data to the HashSET
        myNewHashset.add( bookTitle);
        myNewHashset.add( bookpublisher);
        //Testing for duplicate 
        myNewHashset.add( bookTitle );// will not be added
        //Testing for adding a null value
        myNewHashset.add(null); // It is added to the HashSET
        // this 2nd null will not be added (treated as duplicate values)
        myNewHashset.add(null);
        myNewHashset.add("Book Id :" + bookId);
        myNewHashset.add("Book ISBN: " + bookISBN);

        System.out.println("\n");
        //Read the data
        System.out.println(myNewHashset + "\n");

        //Does Hash set contain flight Numer 601
        System.out.println("\n Does Hashset contain a Publisher?:  \t"
         + myNewHashset.contains( bookpublisher));
       
        //Remove an item from Hashset
        myNewHashset.remove(bookpublisher);

        //Printing the Updated SET Elements after one was remove
        System.out.println("\n ------- Here Publisher Was Removed------");
        System.out.println(myNewHashset);
        System.out.println("\n");
    }    
}