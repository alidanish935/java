package multithreading.practice;


// Thread using Thread class
public class MyThread extends Thread {

    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("value of i is "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
    
}
