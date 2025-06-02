package LinkList;

public class Palindom2 {
    static Node head;
    static class Node{
        int data; Node next;
        Node(int d){
            data= d; next = null;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        Node temp = head;
        print(temp);
        boolean isPelin = checkPalin(temp);
        System.out.println("is palin-  "+ isPelin);
    }

    private static boolean checkPalin(Node temp) {
        // TODO Auto-generated method stub
        Node t = temp;
        Node mid = findMid(t);
        System.out.println("mid---- "+mid.data);
        Node ahead = mid.next;
        mid.next = null;
        Node rev = reverse(ahead);
        // print(rev);
        Node r = rev;
        while (r!=null) {
            if(r.data != t.data){
                return false;
            }
            r=r.next;t=t.next;
        }
        return true;
    }

    private static Node reverse(Node temp) {
        // TODO Auto-generated method stub
        Node a = temp, b = temp.next,c;
        while (b!=null) {
            c= b.next;
            b.next = a;
            a=b;b=c;
        }
        temp.next = null;
        return a;
    }

    private static Node findMid(Node t) {
        // TODO Auto-generated method stub
        Node slow = t, fast = t;
        while (fast.next != null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static void print(Node temp) {
        // TODO Auto-generated method stub
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
