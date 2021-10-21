
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

}//class
