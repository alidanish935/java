package accio.String;

public class indexOf {
    public static void main(String[] args) {
        String s = "Danish";
        //System.out.println(s.indexOf('s'));

        //implimentation
        int ind=-1;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='s'){
                ind =i;
            }
        }
        System.out.println(ind);
    }
}
