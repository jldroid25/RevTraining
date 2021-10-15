public class CAstingDataType {
    // Program to cast Datatypes
    public static void main(String[] args) {
        System.out.println("\n\n");

        // initial value
        int i = 200;
        //Let's cast (convert) int i into a short data type
        short s = (short) i;
        System.out.println("variable 'i' was casted into a short: i =" + s);

        //Cast i to a double
        double d = (double) i;
        System.out.println("variable 'i' was casted into a double: i =" + d);

        //Cast int i into a Byte (8 bits in memory less than integer)
        //warning: this is downcasting,will result in data lost/unprecise results.
        byte b = (byte) i;
        System.out.println("variable 'i' was casted into a byte: i =" + b);



        System.out.println("\n\n");

        
    }
    
}
