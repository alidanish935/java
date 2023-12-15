package accio.assignment.array;

import java.util.Arrays;

public class smOfArExptSlf {
    public static void main(String[] args) {
        // Given an array of n integers where n > 1, return an array output such that output[i] is equal to the sum of all the elements of nums except nums[i]. All integers in array are greater than 0.
        // Input  -  4 3 2 10       Output  -   15 16 17 9
        int nums[]= {4,3,2,10};
        int n = nums.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int sm = 0;
            for(int j=0;j<n;j++){
                if(j!=i){
                    sm += nums[j];
                }
            }
            arr[i]=sm;
        }
        System.out.print(Arrays.toString(arr));
    }
}
