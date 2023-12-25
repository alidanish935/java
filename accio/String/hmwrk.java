package accio.String;

public class hmwrk {
   public static void main(String[] args) {
 // Primitive / Pre-defined / Inbuilt - int, long, float, char, boolean, double
 // Derived / User-defined / Reference - String, Arrays, Objects
     // Count the frequency of a given character in String
        // Count the number of vowels in a String
        // Count number of words in a given string 
        
        String s = "   hello world I am Danish    ";
        int n = s.length();
        
        // System.out.println(s.trim());
        // System.out.println();

        // int st=0;
        // for(int i=0;i<n;i++){
        //     if(s.charAt(i)==' '){
        //         st++;
        //     }else{
        //         break;
        //     }
        // }
        // int ed=n-1;
        // for(int i=n-1;i>=0;i--){
        //     if(s.charAt(i)==' '){
        //         ed--;
        //     }else{
        //         break;
        //     }
        // }
        // System.out.println(st+" "+ed);
        // int ct =0;
        // for(int i=st;i<=ed;i++){
        //     if(s.charAt(i)==' ')
        //         ct++;
            
        // }
        // System.out.println(ct+1);

    // equals function check both string are equal or not
        String s1 = "Hello";
        String s2 = "hello";
        // if(s1.equals(s2)) {
        //     System.out.println("Equals");
        // }
        // else {
        //     System.out.println("Not equals");
        // }
        //own implimentation
        int n1=s1.length();
        int n2=s2.length();
        // if(n1!=n2){
        //     System.out.println("Not Equal");
        //     return;
        // }
        // for(int i=0;i<n1;i++){
        //      if(s1.charAt(i)!=s2.charAt(i)){
        //         System.out.println("Not Equal");
        //         return;
        //     }
        // }
        
        // System.out.println("Equal");
        
       String s3 = "";
        for(int i=0;i<n1;i++){
            if(s1.charAt(i)>='A' && s1.charAt(i)<='Z'){
                s3 = s3+ (char)(s1.charAt(i)+32);
            }else{
                s3 = s3+s1.charAt(i);
            }
        }
        System.out.println(s3); 
       String s4 = "";
        for(int i=0;i<n1;i++){
            if(s2.charAt(i)>='A' && s2.charAt(i)<='Z'){
                s4 = s4+ (char)(s2.charAt(i)+32);
            }else{
                s4 = s4+s2.charAt(i);
            }
        }
        System.out.println(s4);

         int n3=s3.length();
        int n4=s4.length();
        if(n3!=n4){
            System.out.println("Not Equal1");
            return;
        }
        for(int i=0;i<n3;i++){
             if(s3.charAt(i)!=s4.charAt(i)){
                System.out.println("Not Equal2");
                return;
            }
        }
        
        System.out.println("Equal");
        // if(s1.equalsIgnoreCase(s2)) {
        //     System.out.println("Equals");
        // }
        // else {
        //     System.out.println("Not equals");
        // }

   } 
}
