package accio.assignment.slidingWindow;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class maxOfEachWndo {
    public static void main(String[] args) {
        int arr[]={1 ,3 ,-1, -3, 5, 3 ,6 ,7};
        int n = arr.length;int k=3;

        int ans[] = new int[n-k+1];
        //--------------------brute force approach

        for(int i=0;i<n-k+1;i++){
            int max = Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                max = Math.max(max,arr[j]);
            }
            ans[i]=max;
        }
        System.out.println(Arrays.toString(ans));
        //-----------------------------------------------------------
        // -  implimentation using deque

        Deque<Integer> dq = new ArrayDeque<>();//{1 ,3 ,-1, -3, 5, 3 ,6 ,7};
        int windoNumber=0;
        for(int i=0;i<n;i++){
            int elem = arr[i];//-1
            while (dq.size()>0 && elem>arr[dq.getLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);//1->3 , 2->-1 , 3->-3

            int si = i-k+1;//2 - 3+1 => 0
            while(dq.size()>0 && dq.getFirst()<si){//1 < -1
                dq.removeFirst();
            }
            if(i>=k-1){//2 >= 3-1
                ans[windoNumber]=arr[dq.getFirst()];
                windoNumber++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
