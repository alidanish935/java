package Recursion;

public class class8Jan24 {
    public static void main(String[] args) {
        int n =5;
        // System.out.println(sum(n)); 
        System.out.println(add(1,5)); 
    }
    // sum of all number upto n
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+ sum(n-1);
    }
    // sum of all no from a to b
    public static int add(int a,int b){
        // if(a>b){
        //     return 0;
        // }
        // return a+ add(a+1,b);
        if(b==0){
            return 0;//
        }
        return b+ add(a,b-1);
    }
}
