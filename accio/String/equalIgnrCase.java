package accio.String;

public class equalIgnrCase {
    public static void main(String[] args) {
        String s1 = "Helloo"; 
        String s2 = "hello"; 
        int n1 = s1.length();
        int n2 = s2.length();

        if(n1==n2){
            boolean b= true;
            for(int i=0;i<n1;i++){
                char c1=s1.charAt(i);
                char c2=s2.charAt(i);
                if(c1 >='A' && c1<='Z'){
                    c1=  (char)(c1+32);
                }
                if(c2>='A' && c2<='Z'){
                    c2 = (char)(c2+32);
                }
                if(c1 !=c2){
                    b= false;
                    break;
                }
            }
            System.out.print(b);
        }else{
            System.out.print(false);
        }
    }
}
