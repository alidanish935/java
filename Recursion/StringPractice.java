package Recursion;

public class StringPractice {
    public static void main(String[] args) {
        String s = "abba";
        int n = s.length();
        boolean palin = isPalin(s,0,n-1);
        System.out.println(palin);
    }

    private static boolean isPalin(String s, int st, int ed) {
        // TODO Auto-generated method stub
        if(st>=ed) return true;
        if(s.charAt(st)== s.charAt(ed)){
           return isPalin(s, st+1, ed-1);
        }
        return false;
    }
}
