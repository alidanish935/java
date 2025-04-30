package accio.assignment.recursion.recursnOnString;

public class keypadComb {
    static String table[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args) {
        // https://course.acciojob.com/idle?question=6322632b-8190-4c42-b099-016314217d72
        String s="78";
        kpc(s,0,"");
    }
    public static void kpc(String s, int i, String ans){
        if(i==s.length()){
            System.out.println(ans);return;
        }
        int num = s.charAt(i)-'0';
        String word = table[num];
        for(int j=0;j<word.length();j++){
            char ch = word.charAt(j);
            kpc(s, i+1, ans+ch);
        }
    }
}
