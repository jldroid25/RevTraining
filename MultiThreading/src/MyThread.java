public class MyThread  extends Thread {

    /*
    How to create our own Child Thread?

    This Option 1 an Demo Example not ideal for real programs:  
   -  Create a class that extends Thread class.
    
    Note:
    We don't want all the Functionalities of class
    we will override the built-in run()
    */

    @Override
    public void run(){
        // Body of Child'sThread code
        for (int i = 0; i < 5; i++) {
            System.out.println("Child thread value: " + i + "\n");
            
            //Put the thread to sleep for 50 milliseconds
            try{
            Thread.sleep(500);
            } catch(InterruptedException e){
                e.printStackTrace();
            }   
        } 
    }
    
    public static void main(String[] args) {
        System.out.println("\n\n");

       
        // //Create an Object to call the thread
        // MyThread mtCode = new MyThread();
        // mtCode.run();

        System.out.println("\n\n");

        
    }//main
}//class
