
public class Animal {
	public int feet;
	public int head;
	public int tail;
	//Constructor
	protected Animal(int feet, int head, int tail) {
		//super();
		this.feet = feet;
		this.head = head;
		this.tail = tail;
	}
// Getter for our Animal Fields
	public int getFeet() {
		return feet;
	}
	public int getHead() {
		return head;
	}
	public int getTail() {
		return tail;
	}
	//Class Animal Sound Method
	public void makeNoise(String animalSound) {
		System.out.println( " animal Sound: ") ;
	}
}