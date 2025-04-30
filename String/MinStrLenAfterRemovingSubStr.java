package String;

public class MinStrLenAfterRemovingSubStr {
    public static void main(String[] args) {
        int i=10;
        String s = "ABFCACDB";
        while(s.contains("AB")||s.contains("CD")){
            if(s.contains("AB")){
                
                s=s.replace("AB","");
                System.out.print(s+" ");
                // System.out.print(" 1 ");
            }
            
            if(s.contains("CD")){
                
                s=s.replace("CD","");
                // System.out.print(" 2 ");
            }
            if(i==0)break;i--;

            // System.out.print(s+" ");
        }
        System.out.println(s.length());

        // atem.out.println(s);
    }
}
