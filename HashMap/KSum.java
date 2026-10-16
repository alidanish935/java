package HashMap;

import java.util.HashSet;

public class KSum {
    public static void main(String[] args) {
        int arr[]={2,8,2,6,-6,3,2};   // 0, 2, 8
        int k = 5,sum= 0,n = arr.length;
        index
        HashSet<Integer>set = new HashSet<>();
        // sub array with sum k
        for(int i=0;i<n;i++){
            sum += arr[i];
            int rem = sum-k;
            if(set.contains(rem)){
                System.out.println("found");return;
            }
            set.add(sum);
        }
        System.out.println("Not Found");
    }
}
