package accio.assignment.stack;

import java.util.Stack;

public class largestHistogrmArea {
    public static void main(String[] args) {
        //https://course.acciojob.com/idle?question=50799402-ffd5-4907-9f91-555993ff4b62
        int arr[]={4,3,4,2,1,5};int n = arr.length;

        //---------------------- brute force approach-----------
        //int ans = largestArea(arr,n);

        //---------------- approach 2 using stack
        int ans = largestArea2(arr,n);

        System.out.println(ans);
    }
    // ----------------- brute force approach ----------------------
    public static int largestArea(int arr[],int n){
        int maxArea =0;
        
        for(int i=0;i<n;i++){
            int minHeight = arr[i];
            for(int j=i;j<n;j++){
                minHeight = Math.min(minHeight,arr[j]);
                maxArea = Math.max(maxArea,minHeight* (j-i+1));
            }
        }
        
        return maxArea;
    }
    // ------------------------ btute force end    ----------------------

    // -----------------approach 2 using stack------------------
      // one more approach in monotonicstack folder 
    public static int largestArea2(int arr[],int n){
        int maxArea=0;
        int nser[]=nextSmlrElemRight(arr,n);
        int nsel[]=nextSmlrElemLeft(arr,n);
           for(int i=0;i<n;i++){
                int width = nser[i]-nsel[i]-1;
                maxArea = Math.max(maxArea, arr[i]*width);
            }
            return maxArea;
        }
        public static int[] nextSmlrElemLeft(int arr[],int n){
            Stack<Integer> st = new Stack<>();//{4,3,4,2,1,5}
            int ans[]=new int[n];

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
        public static int[] nextSmlrElemRight(int arr[],int n){
        Stack<Integer> st = new Stack<>();//{4,3,4,2,1,5}
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
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
