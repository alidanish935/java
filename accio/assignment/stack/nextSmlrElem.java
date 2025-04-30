package accio.assignment.stack;

import java.util.Stack;

public class nextSmlrElem {
    public static void main(String[] args) {
         // index   0   1   2   3   4   5   6
         int arr[]={3 , 6,  4,  2 , 7,  1,  5};
    // next grtr    2   4   2   1   1  -1  -1
     
             int n = arr.length;
             int ans[]=nextsmaller(arr,n);
             for(int i=0;i<n;i++){
                 System.out.print(ans[i]+" ");
             }
    }
    public static int[] nextsmaller(int arr[],int n){
        Stack<Integer> st = new Stack<>();
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            int elem = arr[i];
            while(st.size()>0 && elem<arr[st.peek()]){
                int idx = st.pop();
                ans[idx]=elem;
            }
            st.push(i);
        }
        while(st.size()>0){
            int idx = st.pop();
            ans[idx]=-1;
        }

        return ans;
    }
}
