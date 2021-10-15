
public class ControlFlow {
	
	//Define a method to figure out Even or Odd number
	public static void findOddEvenNumbers(int num) {
		int result = num % 2;
		if( result == 0 ) {
			System.out.println(num + " is an Even Number \n");
		} else {
			System.out.println(num + " is an Odd Number \n");
		}
	}
	
	//Working if If else & Else if Block code
	public static void turnOnTurnOff() {
	boolean a = true;
	boolean b = false;
	if(a) {
		System.out.println(" A : is true so let's print inside the If-Statement Block \n");
	} else if(b) {
		System.out.println(" B:  is true so let's print inside the Else-If Block \n");
	} else {
		System.out.println(" ---- Warning ---  System out of order \n");
	}
}
	
	//Define a method to make decision with Switch statement
	public  static void switchCaseMethod(	int valueCode  ) {	
		switch(valueCode) {
		case 1:
			System.out.println("Found Case  1 for valueCode " );
			break;
		case 2:
			System.out.println("Found Case 2 for valueCode" );
			break;
		case 3:
			System.out.println("Found Case 3 for valueCode" );
			break;	
		case 4:
			System.out.println("Found Case 4 for ValueCode " );
			break;		
		default: 
			System.out.println("--- Warning   Out Of Order --  Wrong ValueCode case" );
			break;
		}
}
	//Main Method 
	public static void main(String[] args) {
		System.out.println("\n");
		// invoking/calling findOddEvenNumbers Method
		int someNumber = 120;
		findOddEvenNumbers(someNumber);
		//Invoking or calling  turnOnTurnOff()
		 turnOnTurnOff();
		//Invoking or calling switchCaseMethod( )
		 switchCaseMethod(2 ); 
	}
}