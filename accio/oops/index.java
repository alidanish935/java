package accio.oops;

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
    public static void main(String[] args) {
        Product p1 = new Product();
        // p1.print();
        p1.update(0,"laptop",34000);
        // p1.print();
        Product p2 = new Product();
        p2.update(1, "mobile", 11000);
        p1.print();
        p2.print();
    }
}
