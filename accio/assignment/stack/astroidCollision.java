package accio.assignment.stack;

import java.util.Stack;

public class astroidCollision {
    public static void main(String[] args) {
        
    }
    class Solution {
    public int[] asteroidCollision(int[] ast) {
        Stack<Integer> st = new Stack<>();
        int n = ast.length;
        for(int i=0;i<n;i++){
            int elm = ast[i];
            if(elm>0){// pushing all +ve elm means(moving right) 
                st.push(elm);
            }else{// if -ve elm
                while(st.size()>0 &&st.peek()>0&& st.peek()<Math.abs(elm)){//if stack is not empty
                    st.pop();// and top elm is +ve and top elm is smlr then abs of curr -ve elem 
                }//then top of stack will distroy . so its pop out from stack
                if(st.size()==0){//
                    st.push(elm);// now if stack is empty will add curr elm 
                }else{
                    if(st.size()>0 && st.peek()==Math.abs(elm)){// if stack is not empty
                        st.pop();// but top of elm is eql to abs of curr elem means both will distroy due to same mass
                    }else if(st.size()>0 && st.peek()>Math.abs(elm)){
                        continue;//if top of elm is grtr than abs of curr elem means curr elem will distroy so nothing will change only move ahead
                    }else{
                        st.push(elm);
                    }
                }
            }
        }
        int ans[]=new int[st.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}
}
