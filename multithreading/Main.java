package multithreading;

// Java Program for sleeping the custom thread.
 
import java.io.*;
import java.lang.Thread;
 
class G extends Thread {
 
    public void run()
    {
                try {
            for (int i = 0; i < 5; i++)
            {
                           
                Thread.sleep(10000);
           
                System.out.println(i);
            }
        }
        catch (Exception e) {
       
           
            System.out.println(e);
        }
    }
 
}
 
    public class Main
    {
    public static void main(String[] args)
    {
       
        G obj = new G();
        obj.start();
    }
}
 
 
 
