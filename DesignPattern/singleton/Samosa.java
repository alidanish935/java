
package DesignPattern.singleton;

public class Samosa{

    private  static Samosa samosa;

    private Samosa(){

    }

    // but here problem is its not synchronised, if there will be multiple threads
    // and if they will enter at same time then multiple object may be created
    
    //so one possible way is public static synchronized Samosa getSamosa(){
    // but here completely mathod is synchronised
    public static Samosa getSamosa(){
        // System.out.println("Danish Ali");
        if (samosa == null) {
            samosa = new Samosa();
        }
        return samosa;
    }

    // best way is using synchronized block
    public static Samosa getSamosa1(){

        if (samosa == null) {
            synchronized(Samosa.class){
                samosa = new Samosa();
            }
        }
        return samosa;
    }

}