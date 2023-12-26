package accio.String;

public class subStrng {
    public static void main(String[] args) {
        String str = "Danish";
        int n =str.length();
        int st =1,ed=4;
        // System.out.println(str.substring(st, ed));
        
        String sub = "";
        for(int i=st;i<ed;i++){
            System.out.print(str.charAt(i));
        }
        

    }
}
