package CompositeClasses;

public class ClassB {

    //Composite: 
    // a class that has reference to an instance of another class
    ClassA classA = new ClassA();

    public static void main(String[] args) {
        
        ClassB cb = new ClassB();

        //Composite classes :
        //Now we can use our classB instantiated object to access methods
        // from ClassA i, e the setter & getter.
        
        cb.classA.setName("Taylor");
        System.out.println(cb.classA.getName());
    }   
}