package accio.String;

public class sbStrReplace {
    public static void main(String[] args) {
        String s = "Helloll";
        int n = s.length();
        
        String sub = "ll";
        int m = sub.length();
        String rep = "pp";
        
        String res = "";
        
        for(int i = 0; i < n; i++) {
            
            int j = i;
            int k = 0;
            while(k < m && j < n && s.charAt(j) == sub.charAt(k)) {
                j++;
                k++;
            }
            
            if(k == m) {
                // System.out.println(i);
                res = res + rep;
                i = j-1;
            }
            else {
                res = res + s.charAt(i);
            }
        }
        System.out.println(res);
    }
}
