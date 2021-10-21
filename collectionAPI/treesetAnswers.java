import java.util.Set;
import java.util.TreeSet;

public class TreesetAnswers  extends basicParentClassData{

    //constructor
    public TreesetAnswers(String title, int id, int ISBN, String publisher) {
        super(title, id, ISBN, publisher);
    }
    public static void main(String[] args) {
        TreesetAnswers answersForTreeSet = new TreesetAnswers("Boston In Winter ", 123, 234667, "Pengiun House");

        //Accessing the data from Parent setter Methods
        String bookTitle = answersForTreeSet.getTitle();
        String bookPublisher = answersForTreeSet.getPublisher();
        int bookId = answersForTreeSet.getId();
        long bookISBN =  answersForTreeSet.getId();
        
        //create TreeSet Interface object 
        Set<String> myNewTreeset = new TreeSet<>();

        //------------ C.R.U.D Operations on a Collection Interface API --------//
        
        // Create or add data to the set
        myNewTreeset.add(bookTitle);
        myNewTreeset.add(bookPublisher);
        myNewTreeset.add("Plane Id :" + bookId);
        myNewTreeset.add("Flight Number: " + bookISBN);

        System.out.println("\n");

        //Read the data
        System.out.println(myNewTreeset + "\n");

        //Does Hash set contain flight Numer 601
        System.out.println("\n Does Treeset contain a Publisher?:  \t"
         + myNewTreeset.contains(bookPublisher));
       
        //Remove an item from Hashset
        myNewTreeset.remove(bookPublisher);

        //Printing the Updated SET Elements after one was remove
        System.out.println("\n ------- Here Publisher Was Removed------");
        System.out.println(myNewTreeset);
        System.out.println("\n");
    }       
}