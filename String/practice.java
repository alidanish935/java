package String;

public class practice {
    public static void main(String[] args) {
        String str = "danish";
        // String ans = "";
        int n = str.length();
        // for(int i=0;i<n;i++){
        //     ans=str.charAt(i);
        // }
        char first = str.charAt(0);
        char last = str.charAt(n-1);
        String ans = last + str.substring(1,n-1)+first;
        // System.out.println(str.substring(1, n-1));
        System.out.println(ans);
    }
}
