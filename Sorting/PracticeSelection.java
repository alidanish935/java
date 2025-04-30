package Sorting;

import java.util.Arrays;

public class PracticeSelection {
    public static void main(String[] args) {
        int arr[]={2,1,8,9,-4,3,7};//  1 , 2 , 8 , 9 , 4 , 3 , 7 
        int n = arr.length;        //        st
                            
        for(int st =0;st<n;st++){
            int minIdx = st;
            for(int i=st+1;i<n;i++){
                if(arr[i]<arr[minIdx]){
                    minIdx =i;
                }
            }
            int t = arr[minIdx];
            arr[minIdx]= arr[st];
            arr[st]=t;
        }

        System.out.println(Arrays.toString(arr));
    }
}
