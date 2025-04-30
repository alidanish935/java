package LinkList;

public class main {
    // if we keep node class inside main class then why it gives error
    public static void main(String[] args) {
        Node n = new Node(3);
        Node n1 = new Node(5);
        Node n2 = new Node(6);
        n.next =n1;n1.next=n2;
        print(n);
        // System.out.println(n1.val);
    }

    private static void print(Node n) {
        while(n!=null){
            System.out.print(n.val+" ");
            n=n.next;
        }
    }
}
  class Node{
    int val;
    Node next;
    Node(int value){
        val = value;
        next = null;
    }
    static void print(Node n){

    }
    
}
// 
