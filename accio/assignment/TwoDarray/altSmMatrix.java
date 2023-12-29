package accio.assignment.TwoDarray;

import java.util.Scanner;

public class altSmMatrix {
    public static void main(String[] args) {
        //link  ->  https://course.acciojob.com/idle?question=0ca3a15a-7003-4c33-850f-7e1e65798015

         Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int [][]mat=new int[n][n];
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                mat[i][j]=sc.nextInt();
            }
        }
        alternateMatrixSum(mat,n);  
        System.out.println('\n');

    }
    public static void alternateMatrixSum(int [][]mat, int n) {
        // your code here
     int b = 0,w=0;
     for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
             if((i%2==0 &&j%2==0)||(i%2!=0 &&j%2!=0)){
                 b = b+mat[i][j];
             }else if((i%2==0 &&j%2!=0)||(i%2!=0 &&j%2==0)){
                 w= w+mat[i][j];
             }
         }
     }
     System.out.println(b);
     System.out.println(w);
 }
}
