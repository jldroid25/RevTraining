// public class OOPConceptExample {
// //	//This is the parent class 
// 	public int someNumber;
	


// } //class 


//
//
//	//----------------------------------- Polymorphism Example
//	public class  polymorphismExampleClass extends   OOPConceptExample {
//		
//       //constructor
//		public polymorphismExampleClass(int numOfLegs, int numOfArms) {
//			//super(numOfLegs, numOfArms);
//			// TODO Auto-generated constructor stub
//		}
//		
//		//----------- Method overloading Example 
//		//@Override //  but this annotation will make sure we overidde instead of OverLoading
//		// Also must have same access modifier as parent one, equal , or greater
//		public void speak(double etfNumber) {
//			System.out.println( etfNumber);
//		}
//
//		
//		//Define Speak Method now has been Overridden
//		// We completely change the  body of the parent method
//		public int speak() {
//			int addSum;
//			int num1 = 3;
//			int num2 = 2;
//			addSum = num1 + num2; 
//			return addSum;
//		}
//
//		
//		//---------------------------------Interface Example 
////		public interface Purchaseable {
////			//  int maxPrice; // this is implicitly static!
////			
////			// NOTE: no method body. This method is public abstract even though we did not use the keywords
////			  //boolean buy(Item i); 
////			}		
//		//-------------------------------------------Abstraction Example
//		//------------------------------------Encapsulation
//		
//		
//		
//	}//child class 1
//	
//	//---------------------------Example of inheritance 
//	
//	public class Robot extends OOPConceptExample {
//		public Robot(int numOfLegs) {
//			//super(numOfLegs, numOfLegs);
//			
////		public Robot(int head, int numOfLegs, int numOfArms) {
////			super(head, numOfLegs, numOfArms);
////				this.(numOfLegs, numOfArms, head );//Must be first line
////				this.color = color;
////			}				
//		}//Robot Class
//		
//	}// child class 2
//	