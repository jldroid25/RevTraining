public class MainThreadDemo {

    public static void main(String[] args) {
        System.out.println("\n\n");

        
        System.out.println("Hello");
        Thread th = Thread.currentThread();
        /*
       -------- What we see display when run the code.------
        Main - is the name of the thread.
        5 - priority if the main thread.
        Main - name of the Thread Group ()
        */

        //Print all info of  the main
        System.out.println(th);
        //get the name of the thread
        System.out.println(th.getName());
        //get the priority of the thread
        System.out.println(th.getPriority());
        System.out.println("\n\n");

         //Create an object of the thread class
         MyThread mt = new MyThread();

         /* 
         Very Important Always Start the Thread (because O.S has no idea if we don't start)
         The Tread starts at Operating sys level.
         Then theread spawned, the child thread starts executing independtly.
         */
         mt.start();

        // For Calling the Main thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread Value " + i + "\n");

             //Put the thread to sleep longer for 5000 milliseconds
             try{
                Thread.sleep(5000);
                } catch(InterruptedException e){
                    e.printStackTrace();
                }   
            }  

    }//main
}//class