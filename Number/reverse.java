package Number;

public class reverse {
    public static void main(String[] args) {
        int n = 13589;
        int res =0;
		//Write your code here
        while(n!=0){//1000
            int mod = n%10;
                res = res*10 +mod;
                n=n/10;
        }
        System.out.print(res);
    }
}
