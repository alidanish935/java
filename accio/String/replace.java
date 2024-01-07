package accio.String;

public class replace {
    public static void main(String[] args) {
        // String str = "Danish";
        // int n =str.length();
        // System.out.print(str.replace('s','S'));
        
// =========== implimentation
        // String res ="";
        // for(int i=0;i<n;i++){
        //     if(str.charAt(i)=='s'){
        //         res = res+'S';
        //     }else{
        //         res=res+str.charAt(i);
        //     }
        // }
        // System.out.println(res);

// --------------replace string-------------------
        String s = "helloll";
        int n =s.length();

        String rep ="dd";
        String sub = "ll";
        int m = sub.length();
        String  res = "";
        for(int i=0;i<n;i++){
            int j=i;int k=0;
            while(j<n && k<m&&s.charAt(j)==sub.charAt(k) ){
                j++;k++;
                System.out.print(j+" j ");
            }
            if(m==k){
                res = res+rep;
                i=j-1; 
            }else{
                res = res+s.charAt(i);
            }
        }
        System.out.println(res);
    }
}
