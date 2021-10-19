import org.junit.jupiter.api.Test;

public class BasicClass {

	// to practice with class & object definition

	int length;
	int breadth;
	int roomNum;
	int height;
	String roomColor;

	// Our defined constructor
	public BasicClass(int height, int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	// constructor overloading (Providing another version of const.)
//	public BasicClass(int height, int length,  int breadth, String roomColor) {
//	    this.roomColor = roomColor;//Optional from client as example
//		this.length = length;
//		this.breadth = breadth;
//		this.height = height;
//	}	

	// constructor Channing (calling a construction within another.)
//	public BasicClass(int height, int length,  int breadth, String roomColor) {
//		this( height,  length, breadth, roomColor); //has to be first line due to super() class
//	    //this.roomColor = roomColor;
//		//this.length = length;
//		//this.breadth = breadth;
//		//this.height = height;
//	}
	
	

	public static void main(String[] args) {	
		//Instantiate an object  with new keywords (allocate memory on heap)
		BasicClass bc = new BasicClass(12, 21, 121);
		System.out.println("Values for Height, Length, & Breadth: " 
		+  bc.length + " " +  + bc.height  +" "+  bc.breadth);
	}//main

}//class
