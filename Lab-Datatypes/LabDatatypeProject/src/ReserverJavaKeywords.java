public class ReserverJavaKeywords {
    //---------------Reserve Keyowrds in Java ------------//

    /*
     - The 'This' Keyword:
     In Java the 'this' refers to the current object.

    - An instance variable is shadowed if a parameter or local variable
      has the same name as it. The effect results in the instance variable
      not being available for manipulation.

    - Use of the keyword 'this' to refere to data members that are being shadowed.

    public class SomeClass {

            long serialNumber;

            //call a constructor from  const below with the required param
            
            public SomeClass() {
                //Using this as a method to set param
                //Importan: can only use this() on constructors in same class
                //this() must be the first line in your constructor
                

                this(12L);// using this method with parameter value 
                System.out.println("Inside No arg-constructor")
            }

            //constructor
            public SomeClassMethod(long SerialNumber){
                //here this refers to current object's field not the method parameter
                this.serialNumber = serialNumber;
                System.out.println("Inside with arg-constructor")

            }
    }

    --- Also:
      You can use 'this()' to call a constructor from another 
      constructor in the same class.

        */

    /*  
    The 'final' Keyword in Java:
    - Something marked final means that it cannot change its value.
    
    - If a viriable is maked final, the code cannot change its value once set.
    - If amethod is marked final, then code in subclass cannot override it.
    - If a class is marked final, then another class cannot extend it.

    */
     /*  
    The 'Static' Keyword in Java:
    Marks an item as a member of the class.
    
    - basically this means any methods or variable that you label as static are available
    without having to create objects of that class type.
    
    Therefore: the data can easily be manupilated since no instance need to be created
    to access that static var, method, data.

    */

    /*
    The 'super' Keyword in Java:
    - The 'super' keyword is always a reference to the current object's parent class.
    //Refer to a method of the object's parent class
     super.someMethod();

     - Essentially calls the super-class's implementation of someMethod()

     Good use of it:
     If a child class inherits a methods from parent & most of the
     method's code is the same with a one-line difference.
     You can use the super keyword on the parent's obj method, then just
     add your new line below it . 

     //define same inherit method in child class
     public void turnPage() {

         //inherit all the parents methods goodies with 'super'
         super.turnpage();

         //Just add your new line (the diff)
         unfoldpic(curPage)

     }
    */

    /*
    The 'abstract' Keyword in Java:
    - You must mark the class abstract when define one.

    Abstract labels a class that cannot be instantiated 
    and mey have empty methods.

    Leave it for the other developer to implement as desired.

    - They have no body.
     public abstract int add(int i, int j);

    - Abstract classes must be defined /implemented 
      in the subclass that inherit them.

      Important:
    - Classes with abstract methods must be marked abstract.
      - (if a class has abstract methods the class must be marked 'abstract')
      
    - But An abstract class doesn't have to have an abstract method.
      (but a class marked with abstract it doesn't need abstract methods.)
    */

    /*
    The '' Keyword in Java:
    */


    public static void main(String[] args) {

        System.out.println("\n\n");

        System.out.println("\n\n");
        
    }//main
}//class
