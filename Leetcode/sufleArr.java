package Leetcode;

import java.util.Arrays;

public class sufleArr {
    public static void main(String[] args) {
    //     Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
    //     Return the array in the form [x1,y1,x2,y2,...,xn,yn].
// Input: nums = [2,5,1,3,4,7], n = 3  ,    Output: [2,3,5,4,1,7] 
// Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
        int arr[]={2,5,1,3,4,7};
        int n=3;
        int m = n+n;
        int ans[]=new int[m];
        int k=0, j=0,l=0;
        for(int i=0;i<m;i++){
            if(i%2==0){
                ans[k]=arr[j];
                k++;//1
                j++;
            }else{
                ans[k]=arr[n+l];
                k++;
                l++;
            }
        }
        // for(int i=0;i<m;i++){ 
        //     System.out.print(ans[i]);        //235417
        // }
        System.out.print(Arrays.toString(ans)); // [2, 3, 5, 4, 1, 7]
    }
}
