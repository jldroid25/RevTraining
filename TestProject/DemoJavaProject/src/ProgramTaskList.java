
public class ProgramTaskList {

	// # 1 -  write a program to repeat a multiple of a number 
	// 5, - 3, 10, 15 ...
	
	public static void repeatMultiple(int num  ) {
		for(int i =  0;  i <= 10 ; i++  ) {
			int result  =  i * num;
			System.out.println( "Multiple  of a number : " + result);
		}
	}
	
	// # -  2  sum of digits ie 123 = 6
	public static void addSum(int number) {
		while(number != 0 ) {
		
			System.out.println( "adding numbers  : " );
			//result = result + 1;
		}
	}
	
	//  #  4  find the Factorial of a number  with recursive 
	public static int factorial( int number) {
		//Base case if param is 0 or 1
		if(number <= 0) return 0;
		if(number  == 1) return 1;

		//recursive call
		return number * factorial(number - 1);
	}
	
	public static void main(String[] args) {
		//Calling the multiple Repeat number
		 //repeatMultiple(5);
		 
		 System.out.println( "---------------------------------------- \n");
		 //Calling add Sum Method 
		 addSum(123);
		 
		 //calling factorial of  method
		 //int n = 5 ;
		// System.out.println( "Factorial of " + n +  " is : " + factorial(n) );
		
		 
	}//main 
}//class
