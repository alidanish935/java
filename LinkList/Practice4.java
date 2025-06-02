package LinkList;

public class Practice4 {
    static Node head;
    static class Node{
        int data;Node next;
        Node(int d){
            data = d;next=null;
        }
    }
    public static void main(String[] args) {
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);

        head = n1;
        n1.next = n2;
        n2.next = n3;

        insertAtEnd(5);
        insertAtEnd(6);
        // print();
        insertAtBegining(1);
        // print();
        Node mid = findMid(head);
        System.out.println(mid.data);
        insertAtMid(0);
        // print(head);
        // Node rev = reverse(head);
        // print(rev);
        boolean isPelin = checkPelin(head);
        System.out.println(isPelin);

    }
    public static boolean checkPelin(Node head){
        Node temp = head;
        Node mid = findMid(temp);
        print(mid);
        Node ahead = mid.next;
        // mid.next = null;
        Node rev = reverse(ahead);
        Node r = rev;
        while(r!=null){
            System.out.println(r.data +" "+temp.data);
            if(temp.data != r.data)
                return false;
            r = r.next;temp=temp.next;
        }
        return true;
    }
    //  a->b->c
    public static Node reverse(Node temp){
        if(temp == null)return temp;
        Node a = temp, b=temp.next,c;
        while(b!=null){
            c= b.next;
            b.next =a;
            a=b;
            b=c;
        }
        temp.next = null;
        return a;
    }
    public static void insertAtMid(int d){
        Node fast = head;
        Node slow = head;
        // Node ahead = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            // ahead = slow.next;
            fast=fast.next.next;
        }
        Node n = new Node(d);
        n.next =slow.next;
        slow.next=n;
        
    }
    public static Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void insertAtBegining(int d){
        Node n = new Node(d);
        n.next = head;
        head = n;
    }
    public static void insertAtEnd(int d){
        Node temp = head;
        while(temp.next != null){
            temp=temp.next;
        }
        Node n = new Node(d);
        temp.next = n;
    }
    public static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
