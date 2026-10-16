package LinkList;

public class LinkedList3 {
    static Node head;
    static  class Node{
        int val ;
        Node next;

        Node(int x){
            val = x;
        } 

    }

    public static void main(String[] args) {
        LinkedList3 list3 = new LinkedList3();


        Node n1 = new Node(0);
        Node n2 = new Node(1);
        Node n3 = new Node(2);

        list3.head = n1;
        n1.next = n2;
        n2.next = n3;

        print(head);

    }

    private static void print(Node head2) {
        // TODO Auto-generated method stub
        while (head2!=null) {
            System.out.print(head2.val+" -> ");
            head2 = head2.next;
        }
        System.out.println();
        // throw new UnsupportedOperationException("Unimplemented method 'print'");
    }


}
