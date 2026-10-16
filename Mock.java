import java.util.*;
public class Mock {
    public static void main(String[] args) {
        
        String str = "paradox";// paizwle
        StringBuilder sb = new StringBuilder();
        int n = 3;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(i<n-1){
                sb.append(ch);
                continue;
            }else{
                char c = (char)('z' - (ch - 'a'));
                sb.append(c);
            }
          
            // if(ch < 'm'){
            //     System.out.println((ch - 'a')+26);
            //     char c = (char) ((ch - 'a')+26);
            //     System.out.println(c);
            //     sb.append(c);
            // }else{
            //     char c = (char) ((ch - 'a')-26);
            //     System.out.println((ch - 'a')-26);
            //     sb.append(c);

            // }
        }
        System.out.println(sb.toString());
    }
}
