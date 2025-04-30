package stack;

import java.util.ArrayList;

public class StackUsingArrayList2 {
    static ArrayList<Integer>list = new ArrayList<>();
    static int size=0;
    public static void main(String[] args) {
        StackUsingArrayList2 stack = new StackUsingArrayList2();
        stack.push(10);
        stack.push(11);
        stack.push(12);
        System.out.println(stack.pop());
    }
    public static void push(int val){
        list.add(val);
        size++;
    }

    public static int pop(){
        if(list.size()==0){
            System.out.println("Stack is Empty");
            return 0;
        }
        size--;
        return list.get(size);
    }
}
