package Number;

public class ctTrailingZero {
    public static void main(String[] args) {
        int n = 45000;int ct =0;
        while(n!=0){
            int d = n%10;
            if(d==0)
                ct++;
            else{
                break;
            }
            n=n/10;
        }
        System.out.println(ct);
    }
}
