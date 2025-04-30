package Recursion.integer;

public class Power {
    public static void main(String[] args) {
        // calculate power (like 2^4 = 16)
        int x= 2,y=8;
        // int power=pow(x,y);
        // System.out.println(power);

        int optimisePower=optPow(x,y);
        System.out.println(optimisePower);
    }
    public static int optPow(int x,int y){
        if(y==0)return 1;

        int p = optPow(x, y/2);
        if(y%2==0){
            return p*p;
        }else{
            return 2*p*p;
        }
    }

    // here 
    public static int pow(int x,int y){
        if(y==0){
            return 1;
        }
        return x*pow(x, y-1);
    }
}
