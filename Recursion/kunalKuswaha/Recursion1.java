package Recursion.kunalKuswaha;
//  VVI  --> 1. While the function is not finished executing it will remain in stack
// 2. when the func finished executing, it is removed from stack and the flow of 
//programs is moved from where it was called
public class Recursion1 {
    public static void main(String[] args) {
        int n=1;

        System.out.println("main start---");
        // without recurion
        // print1(n);
        print1to5WithRecursion(n);
        System.out.println("main end---");
    }
    public static void print1(int n){
        System.out.println("print1 start---");
        System.out.println(n);
        print2(n+1);
        System.out.println("print1 end---");
    }
    public static void print2(int n){
        System.out.println("print2 start---");
        System.out.println(n);
        print3(n+1);
        System.out.println("print2 end---");
    }
    public static void print3(int n){
        System.out.println("print3 start---");
        System.out.println(n);
        print4(n+1);
        System.out.println("print3 end---");
    }
    public static void print4(int n){
        System.out.println("print4 start---");
        System.out.println(n);
        print5(n+1);
        System.out.println("print4 end---");
    }
    public static void print5(int n){
        System.out.println("print5 start---");
        System.out.println(n);
        System.out.println("print5 end---");
    }


    // instead of writting 5 diff func recursion will do in one func
    // when we are calling a function again and again, we can treat it as a 
    //saperate call in stack and each func will take saperate memory in stack

    // Qn. why do we need recursion?
    //It helps us in solving bigger/complex problems in a simple way.
    public static void print1to5WithRecursion(int n){
        if(n>5) return;

        System.out.println(n);
        print1to5WithRecursion(n+1);
    }

}
