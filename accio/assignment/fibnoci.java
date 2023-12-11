package accio.assignment;

public class fibnoci {
    public static void main(String[] args) {
        int n =255;
        int first =0,second =1;
       int num =0;
        for(int i=0;i<=n;i++){
            System.out.print(first+" ");
            if(i == n){
                num = first;
            }
            int next =first +second;
             second = first;
             first = next;
        }
        System.out.println();
        int ans = num%100;
        System.out.print(ans);
    }
}
//// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233

