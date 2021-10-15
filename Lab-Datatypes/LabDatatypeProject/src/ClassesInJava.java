import java.util.Arrays;

public class ClassesInJava {
 //---------Practice Java Classes
    int id;

    //Getter
    public int getId(){
        return id;
    }
    //setter
    public void setId(int id){
        this.id = id;
    }

    // an instance variable belongs to the instance of the class .
    //the values are not present until an object is created. 
    //Instance variables are accessible by any method in that same class,
    // whereas a local variable is only available in its scope. 

      int value = 24;

    // Use the dot-operator to access instance variables

    // Because an instance variable belongs to an
    // instance of the class, anyobjects created of that class have their own copy
    // of the instance

    //Method Overloading : 
    //A method with same definition but different parameters.
    //Example 1
    public static int getFirst(int[] input){
        //always handle corner cases
        if(input == null || input.length == 0) return -1;
        Arrays.sort(input);
        return input[0];
    }
    //Overload the same method - Example 2
    //Just change the parameter type
    public static String getFirst(String[] input){
        //always handle corner cases
        if(input == null || input.length == 0) return " ";
        Arrays.sort(input);
        return input[0];
    }

   


    public static void main(String[] args) {
        System.out.println("\n\n");

        //intantiate class object 
        ClassesInJava c1 = new ClassesInJava();
        c1.setId(25);
        System.out.println(c1.getId());

        //accessing instance variable
        ClassesInJava v1 = new ClassesInJava();
        ClassesInJava v2 = new ClassesInJava();

        System.out.println(v1.value);//24
        System.out.println(v2.value);//24
        v1.value = 2;
        System.out.println(v1.value);//2
        System.out.println(v2.value);//24

        //data for method overloading
        int[] val = {123, 45, 56, 78, 90};

        String[] valString = {"first","second","third","fourth"};

        //calling getFirst()
        System.out.println(getFirst(val));

        
        //Calling the overloading option 
        System.out.println(getFirst(valString));








        System.out.println("\n\n");
        
    }//main
}//class
