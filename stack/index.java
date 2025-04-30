package stack;

import java.util.Stack;

/**
 * index
 */
public class index {

    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        System.out.println(st.size());
        System.out.println(st);
        st.pop();
        System.out.println(st.size());
        System.out.println(st);
    }
}