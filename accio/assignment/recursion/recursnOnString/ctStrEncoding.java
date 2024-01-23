package accio.assignment.recursion.recursnOnString;

public class ctStrEncoding {
    public static void main(String[] args) {
        // https://course.acciojob.com/idle?question=d87d1a01-6956-4b27-a521-0499605191b1
        String s = "123";
       System.out.print( encoding(s,0));
    }
    static String encoding(String s,int i){
        int n = s.length();
        if(i==n)return "";
        // char c =(char) ((s.charAt(i)-'0')+96);
        // return 1+encoding(s, i+1);
        // String num =(char) (s.charAt(i)-'0'+96)+"" ;
        String nu = (char) ((s.charAt(i)-'0'*10+96)+(s.charAt(i+1)-'0'+96))+"";
        return nu;
    }
}
