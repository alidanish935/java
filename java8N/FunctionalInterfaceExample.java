package java8N;


interface MyFunctionalInterface{
    void greet(String name);
}

class GreetImp implements MyFunctionalInterface{
    public void greet(String name){
        System.out.println("Hello "+ name);
    }
}
public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        GreetImp greeting = new GreetImp();
        greeting.greet("Danish");

                                                                                
        MyFunctionalInterface greeting1 = new GreetImp();
        greeting1.greet("Developer");


    }
}


// Difference:
// MyFunctionalInterface greeting = new GreetingImpl();

// Preferred way — you’re using the interface type for the reference.

// Makes your code flexible — you can later switch to any other class 
//implementing MyFunctionalInterface without changing this line.

// GreetingImpl greeting = new GreetingImpl();

// Uses the class type for the reference.

// Tied specifically to GreetingImpl, so if you want to change the implementation, 
//you’ll have to change this line.
