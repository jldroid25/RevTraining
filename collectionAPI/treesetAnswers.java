import java.util.Set;
import java.util.TreeSet;

public class treesetAnswers  extends tresetInterfaceExample{
    public static void main(String[] args) {
        treesetAnswers answersForTreeSet = new treesetAnswers();

        //Accessing the data from Parent setter Methods
        String planeTitle = answersForTreeSet.setPlaneTitle();
        String destination = answersForTreeSet.setDestination();
        int planeId = answersForTreeSet.setPlaneId();
        int flightNumber =  answersForTreeSet.setFlightNumber();
        
        //create TreeSet Interface object 
        Set<String> myNewTreeset = new TreeSet<>();

        //------------ C.R.U.D Operations on a Collection Interface API --------//
        
        // Create or add data to the set
        myNewTreeset.add(planeTitle);
        myNewTreeset.add(destination);
        myNewTreeset.add("Plane Id :" + planeId);
        myNewTreeset.add("Flight Number: " + flightNumber);

        System.out.println("\n");

        //Read the data
        System.out.println(myNewTreeset + "\n");

        //Does Hash set contain flight Numer 601
        System.out.println("\n Does Treeset contain a Destination?:  \t"
         + myNewTreeset.contains(destination));
       
        //Remove an item from Hashset
        myNewTreeset.remove(destination);

        //Printing the Updated SET Elements after one was remove
        System.out.println("\n ------- Here Destination Was Removed------");
        System.out.println(myNewTreeset);
        System.out.println("\n");
    }       
}