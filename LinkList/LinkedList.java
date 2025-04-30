package LinkList;

public class LinkedList {
    static Node head;
    static class Node{
        int val;
        Node next;
        Node(int value){
            val = value;
            next = null;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node n1 = new Node(5);
        Node n2 = new Node(6);
        Node n3 = new Node(6);
      //  Node n4 = new Node(5);
        list.head=n1;
        n1.next=n2;
        n2.next=n3;
       // print(n1);
        System.out.println();
      //  insertAtBegining(4);
        insertAtEnd(5);
        Node mid = findMid();
        System.out.println(mid.val);
        insertAtMid(9);
        print(head);
        System.out.println();
        reverse();
        print(head);

        
    }//1 2 3 5 6 7
    public static void reverse(){// 1 <-2 3
        Node a= head, b= head.next,c;
        while(b!=null){
            c= b.next;
            b.next=a;
            a=b;
            b=c;
        }
        head.next= null;
        head=a;
    }
    public static void insertAtMid(int val){
        Node n = new Node(val);
        Node slow = head,fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        n.next=slow.next;
        slow.next = n;

    }
    public static Node findMid(){
        Node slow = head,fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void insertAtEnd(int val){
        Node n = new Node(val);
        Node temp = head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=n;
    }
    public static void insertAtBegining(int val){
        Node n = new Node(val);
        n.next = head;
        head = n;
    }
    public static void print(Node head){
        while (head!=null) {
            System.out.print(head.val+" ");
            head=head.next;
        }
    }
}
