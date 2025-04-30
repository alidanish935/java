package stack;

public class StackUsingLL {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        StackUsingLL stack = new StackUsingLL();
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
    public static int peek(){
        if(head == null){
            System.out.println("Stack is Empty---");  
        }
            return head.data;
    }
    public static int pop(){
        if(head == null){
            System.out.println("Stack is empty----");
            return 0;
        }
            Node top = head;
            head = head.next;
            return top.data;
    }
    public static void push(int val){
        Node n = new Node(val);
        if(head ==null){
            head = n;
        }else{
            n.next = head;
            head = n;
        }
    }
}
