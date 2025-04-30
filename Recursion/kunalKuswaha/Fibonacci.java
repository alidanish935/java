package Recursion.kunalKuswaha;

public class Fibonacci {
    public static void main(String[] args) {
        int n = fibo(4);
        System.out.println(n);
    }
    public static int fibo(int n){
        
        if(n==1) return 1;
        if(n==0) return 0;

        return fibo(n-1)+fibo(n-2);
    }
}
