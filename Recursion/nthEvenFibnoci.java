package Recursion;

public class nthEvenFibnoci {
    public static void main(String[] args) {
        int n =4;
        int ne = 3+(n-1)*3;
        System.out.println(fib(ne)); 
    }
    public static int fib(int n){
        if(n==1)return 1;
        if(n==2)return 1;
        return fib(n-1)+fib(n-2);
    }
}
