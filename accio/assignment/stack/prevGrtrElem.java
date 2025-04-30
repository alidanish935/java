package accio.assignment.stack;

import java.util.Stack;

public class prevGrtrElem {
    public static void main(String[] args) {
        //   https://course.acciojob.com/idle?question=ac88cc75-d94b-411e-b84d-ca0334811442
         // index   0   1   2   3   4   5   6
         int arr[]={3 , 6,  4,  2 , 7,  1,  5};
     // prev grtr  -1  -1   6   4  -1   7   7
     
             int n = arr.length;
             int ans[]=prevgreater(arr,n);
             for(int i=0;i<n;i++){
                 System.out.print(ans[i]+" ");
             }
    }
    public static int[] prevgreater(int arr[],int n){
        int ans[]=new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            int elem = arr[i];
            while(st.size()>0 && elem>arr[st.peek()]){
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
