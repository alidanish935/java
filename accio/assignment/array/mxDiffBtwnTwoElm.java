package accio.assignment.array;

import java.util.Arrays;

public class mxDiffBtwnTwoElm {
    public static void main(String[] args) {
        int arr[]={2,5,3,9,4}; // output -> 9-1=8
        int n = arr.length;int mx=Integer.MIN_VALUE,mn = Integer.MAX_VALUE;
    //--------------1st approach brute force bad approach
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //        int  diff = Math.abs(arr[i]-arr[j]) ;
        //          if(diff>mx) mx = diff;
        //     }
        // }
        // System.out.println(mx);

    //---------------2nd Approach-----------------
    // Arrays.sort(arr);
    // System.out.println(arr[n-1]-arr[0]);

    //---------------3rd Approach-----------------
    for(int i=0;i<n;i++){
        if(arr[i]>mx) mx=arr[i];
        if(arr[i]<mn) mn=arr[i];
    }
    System.out.println(mx-mn);
    }
}
