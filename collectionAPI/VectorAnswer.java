import java.util.Vector;

public class VectorAnswer extends BasicParentClassData {

    public VectorAnswer(String title, int id, int ISBN, String publisher) {
        super(title, id, ISBN, publisher);
    }

    public static void main(String[] args) {
        System.out.println("\n");

        //Create an Object
        VectorAnswer  data = new VectorAnswer("Boston In Winter ", 123, 234667, "Pengiun House");

        //Accessing the data from Parent setter Methods
        String bookTitle = data.getTitle();
        String bookPublisher = data.getPublisher();
        int bookId = data.getId();
        Long bookISBN =  data.getISBN();
        //Testing for--> Casting Int & long primitives to String 
        String answerBookId = String.valueOf(bookId); 
        String answerBookISBN = String.valueOf(bookISBN);

        //create Vector Interface object with initial capacity of 2
        Vector<String> myVector = new Vector<String>(2);
        
        //------------ C.R.U.D Operations on a Collection Interface API --------//
        // Create or add data to the - List
        myVector.add(bookTitle);
        myVector.add(bookPublisher);
        myVector.add("\n Book ID: " + answerBookId);
        myVector.add("\nBook ISBN Number: " + answerBookISBN);
        
        //Read the data
        System.out.println(myVector);
                
        //Deleting  Data from the List
        myVector.remove(bookTitle);

        //Read the data after Deleting Title
        //Printing the Updated List Elements after one was remove
        System.out.println("\n------- Book Title Remove------");
        System.out.println(myVector);

        System.out.println("\n----------");

        //add an item at a specific index (location 1) on the list
        myVector.add(1,"Canada Press");
        System.out.println(myVector);

        //Check the vector size
        System.out.println("Vector Size is : " + myVector.size());
        //Check if Vector contains BookID
        System.out.println("Vector contains bookId : " + myVector.contains("\n Book ID: " + answerBookId));


        //-------Keep testing with other methods java doc
        
        System.out.println("\n");
    }//main 
    
}
