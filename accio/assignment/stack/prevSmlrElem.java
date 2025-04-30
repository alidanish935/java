package accio.assignment.stack;

import java.util.Stack;

public class prevSmlrElem {
    public static void main(String[] args) {
          // index   0   1   2   3   4   5   6
          int arr[]= {4,3,4,2,1,5};//{3 , 6,  4,  2 , 7,  1,  5};
      // prev smlr  -1   3   3  -1   2  -1   1
          
          int n = arr.length;
          int ans[]=prevsmaller(arr,n);
          for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
          }
    }
    public static int[] prevsmaller(int arr[],int n){
        int ans[]=new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=n-1;i>=0;i--){
            int elem = arr[i];
            while(st.size()>0 && elem<arr[st.peek()]){
                int idx = st.pop();
                ans[idx]=i;
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
