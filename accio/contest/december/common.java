package accio.contest.december;

import java.util.Arrays;
import java.util.Scanner;

public class common {
    public static void main(String[] args) {
        // link of qn -> https://course.acciojob.com/idle?question=1c6e106d-6550-45bd-a204-18a54f852f22
//Chirag and Divyanshu are the famous students of school, each of them have some toys. These toys are marked with a number. (some toys may be repeated).
//Vaibhav being new to the school wants to buy all the toys that both chirag and divyanshu have.
//Your task is to help vaibhav select the common toys.
   
// 3 5              output 4 9
// 4 9 5
// 9 4 9 8 4

   Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[] chirag = new int[n];
        int[] divyanshu = new int[m];
        for (int i = 0; i < n; i++) {
            chirag[i] = scn.nextInt();
        }
        for (int i = 0; i < m; i++) {
            divyanshu[i] = scn.nextInt();
        }
        int[] ans = NewBoyInSchool(n,m,chirag,divyanshu);
        Arrays.sort(ans);
        for(int i=0;i<ans.length;++i){
            System.out.print(ans[i] + " ");
        }
    }
    public static int[] NewBoyInSchool(int n, int m, int[] chirag, int[] divyanshu) {
        // write your code here
          Arrays.sort(chirag);//      4 5 9
          Arrays.sort(divyanshu);//   4 4 8 9 9
          int ct =0;
           for(int i=0;i<n;i++){
               if(i>0){
                   if(chirag[i]==chirag[i-1]){
                       continue;
                   }
               }
            for(int j=0;j<m;j++){
                if(j>0){
                   if(divyanshu[j]==divyanshu[j-1]){
                       continue;
                   }
               }
               if(chirag[i]==divyanshu[j]){
                   ct++;
               }
           }
       }   
          int arr[]=new int[ct];
          int k=0;
          for(int i=0;i<n;i++){                 //  4 5 9
             if(i>0){                           //  4 4 8 9 9
                 if(chirag[i]==chirag[i-1]){
                     continue;
                 }
             }
              for(int j=0;j<m;j++){
                if(j>0){
                  if(divyanshu[j]==divyanshu[j-1]){
                       continue;
                   }
                }
               if(chirag[i]==divyanshu[j]){
                   arr[k] = divyanshu[j];
                   k++;
               }
              }
          }
          return arr;
      }
}
