package accio.String;

public class contains {
    public static void main(String[] args) {
        String str = "Danish";
        // System.out.println(str.contains("an"));
        int n =str.length();
        String k = "an";
        // implimentation
        boolean b =false;
        
        for(int i=0;i<n;i++){
            String sub ="";
            for(int j=i;j<n;j++){
                sub = sub +str.charAt(j);
                if(sub.equals(k)){
                 b=true;
                 break;
                // System.out.println(sub);
                }
            }
            if(b) break;
        }
        System.out.println(b);
    }
}
