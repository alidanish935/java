package Number;

import java.util.Scanner;

public class nestedLp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

     // Print all numbers which are prime in the range of 1 to n
      for(int i=1;i<=n;i++){
        int m=i;
        int ct =0;
        for(int j=1;j<=m;j++){
            if(n%j==0)
                ct=ct+1;
        }
        if(ct==2){
            System.out.println(m+" is prime");
        }
      } 
      
      

    }






}
