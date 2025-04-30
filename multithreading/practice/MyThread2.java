package multithreading.practice;



public class MyThread2 implements Runnable {

    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Runnable "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        MyThread2 t2 = new MyThread2();
        Thread thr = new Thread(t2);
        thr.start();
    }
    
}
