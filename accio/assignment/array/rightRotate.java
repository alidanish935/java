package accio.assignment.array;

import java.util.Arrays;
import java.util.Scanner;

public class rightRotate {
    //  https://course.acciojob.com/idle?question=0ce5e333-acb5-4999-82d3-329ddda3cb43
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        rightRotate(arr, n, k);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

     public static void rightRotate(int[] arr, int n, int k) {
        // write code here
        int res[]=new int[n];
    // 1st approach
        // k=k%n;if(k<0)k=k+n;
        // for(int i=0;i<n/2;i++){
        //     int temp = arr[i];
        //     arr[i]=arr[n-1-i];
        //     arr[n-1-i]=temp;
        // }
        // for(int i=0;i<k/2;i++){
        //      int temp = arr[i];
        //     arr[i]=arr[k-1-i];
        //     arr[k-1-i]=temp;
        // }
       
        // for(int i=k;i<(n+k)/2;i++){
        //     int temp = arr[i];
        //     arr[i]=arr[n+k-1-i];
        //     arr[n+k-1-i]=temp;
        // }
// 2nd approach
        for(int i=0;i<n;i++){
            res[(i+k)%n]=arr[i];//{0,0,1,2}
            // System.out.print(res[(i+k)%n]+" ");
        }
        System.out.print(Arrays.toString(res));
       // arr=res; // not possible will give error
            System.out.println();

        
    }
}
