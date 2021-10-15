
public class DemoJava {
	
	//Define Static Method with String and Integer parameters 
	public static void message(String myString, int myInt) {
		System.out.println("This my String: " +  myString + "\n"); 
		System.out.println("This my Integer: " +  myInt + "\n"); 
	}
	
	//Define method to do some calculation
	public static  void doCalculation () {
		//Working Java integer Data type
		int num1 = 10;
		int num2 = 20;
		int num3 = num1 + num2;
		System.out.println("The sum of " +  num1 + " + "+ num2  + " = "  +  num3 + "\n");
	}
	
	//Method to find the cube of any number
	public static  int findCubeNumber (int number) {
		int cubeNum = number *  number * number ;
		System.out.println( number + " cube " + " is : \r" );
		return cubeNum;
	}
	
	//Method to find the percentage of any number
	public static void percentNumber (double percent,  double value) {
		double percentNum = ( value /100)  *  percent ;
		System.out.println(percent  +  "% "  + " of "  +  value  +  " = "  +  percentNum ); 
	}
		
	public static void main(String[] args) {
		//Just Printing the String Hello World
		System.out.println("Hello World ! \n"); 

		//Calling message  method with required parameters 
		message("Eclipse IDE for White Hat Hackers only ", 121);
		
		//Invoking the doCalculation ()
		doCalculation ();
		
		//invoking or calling findCube() Method
		System.out.println( findCubeNumber(3) + "\n");
		
		//invoking percent method to find 50% of 700
		 percentNumber (50, 700);
		
	}//main
}//class