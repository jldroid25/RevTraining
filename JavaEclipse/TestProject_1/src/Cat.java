
public class Cat  extends Animal {
	
	//public int fur;
	public int eyes;
	public int  mouth; 
	public int head;
	
	//Constractuctor 
	private Cat(long fur, int eyes, int mouth, int feet, int head , int tail) {
		super(eyes, mouth, feet);
		//this.fur = fur;
		this.eyes = eyes;
		this.mouth = mouth;
	}
	
	//Class Animal Sound Method
		public void biCatSound(String tigerSound) {
			System.out.println( " I AM STARVING NEED TO EAT HUMAN ASAP !") ;
		}

		//Class Animal Sound Method
		public void makeNoise(String animalSound) {
			
			System.out.println( " animalSound From CAT Class") ;
		}
		
	//main
	public static void main(String[] args) {
		
		Animal animal1 = new Cat(1000, 2, 1, 4, 1, 1);
	
		//System.out.println(animal1.fur);// can't access fur from CAt class
		//System.out.println(animal1.eyes);// can't access  eyes from Cat.

		System.out.println(animal1.feet);// can access feet from Animal
		System.out.println(animal1.head);// can't access fur
		
		animal1.makeNoise("MEOW "); //can access methods on Anilca
		
		//animal1.bigCatSound(); // Cannot access 



		
	}//main

}//class
