
public class catAnimalAnswers  extends Cat{

  

    //Composite class to reference an instance of another class

    //main
	public static void main(String[] args) {
        Animal animal1 = new Cat(1000, 2, 1, 4, 1, 1;
		//Unable to access Child class instance variables
		//System.out.println(animal1.fur); // can't access fur from CAt class
		//System.out.println(animal1.eyes); // can't access  eyes from Cat class.

		System.out.println(" Number of Feet for Cat: ");
		System.out.println(animal1.feet); // can access feet from Animal
		Sysout
		
		System.out.println("Number of Head  Cat  :");
		System.out.println(animal1.head); // can  access head (decalred on both classes)
		
		//Overriden method but will print from Cat Class
		animal1.makeNoise("MEOW "); //can access methods on Animal 
		
		//animal1.bigCatSound(); // Cannot access method define on class CAT.
	}//main
}
