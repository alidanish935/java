package accio.String;

public class compareToFn {
    public static void main(String[] args) {
        String s1 = "abc";int n= s1.length();
        String s2 = "abc";int m=s2.length();
        System.out.println(s1.compareTo(s2));

        int res = 0;

        for(int i=0;i<Math.min(n,m);i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                res = s1.charAt(i)-s2.charAt(i);
                break;
            }
        }
        System.out.println(res);
    }
}
