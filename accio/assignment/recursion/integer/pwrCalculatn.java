package accio.assignment.recursion.integer;

public class pwrCalculatn {
    public static void main(String[] args) {
        // https://course.acciojob.com/idle?question=e556af86-9b3a-48a9-92ab-5905139c9d24
        int k=2,n=5;
        System.out.println(pow(k,n));
        System.out.println(optPow(k,n));
    }
    static int pow(int k,int n){
        if(n==0)return 1;
        
        return k*pow(k, n-1);
    }
    // optimize power calculation
    // https://course.acciojob.com/idle?question=f1316d07-891c-4d64-99d9-fccb4a8f940c
    static int optPow(int k,int n){
        if(n==0)return 1;
        int sp = optPow(k, n/2);
        if(n%2==0) return sp*sp;
        else return k*sp*sp;
    }
}
