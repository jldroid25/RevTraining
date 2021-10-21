public class ExeptionHandling extends ExceptionDataFile{

//------ A class to invoke the method in ExceptionFIle------- 
    public static void main(String[] args) {
        System.out.println("\n\n");

        //myExceptionFunctionExample(2,0);
        //checkNumber(1);

        //--Uncheck Exception --> handle this programatically instead
        //Calling Method & handling the throws Exception upon calling
        try {
            goodDivisionMethod(2, 0);
        } catch(ArithmeticException e) {
        System.out.println(e.getMessage());
      }

    }//main
}//class