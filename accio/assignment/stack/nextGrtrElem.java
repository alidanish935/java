package accio.assignment.stack;

import java.util.Stack;

public class nextGrtrElem {
    public static void main(String[] args) {
        // https://course.acciojob.com/idle?question=73772158-09d5-4636-aa41-def2d3158102

        // index   0   1   2   3   4   5   6
        int arr[]={3 , 6,  4,  2 , 7,  1,  5};
    // next grtr   6   7   7   7  -1   5  -1

        int n = arr.length;
       // int ans[]=nextgreater(arr,n);
        int ans[]=nextgreater2(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
    // approach1
    public static int[] nextgreater2(int arr[],int n){
        Stack <Integer> st = new Stack<>();
        int ans[]=new int[n];//
        for(int i=n-1;i>=0;i--){
            int elem = arr[i];
            while(st.size()>0 && elem >=st.peek()){
                st.pop();
            }
            if(st.size()>0){
                ans[i]=st.peek();
            }else{
                ans[i]=-1;
            }
            st.push(elem);
        }
        return ans;
    }

    public static int[] nextgreater(int arr[],int n){
        int ans[]=new int[n];//
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){//6<7
            int elem = arr[i];//5
            //                    5>1
            while(st.size()>0 && elem>arr[st.peek()]){
                int idx = st.pop();//5
                ans[idx]=elem;//5
            }
            st.push(i);//  4 6
        }
        while(st.size()>0){
            int idx = st.pop();
            ans[idx]=-1;
        }
        return ans;//6, 7, 7, 7, , 5,
    }
}
