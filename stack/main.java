package stack;

import java.util.ArrayList;

public class main {
     static class myStack{
        ArrayList<Integer> stack ;
        myStack(){
            stack = new ArrayList<>();// dynamic stack (suggested)
        }
        int size;
        void push(int elm){
            stack.add(elm);
        }
        int pop(){
            if(stack.size()!=0){
                int ele =stack.remove(stack.size()-1);
                return ele;
            }else{
                System.out.println("Stack is empty");
                return -1;
            }
        }
        int peek(){
            if(stack.size()!=0) return stack.size()-1;
            else {
                System.out.println("Stack is empty");
                return -1;
            }
        }
        int size(){
            return stack.size();
        }
    }
    public static void main(String[] args) {
        myStack st = new myStack();
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st.size());
    }
}
