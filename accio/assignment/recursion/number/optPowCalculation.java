package accio.assignment.recursion.number;

public class optPowCalculation {
    public static void main(String[] args) {
        // https://course.acciojob.com/idle?question=f1316d07-891c-4d64-99d9-fccb4a8f940c
        int n = 2,k=4; // output  2^3 = 8
        //brute force approach 
        int ans = pow(n,k);
        System.out.println(ans);
        
        // optimise way
        int res =power(n,k);
        System.out.println(res);
    }
    public static int power(int n,int k){
        if(k==0)return 1;
        int p = power(n,k/2);
        if(k%2==0){
            return p*p;
        }else{
            return n*p*p;
        }
    }
    public static int pow(int n,int k){
        if(k==0) return 1;
        return n*pow(n, k-1);
    }
}
