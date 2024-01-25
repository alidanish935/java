package accio.oops;
// notes link -> 23jan ->https://www.onlinegdb.com/jkoPYW0aO
                //24jan24 ->https://www.onlinegdb.com/LbYXe6e-5
public class index {
    public static class Product{
        int pid;
        String name;
        double price;
        void update(int id, String nm, double p){
            pid = id;
            name = nm;
            price = p;
        }
        void print(){
            System.out.println("Product Id "+pid);
            System.out.println("Product Name "+name);
            System.out.println("Price "+price);
        }
    }
    public static class Counter{
        int ct =0;
        static int ct2 = 1;
        Counter(){
            ct=0;
        }
        void update(){
            ct++;
            ct2++;
        }
        void print(){
            System.out.println(ct+" "+ct2);
        }
    }
    public static void main(String[] args) {
        Product p1 = new Product();
        // p1.print();
        p1.update(0,"laptop",34000);
        // p1.print();
        Product p2 = new Product();
        p2.update(1, "mobile", 11000);
        // p1.print();
        // p2.print();
        Counter c1= new Counter();
        Counter.ct2=5;
        // Counter.ct=5;  // we cant access it bcz ct is non-static
        c1.ct=2;  // we can access non-static ct bcz it is accessed through object c1
        c1.update();
        c1.print();
    }
}
