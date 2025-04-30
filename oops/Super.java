public class Super {
    
    public static void main(String[] args) {
        Child c = new Child();
        c.print();
    }
}
class Parent{
    public void print(int x){
        System.out.println("Parent "+ x);
    }
}
class Child extends Parent {
    // Child(){
    //     super();
    // }
    public void print(){  
        // super(10);  
        super.print(10);
        System.out.println("Child");
    }
}
