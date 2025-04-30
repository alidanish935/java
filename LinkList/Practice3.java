package LinkList;

public class Practice3 {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next=null;
        }
    }
   public static void main(String[] args) {
    Node n1 = new Node(4);
    Node n2 = new Node(5);
    Node n3 = new Node(6);
    head = n1;
    n1.next = n2;
    n2.next = n3;

    print();
    insertAtBegining(3);
    print();
    insertAtEnd(8);
    print();
    Node mid = findMid();
    System.out.println(mid.data+" mid node----");
    insertAtMid(1);
    print();
    Node mid2 = findMid();
    System.out.println(mid2.data+" mid node----");

   }
   public static void insertAtMid(int val){
    Node n = new Node(val);
    Node slow=head,fast = head,prev = head;
    while(fast.next!=null && fast.next.next!=null){
        prev = slow;
        slow=slow.next;
        fast=fast.next.next;
    }
    n.next = slow;
    prev.next = n;
    
   }
//                                      s
   public static Node findMid(){//  3 4 1 5 6 8
    Node slow = head;//                     f
    Node fast = head;
    while(fast!=null &&fast.next!=null){
        slow = slow.next;
        fast=fast.next.next;
    }
    return slow;
   }
   public static void insertAtEnd(int val){
     Node n = new Node(val);
     Node temp = head;
     while (temp.next!=null) {
        temp = temp.next;
    }
    temp.next=n;
   }
   public static void insertAtBegining(int val){
    Node n = new Node(val);
    n.next = head;
    head = n;
   }
   public static void print(){
      Node temp = head;
      while (temp !=null) {
        System.out.print(temp.data+" ");
        temp=temp.next;
      }
      System.out.println();
   }
}
