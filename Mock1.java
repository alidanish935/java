import java.util.Arrays;
import java.util.HashMap;

public class Mock1 {
    public static void main(String[] args) {
        // "A Hi how are you I am good. Hi I am fine how are you."
        String s = "A Hi how are you I am good. Hi I am fine how are you.";
        HashMap<String, Integer> hm = new HashMap<>();

        String str[] = s.split(" ");
        // System.out.println(Arrays.toString(str));

        for(String word:str){
            hm.put(word,hm.getOrDefault(word,0)+1);
        }
        for(String x:hm.keySet()){
            if(hm.get(x)>1){
                System.out.println(x+" "+hm.get(x));
            }
        }

        // String s = "Danish";
        // String s = "Danish";
        // StringBuilder sb = new StringBuilder();
        // String str[]= new String[]
        int n = s.length();
        // for(int i=n-1;i>=0;i--){
        //     // char ch1 = 
        //     sb.append(s.charAt(i));
        //     // System.out.println(sb.toString());
            
        // }

        // System.out.println(sb);
    }
}
