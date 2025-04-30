package LinkList;

public class palindrome {
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
        palindrome list = new palindrome();
        Node n1 = new Node(5);
        Node n2 = new Node(6);
        Node n3 = new Node(6);
        Node n4 = new Node(5);
      //  Node n4 = new Node(5);
        list.head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        System.out.println();
     // print(list.head);
      cloneList(list.head);
        //boolean palin = checkPelin();
      //  System.out.println(palin);
        
    }//5 6 6 5
    public static void cloneList(Node head2){
        Node t =head2;
        Node temp =t;
        while(temp!=null){
            Node ahead = temp.next;
            Node clone = new Node(temp.val);
            clone.next = ahead;
            temp.next = clone;
            temp=temp.next;
        }
        print(t);
    }
    private static boolean checkPelin() {
        Node mid = findMid();Node f =head;
        print(mid.next);
        Node rev = findRev(mid.next);
        Node t = rev;
       while(t!=null){
        System.out.println(f.val+" "+rev.val);
        if(f.val !=t.val)  return false;
        f=f.next; t=t.next;
       }
        return true;
    }
    static Node findMid(){
        Node slow = head; Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next; fast = fast.next.next;
        }
        return slow;
    }
    static Node findRev(Node temp){
        Node a = temp,b=temp.next,c;
        while(b!=null){
            c=b.next;
            b.next =a;
            a=b;b=c;
        }
        temp.next=null; return a;
    }
    static void print(Node temp){
        while(temp!=null){
            System.out.print(temp.val+" ");temp=temp.next;
        }
        System.out.println();
    }
  
}
