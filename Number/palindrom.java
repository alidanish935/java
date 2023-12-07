package Number;

public class palindrom {
    public static void main(String[] args) {
        // Given a number N, you need to check whether the given number is Palindrome or not. A number is said to be Palindrome when it reads the same from backward as forward.
        int n = 121;
        int org = n;
        int res =0;
        while(n>0){//121 >0
            int mod = n%10;
            res = res*10 + mod;//12
            n=n/10;
        }
        if(res == org){
            System.out.print(true);
        }else{
            System.out.print(false);
            
        }
    }
}

