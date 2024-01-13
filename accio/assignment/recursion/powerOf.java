package accio.assignment.recursion;

public class powerOf {
    public static void main(String[] args) {
        // link        https://course.acciojob.com/idle?question=f1316d07-891c-4d64-99d9-fccb4a8f940c
        int x=2,y=3; //output - 8

        // approach 1 in O(n) time
        // System.out.println(pow1(x,y)); 

        // approach 2 in n logn time
        System.out.println(pow2(x,y)); 
    }
    public static long pow1(int x,int y){
        if(y==0) return 1;
         return x*pow1(x, y-1);
    }
    public static long pow2(int x,int y){
        if(y==0) return 1;
        long p= pow1(x, y/2);
        if(y%2==0)
         return p*p;
        else
         return x*p*p;
    }
}
