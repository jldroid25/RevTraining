import java.util.LinkedHashSet;

public class linkHashSetAnswers  extends linkHashSetInterfaceExample{

    public static void main(String[] args) {
        linkHashSetAnswers answersForLinkHashSet = new linkHashSetAnswers();

        //Accessing the data from Parent setter Methods
        String planeTitle = answersForLinkHashSet.setPlaneTitle();
        String destination = answersForLinkHashSet.setDestination();
        int planeId = answersForLinkHashSet.setPlaneId();
        int flightNumber =  answersForLinkHashSet.setFlightNumber();
        
        //create HashSet Interface object 
        LinkedHashSet<String> myNewLinkedSet = new LinkedHashSet<>();

        //------------ C.R.U.D Operations on a Collection Interface API --------//
        
        // Create or add data to the set
        myNewLinkedSet.add(planeTitle);
        myNewLinkedSet.add(destination);
        myNewLinkedSet.add("Plane Id :" + planeId);
        myNewLinkedSet.add("Flight Number: " + flightNumber);

        System.out.println("\n");

        //Read the data
        System.out.println(myNewLinkedSet  + "\n");

        //Does Hash set contain flight Numer 601
        System.out.println("\n Does LinkedHashSet contain a Destination? :  \t"
         + myNewLinkedSet.contains(destination));
       
        //Remove an item from Hashset
        myNewLinkedSet.remove(destination);

        //Printing the Updated SET Elements after one was remove
        System.out.println("\n ------- Here Destination Was Removed------");
        System.out.println(myNewLinkedSet );
        System.out.println("\n");
    }          
}