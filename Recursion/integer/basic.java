package Recursion.integer;

public class basic {
    public static void main(String[] args) {
        int n = 5;
        // sum of all num from 1 to n
        // int res = sum(n);
        // System.out.println(res);
        
        // sum of values from range a to b
        // int a =1, b=5;
        // int res =sumrange(a,b);
        // System.out.println(res);
        
        // factorial of n
        // int res =fact(n);
        // System.out.println(res);
        
        // nth fibonacci
        int res =fibo(n);
        System.out.println(res);
         
    }
    public static int fibo(int n){
        if(n==1)return 0;
        if(n==2)return 1;

        return fibo(n-1)+fibo(n-2);
    }
    public static int fact(int n){
        if(n==1) return 1;
        return n* fact(n-1);
    }
    public static int sumrange(int a,int b){
        if(a == b){
            return a;
        }

        return a + sumrange(a+1, b);
    }
    public static int sum(int n){
        if(n ==0){
            return 0;
        }

        int sm = n+sum(n-1);
        return sm;
    }
}
