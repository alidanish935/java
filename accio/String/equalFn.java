package accio.String;

public class equalFn {
    public static void main(String[] args) {
        String s1 = "danish";int n1 = s1.length();
        String s2 = "Danish";int n2 = s2.length();
        // System.out.println(s1.equals(s2));

        // // implimentation equalFn
        // if(n1!=n2)
        //     System.out.println(false);
        // else{
        //     for(int i=0;i<n1;i++){
        //         if(s1.charAt(i)!=s2.charAt(i)){
        //             System.out.println(false);
        //             return;
        //         }
        //     }
        //     System.out.println(true);
        // }

        // implimentation equalIgnorCase
        if(n1!=n2)
            System.out.println(false);
        else{
            for(int i=0;i<n1;i++){
                char c1 = s1.charAt(i);
                char c2 = s2.charAt(i);
                if(c1>='A' && c1<='Z'){
                    c1 = (char)(c1 +32);
                }
                if(c2>='A' && c2<='Z'){
                    c2 = (char)(c2 +32);
                }
                if(c1!=c2){
                    System.out.println(false);
                    return;
                }
            }
            System.out.println(true);
        }
            
    }
}
