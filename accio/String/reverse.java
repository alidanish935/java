package accio.String;

public class reverse {
    public static void main(String[] args) {
        String str = "danish";
        int n = str.length();
        // for(int i=0;i<str.length();i++){
        //     System.out.print(str.charAt(n-1-i));
        // }

        String ans ="";
        for(int i=0;i<str.length();i++){
            ans = str.charAt(i)+ans;
        }
        System.out.print(ans);
    }
}
