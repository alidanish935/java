package accio.assignment.string;

public class palindromStr {
    public static void main(String[] args) {
        String str = "a man, a plan, a canal Panama";
        int n=str.length();
        int st = 0,ed=n-1;
     while(st<ed){
         char ch1 = str.charAt(st);
         char ch2 = str.charAt(ed);

         if(ch1>='A' && ch1<='Z')
             ch1 = (char) (ch1+32);
         if(ch2>='A' && ch2<='Z')
             ch2 = (char) (ch2+32);       
         if(!(ch1>='a'&&ch1<='z'))
             st++;
         else if(!(ch2>='a'&&ch2<='z'))
             ed--;
         else if(ch1==ch2){
             ed--;
             st++;
         }else
            System.out.print("not palindrom");
            return ;     
        }   
        System.out.print("palindrom");
       return ; 
    }
}
