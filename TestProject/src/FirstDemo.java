
public class FirstDemo {
	
	//Create a static method with parameters
public static void message (String myString, int myInt) {
		
		System.out.println("\t This is my string: " + myString);
		System.out.println("\t This is my integer: " + myInt);
	}


	public static void main(String[] args) {
		
		System.out.println("\n");

		//Here is a comment in Java
		System.out.println("\t Hello World from Eclipse IDE !"); 
		
		System.out.println("\n");
		
		//Calling message method
		message("White Hat Coders only", 121);
		
		System.out.println("\n");
		System.out.println("---------------------------------\n"); 

	}//main

}//class