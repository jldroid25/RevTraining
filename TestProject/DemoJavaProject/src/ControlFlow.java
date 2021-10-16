
public class ControlFlow {
	// Define a method to figure out Even or Odd number
	public static void findOddEvenNumbers(int num) {
		int result = num % 2;
		if (result == 0) {
			System.out.println(num + " is an Even Number \n");
		} else {
			System.out.println(num + " is an Odd Number \n");
		}
	}

	// Working if If else & Else if Block code
	public static void turnOnTurnOff() {
		boolean a = true;
		boolean b = false;
		if (a) {
			System.out.println(" A : is true so let's print inside the If-Statement Block \n");
		} else if (b) {
			System.out.println(" B:  is true so let's print inside the Else-If Block \n");
		} else {
			System.out.println(" ---- Warning ---  System out of order \n");
		}
	}

	// Define a method to make decision with Switch statement
	public static void switchCaseMethod(int valueCode) {
		switch (valueCode) {
		case 1:
			System.out.println("Found Case  1 for valueCode ");
			break;
		case 2:
			System.out.println("Found Case 2 for valueCode");
			break;
		case 3:
			System.out.println("Found Case 3 for valueCode");
			break;
		case 4:
			System.out.println("Found Case 4 for ValueCode ");
			break;
		default:
			System.out.println("--- Warning   Out Of Order --  Wrong ValueCode case");
			break;
		}
	}

	// -------------------Working with loops

	/*
	 * For-Loop: Is a structure used to repeat a block of code. A For-Loop manage 3
	 * statements that control how it operates.
	 * 
	 * For-loops are naturally use with arrays.
	 * 
	 * syntax:
	 * 
	 * //declare statement, condition, counter
	 * 
	 * for(int x = 2; x < 10; x+=2){ //Do Something }
	 * 
	 */

	public static void forLoopMessage() {
		for (int k = 0; k <= 10; k++) {
			System.out.println("Welcome to Java For-Loop --> " + k + "\n");
		}
	}

	public static void forLoopMsgIfStatement() {
		for (int a = 0; a <= 10; a++) {
			if (a % 2 == 0) {
				System.out.println(a + ": is  an Even Number ! \n");
			} else if (a % 2 == 1) {
				System.out.println(a + ": is  an odd number ! \n");
				System.out.println();
			}
		}
	}

	/*
	 * While Loop:
	 * 
	 * Will repeat a block of code based on a condition; it essentially tells the
	 * program to start back up at the top from where its defined.
	 * 
	 * -- Syntax --
	 * 
	 * //initial desired variable
	 * 
	 * 
	 * //The actual while-loop while(condition) { ...... }
	 */

	public static void repeatMyMessageWhileLoop() {
		// Initial value for the loop to start - step 1
		int i = 1;

		// the condition flow how long the loop should run - step 2
		while (i <= 10) {
			System.out.println("Welcome to Java - While-Loop ! " + i + " \n");

			// Step to get closer to the condition in step 2 fail. - step 3
			i = i + 1;// to prevent infinite looping
		}
	}

	// Do While-Loop
	public static void doWhileLoopMsg() {
		//
		int j = 1;

		// Guarantee to run this line at-least once
		do {
			System.out.println(j + ": Welcome to Java Do-While Loop ! \n");
			j = j + 1;//
			// the condition flow how long the loop should run - step 2
		} while (j <= 10);

	}

	// Main Method
	public static void main(String[] args) {

		System.out.println("\n");

		// invoking/calling findOddEvenNumbers Method
		// int someNumber = 120;
		
		// findOddEvenNumbers(someNumber);
		// System.out.println("-------------------------------");
		// Invoking or calling turnOnTurnOff()
		// turnOnTurnOff();

		// System.out.println("-------------------------------");
		// Invoking or calling Methods
		// switchCaseMethod(2 );

		// System.out.println("-------------------------------");
		// forLoopMessage();

		// System.out.println("-------------------------------");
		// forLoopMsgIfStatement();

		// System.out.println("-------------------------------");
		// repeatMyMessageWhileLoop();

		// System.out.println("-------------------------------");
		// doWhileLoopMsg();

		// ------------------------------------------------------------------------------------------------------
   
//------------------------------------------------------------------------------------------------------------
	}// main

   int customerAccount = 0;
      
   double cashWithdraw = 0;

	public static void paypalApp() {
		System.out.println("Code Printing ");
	}

}// class