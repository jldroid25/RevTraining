import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHashSetAnswers  extends BasicParentClassData{

     //constructor
     public LinkHashSetAnswers (String title, int id, int ISBN, String publisher) {
        super(title, id, ISBN, publisher);
    }
    public static void main(String[] args) {
        LinkHashSetAnswers answersForLinkHashSet = new LinkHashSetAnswers("From Russia With Love", 896, 30001230, "Europe Printing Press");

        //Accessing the data from Parent setter Methods
        String bookTitle = answersForLinkHashSet.getTitle();
        String bookPublisher = answersForLinkHashSet.getPublisher();
        int bookId = answersForLinkHashSet.getId();
        long bookIBSN =  answersForLinkHashSet.getISBN();
        
        //create HashSet Interface object 
        //LinkedHashSet<String> myNewLinkedSet = new LinkedHashSet<>();
        
        //We can also use SET since LinkedHashSet implements it as well
        Set<String> myNewLinkedSet = new LinkedHashSet<>();


        //------------ C.R.U.D Operations on a Collection Interface API --------//
        
        // Create or add data to the set
        myNewLinkedSet.add(bookTitle);
        myNewLinkedSet.add(bookPublisher);
        myNewLinkedSet.add("Book Id :" + bookId);
        myNewLinkedSet.add("Book IBSN : " + bookIBSN);

        System.out.println("\n");

        //Read the data
        System.out.println(myNewLinkedSet  + "\n");

        //Does Hash set contain flight Numer 601
        System.out.println("\n Does LinkedHashSet contain a Publisher? :  \t"
         + myNewLinkedSet.contains(bookPublisher));
       
        //Remove an item from Hashset
        myNewLinkedSet.remove(bookPublisher);

        //Printing the Updated SET Elements after one was remove
        System.out.println("\n ------- Here Publisher Was Removed------");
        System.out.println(myNewLinkedSet );
        System.out.println("\n");
    }          
}