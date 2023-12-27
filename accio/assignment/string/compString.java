package accio.assignment.string;

public class compString {
    public static void main(String[] args) {
      // input ->  abbbccd      Output: ab3c2d

      String s ="abbbccd";
      StringBuilder res = new StringBuilder("");
      int n=s.length();
      int ct=0;
      for(int i=0;i<n;i++){  //    a b b b c c d
          int j=i;
          while(j+1<n && s.charAt(i)==s.charAt(j+1)){
              j++;
          }
          ct=j-i+1;
         if(ct>1 ){
              res.append(s.charAt(i));
              res.append(ct);
          }else if(ct==1){
              res.append(s.charAt(i));
          }
          i=j;
      }      
       System.out.print(res);
    }
}
