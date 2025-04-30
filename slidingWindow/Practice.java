package slidingWindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Practice {
    public static void main(String[] args) {
        // int arr[] = { 300, 100, 200,300,400};
        int arr[] = { 3,-1,4,7,-4,-9};// 100, 200,300,400};
        int k = 2;
        //  {-1,-1,0,-4,-4}


        // maxSumSubArray(arr, k);
        sumOfSubArray(arr, k);
            }
        
            private static void sumOfSubArray(int[] arr, int k) {
                // TODO Auto-generated method stub
                ArrayList<Integer> al = new ArrayList<>();

                // for(int i = 0; i < arr.length; i++){
                //     int j = i;
                //     int sum = 0;
                //     while (j < arr.length) {
                //         sum += arr[j];
                //         al.add(sum);
                //         j++;
                        
                //     }
                // }
                // int sum = 0, i = 0, j = 0;
                // while(j < arr.length)
                // {
                //     // calculation
                //     sum += arr[j];
                    
                //     if(j-i+1 < k){
                //         j++;

                //     }else if(j-i+1 == k){
                //         al.add(sum);

                //         // shrink
                //         sum = sum - arr[i];
                //         i++; j++;

                //     }
                // }

                int i = 0, j = 0;
               Queue<Integer> negEle = new LinkedList<>();
                while(j < arr.length){
                    // calculation 
                    if(arr[j] < 0){
                        negEle.add(arr[j]);
                    }

                    if(j-i+1 < k){
                        j++;

                    }else if(j-i+1 == k){
                        if(negEle.size()  == 0){
                            al.add(0);
                        }
                        else{
                            al.add(negEle.peek());
                            if(arr[i]==negEle.peek()){
                                negEle.remove();
                            }
                        }   
                        i++;j++;

                    }
                }

                System.out.println(al);
                // throw new UnsupportedOperationException("Unimplemented method 'sumOfSubArray'");
            }
        
            private static void maxSumSubArray(int[] arr, int k) {
        // TODO Auto-generated method stub
        int n = arr.length;

        int maxSum = 0, i = 0,j = 0;

        // int sum = 0;
        // while(j < n){
        //    //calculation
        //     sum += arr[j];
        //    if(j-i+1<k){
        //     j++;
        //    }else if(j-i+1 == k){
        //         maxSum = Math.max(maxSum, sum);
        //         //shrink
        //         sum = sum-arr[i];
        //         i++;j++;
        //    }
        // }
         int sum = 0;
        while(j < n){
            k--;
            sum = sum + arr[j];
    
            if(k == 0){
                maxSum = Math.max(maxSum,sum);
                sum = sum - arr[i];
                i++;
                k++;

            }
            j++;
        }

        System.out.println(maxSum);
    }
}
