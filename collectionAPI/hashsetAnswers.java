import java.util.HashSet;

public class hashsetAnswers  extends hashsetInterfaceExample{

    public static void main(String[] args) {
        hashsetAnswers answersForHashSet = new hashsetAnswers();

        //Accessing the data from Parent setter Methods
        String planeTitle = answersForHashSet.setPlaneTitle();
        String destination = answersForHashSet.setDestination();
        int planeId = answersForHashSet.setPlaneId();
        int flightNumber =  answersForHashSet.setFlightNumber();
        
        //create HashSet Interface object 
        HashSet<String> myNewHashset = new HashSet<>();

        //------------ C.R.U.D Operations on a Collection Interface API --------//
        
        // Create or add data to the HashSET
        myNewHashset.add(planeTitle);
        myNewHashset.add(destination);
        myNewHashset.add("Plane Id :" + planeId);
        myNewHashset.add("Flight Number: " + flightNumber);

        System.out.println("\n");
        //Read the data
        System.out.println(myNewHashset + "\n");

        //Does Hash set contain flight Numer 601
        System.out.println("\n Does Hashset contain a Destination?:  \t"
         + myNewHashset.contains(destination));
       
        //Remove an item from Hashset
        myNewHashset.remove(destination);

        //Printing the Updated SET Elements after one was remove
        System.out.println("\n ------- Here Destination Was Removed------");
        System.out.println(myNewHashset);
        System.out.println("\n");
    }    
}