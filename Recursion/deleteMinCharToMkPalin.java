package Recursion;

public class deleteMinCharToMkPalin {
    public static void main(String[] args) {
        String s = "abbac";
        int n = s.length();
        System.out.println(palin(s,0,n-1)) ;
    }
    static int palin(String s,int si, int ed){
        if(si>=ed)return 0;
        if(s.charAt(si)==s.charAt(ed)){
            return palin(s, si+1, ed-1);
        }
        return 1+Math.min(palin(s, si+1, ed), palin(s, si, ed-1));
    }
}
