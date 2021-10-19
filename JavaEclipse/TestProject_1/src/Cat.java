
public class Cat  extends Animal {
	
	//public int fur;
	public int eyes;
	public int  mouth; 
	public int head;
	
	//Constractuctor 
	private Cat(int fur, int eyes, int mouth, int feet, int head , int tail) {
		super(eyes, mouth, feet);
		//this.fur = fur;
		this.eyes = eyes;
		this.mouth = mouth;
	}
	
	//Class Animal Sound Method
	public void biCatSound(String tigerSound) {
		System.out.println( " I AM STARVING NEED TO EAT HUMAN ASAP !") ;
	}
	//Overriden Method  Same name as Class Animal one diff body
	public void makeNoise(String animalSound) {
		System.out.println( " animalSound From CAT Class") ;
	}

	//main
	public static void main(String[] args) {

		Animal animal1 = new Cat(1000, 2, 1, 4, 1, 1);
		//System.out.println(animal1.fur); // can't access fur from CAt class
		//System.out.println(animal1.eyes); // can't access  eyes from Cat class.

		System.out.println(" Number of Feet for Cat: ");
		System.out.println(animal1.feet); // can access feet from Animal
		
		System.out.println("Number of Head  Cat  :");
		System.out.println(animal1.head); // can't access head
		
		//Overriden method but will print from Cat Class
		animal1.makeNoise("MEOW "); //can access methods on Animal 
		
		//animal1.bigCatSound(); // Cannot access method define on class CAT.

	}//main
}//class
