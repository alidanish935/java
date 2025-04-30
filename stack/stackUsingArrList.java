package stack;

import java.util.ArrayList;

public class stackUsingArrList {
    ArrayList<Integer> stack=new ArrayList<>();//static arraylist not prefered see main.java
    int size ;
    void push(int d){
        stack.add(d);
    }
    void peek(){
        if(stack.size()==0){
            System.out.println("Stack is Empty");
        }else{
            System.out.println(stack.get(stack.size()-1));
        }
    }
    int pop(){
        if(stack.size()==0){
            System.out.println("Stack is Empty , cannot pop");
            return 0;
        }
        return stack.get(stack.size()-1);
    }

    public static void main(String[] args) {
        stackUsingArrList st = new stackUsingArrList();
        st.push(5);
        st.push(9);
        st.peek();
    }
}
