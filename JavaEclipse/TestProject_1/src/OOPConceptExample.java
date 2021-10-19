
public class OOPConceptExample {
	//This is the parent class 
	
	public int numOfLegs;
	public int numOfArms;
	public int head;
	public String color;
	
	
	//Parent's class Constructor with  instant variable 
	//that are required  when instantiate object
	public OOPConceptExample(int numOfLegs, int numOfArms) {
		this.numOfLegs = numOfLegs;
		this.numOfArms = numOfArms;
		
	}
	
//	//Construtor channing
	public OOPConceptExample() {
		this.(numOfLegs, numOfArms);//Must be first line
		this.color = color;
	}


	//Define Speak Method in Parent Class
	public void speak() {
		System.out.println("Generic Noise Making");
	}
	
	
	//----------------------Main Method to inkove class Methods & instantiate Objects
	public static void main(String[] args) {
		System.out.println("\n");
		
		//Object Instantiation 
		OOPConceptExample  oopExample1 = new OOPConceptExample(2, 2);
		//oopExample1.numOfLegs;
		oopExample1.speak();
		
	}// main
	
	//Example of inheritance 
		public class Robot extends OOPConceptExample {
			public Robot(int numOfLegs) {
				super(numOfLegs, numOfLegs);
				
//			public Robot(int head, int numOfLegs, int numOfArms) {
//				super(head, numOfLegs, numOfArms);
//					this.(numOfLegs, numOfArms, head );//Must be first line
//					this.color = color;
//				}				
			}//Robot Class
		}
		
		//---------------------------------Interface Example 
		public interface Purchaseable {
			//  int maxPrice; // this is implicitly static!
			
			// NOTE: no method body. This method is public abstract even though we did not use the keywords
			  //boolean buy(Item i); 
			}

		
		
		//-------------------------------------------Abstraction Example
		
		
		
		
		
		//----------------------------------- Polymorphism Example
		public class  polymorphismExampleClass extends   OOPConceptExample {
			
           //constructor
			public polymorphismExampleClass(int numOfLegs, int numOfArms) {
				super(numOfLegs, numOfArms);
				// TODO Auto-generated constructor stub
			}
			
			//----------- Method overloading Example 
			//@Override //  but this annotation will make sure we overidde instead of OverLoading
			// Also must have same access modifier as parent one, equal , or greater
			public void speak(double etfNumber) {
				
				System.out.println( etfNumber);
			}

			//Define Speak Method now has been Overridden
			// We completely change the  body of the parent method
			public void speak() {
				int addSum;
				int num1 = 3;
				int num2 = 2;
				addSum = num1 + num2; 
				System.out.println("The sum is " +   addSum);
			}
		}
		
		//------------------------------------Encapsulation
}// Class
