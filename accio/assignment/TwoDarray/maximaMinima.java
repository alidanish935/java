package accio.assignment.TwoDarray;

import java.util.Arrays;

public class maximaMinima {
    public static void main(String[] args) {
        //link  ->  https://course.acciojob.com/idle?question=74e5a531-cd32-443b-9892-148cbc44006e

        // Given an n*n matrix mat find an element such that it is the smallest in a row and 
        //  largest in a column, if such an element does not exist return -1.
        int arr[][]={ {1 ,2 ,3},{4 ,5 ,6},{7 ,8 ,9}};
        int n= arr.length,m=arr[0].length;


        // 1st approach n^2 time complexity

        int sr[]=new int[n];
        int lc[]=new int[m];
        for(int r=0;r<n;r++){
            int mn = arr[r][0];
            for(int c=0;c<m;c++){
                if(mn>arr[r][c]){
                    mn = arr[r][c];
                }
            }
            System.out.print(mn+"  ");
            sr[r]=mn;
        }
        for(int c=0;c<m;c++){
            int mx=arr[0][c];
            for(int r=0;r<n;r++){
                if(mx<arr[r][c]){
                    mx=arr[r][c];
                }
            }
            lc[c]=mx;
            System.out.print(mx+"  ");
        }
        System.out.println(Arrays.toString(lc));
        System.out.println(Arrays.toString(sr));

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(sr[i]==lc[j]){
                    System.out.println(sr[i]);
                    return;
                }
            }
        }
        System.out.println("not exist");


    // another approach n^3 time 
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         boolean flag = true;
        //         for(int c=0;c<m;c++){
        //             if(arr[i][j]>arr[i][c]){
        //                 flag = false;
        //                 break;
        //             }
        //         }

        //         for(int r=0;r<m;r++){
        //             if(arr[r][j]>arr[i][j]){
        //                 flag = false;
        //                 break;
        //             }
        //         }
        //         if(flag){
        //             System.out.print(arr[i][j]);
        //             return;
        //         }
        //     }
        // }
        // System.out.print(-1);
    }
}
