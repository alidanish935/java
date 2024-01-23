package accio.assignment.recursion;

public class evenFibnocci {
    static long memo[]=new long[1001];
    static long mod= 1000000007;
    public static void main(String[] args) {
        long n=18;
        evenFib(n);
    }
    public static void evenFib(long n){
        long en = 3+(n-1)*3;
        System.out.println(fib(en)) ;
    }
    static long fib(long n){
        if(n==1)return 1;
        if(n==2)return 1;
        if(memo[(int)n]!=0){
            return memo[(int)n];
        }
        memo[(int)n] =(fib(n-1)+fib(n-2))%mod;
        return memo[(int)n];
    }
}
