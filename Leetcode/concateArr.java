package Leetcode;

import java.util.Arrays;

public class concateArr {
    public static void main(String[] args) {
// Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] 
//and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).Specifically, ans is the concatenation of two nums arrays.
// Example 1:

// Input: nums = [1,2,1]  Output: [1,2,1,1,2,1]
// Explanation: The array ans is formed as follows:
// - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
// - ans = [1,2,1,1,2,1]
        int arr[] = {1,2,1};
        int n = arr.length;
        int ans[] = new int[n+n];
        int k=0;
        for(int i=0;i<n+n;i++){
            if(i<n){
                ans[i]=arr[i];
            }else{
                ans[i]=arr[k];
                k++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
