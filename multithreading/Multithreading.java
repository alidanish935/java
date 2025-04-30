package multithreading;

// public class Multithreading {
    
// }
//program to demostrate threads by runnable interface
 
import java.lang.*;
 
class M implements Runnable
{
 
public void run() // method available in runnable interface & run method is used to create a thread
    {
        try {
    System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        }
        catch (Exception e) {   }
          }
}
 
class Main {
    public static void main(String[] args)
    {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            Thread t1 = new Thread(new M());// creating a object of thread class so that start method is available to execute run method
            t1.start();// start method is used to execute a thread
        }
    }  }
 