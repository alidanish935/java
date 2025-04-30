package Recursion;

public class Practice {
    public static void main(String[] args) {
        int n = 6;
        // sum of all num from 1 to n
        // int res = sum(n);
        // System.out.println(res);
        
        // sum of values from range a to b
        // int a =1, b=7;
        // int res =sumrange(a,b);
        // System.out.println(res);
        
        // factorial of n
        // int res =fact(n);
        // System.out.println(res);
        
        // nth fibonacci
        // int res =fibo(n);
        // System.out.println(res);

        // optimised nth fibonacci
        // int res =optimiseFibo(n);
        // System.out.println(res);
        
        // power calculation
        // int a =2,b=5;
        // int pow = power(a,b);
        // System.out.println(pow);

        // optimisedPower calculation
        int a =2,b=7;
        int pow = optPower(a,b);
        System.out.println(pow);
         
    }
    public static int optPower(int a,int b){
        if(b==0)return 1;
        int p = optPower(a, b/2);
        if(b%2==0){
            return p*p;
        }else{
            return a*p*p;
        }
    }
    // public static int power(int a,int b){
    //     if(b==0)return 1;
    //     return a*power(a, b-1);
    // }

    // static int memo[]=new int[1001];
    // public static int optimiseFibo(int n){
    //     if(n==1)return 0;
    //     if(n==2)return 1;

    //     if(memo[n]!=0) return memo[n];
    //     memo[n]= optimiseFibo(n-1) +optimiseFibo(n-2);
    //     return memo[n];
    // }
    // public static int fibo(int n){
    //     if(n==1)return 0;
    //     if(n==2)return 1;
    //     return fibo(n-1) +fibo(n-2);
    // }
    // public static int fact(int n){
    //     if(n==1)return 1;
    //     return n*fact(n-1);
    // }
    // public static int sumrange(int a,int b){
    //     if(a==b)return a;
    //     return b+sumrange(a,b-1);
    // }
    // public static int sum(int n){
    //     if(n==1)return 1;
    //     return n+sum(n-1);
    // }
}
