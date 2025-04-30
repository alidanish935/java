package accio.String;

public class practice {
    public static void main(String[] args) {
        String s = "413";
        encoding(s,0,"");
    }
    static void encoding(String s , int i,String ans){
        int n = s.length();
        if(i==n) {
            System.out.println(ans);return;
        }
        if(s.charAt(i)=='0')return ;
        // handling case for all individual character
        char ch =(char) ((s.charAt(i)-'0')+96);
       encoding(s, i+1, ans+ch);
        
        // handling case for taking tw0 digit at atime like , 12 ,23 
        if(i+1<n){
            int num =  (s.charAt(i)-'0')*10+ s.charAt(i+1)-'0';
            if(num<=26){
             char c = (char) (num+96);
             encoding(s, i+2, ans+c);
            }
           // System.out.println(c);
        }

    }
}
