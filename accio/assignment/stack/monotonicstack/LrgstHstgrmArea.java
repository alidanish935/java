package accio.assignment.stack.monotonicstack;

import java.util.Stack;

public class LrgstHstgrmArea {
    public static void main(String[] args) {
        int arr[]={4,3,4,2,1,5};int n = arr.length;
        int area = maxArea(arr,n);
        System.out.println(area);
    }
    public static int maxArea(int arr[],int n){

        Stack<Integer> st = new Stack<>();
        int mxArea =0;
        for(int i=0;i<n;i++){
            int elem = arr[i];
            while(st.size()>0 && elem<arr[st.peek()]){
                int idx = st.pop();
                int RB =i;
                int LB = -1;
                if(st.size()>0){
                    RB = st.peek();
                }
                int width = RB - LB-1;
                int ht = arr[idx];
                mxArea = Math.max(mxArea, width * ht);
            }
            st.push(i);
        }
        while(st.size()>0){
            int idx = st.pop();
            int LB = -1;
            int RB = n;
            if(st.size()>0){
                RB = st.peek();
            }
            int width = RB - LB-1;
                int ht = arr[idx];
                mxArea = Math.max(mxArea, width * ht);
        }

        return mxArea;
    }
}
