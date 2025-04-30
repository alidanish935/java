package LinkList;

public class Node {
    int val;
    Node next;
    Node(int value){
        val = value;
        next = null;
    }
    public static void main(String[] args) {
        Node n  = new Node(10);
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        n.next =n1;
        n1.next=n2;
        System.out.println(n+" "+n.val+" "+n.next);
        System.out.println(n1+" "+n1.val+" "+n1.next);
        System.out.println(n2+" "+n2.val+" "+n2.next);
    }
}
