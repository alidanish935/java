package String;

public class Compress {
    public static void main(String[] args) {
         // input ->  abbbccd      Output: ab3c2d

         String str = "abbbccd";
         int n = str.length();
         StringBuilder sb = new StringBuilder();
         
         for(int i=0;i<n;i++){

            int j = i;
            while(j+1<n && str.charAt(j)==str.charAt(j+1)){
                j++;
            }

            int ct = j-i+1;
            sb.append(str.charAt(i)+""+ct);
            i=j;
         }

         System.out.println(sb);
    }
}
