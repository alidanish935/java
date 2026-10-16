package LinkList;

public class LinkedList2 {
    static Node head;
    static class Node{
        int val;
        Node next;

        Node (int x){
            val = x;
            next = null;
        }

    }
    public static void main(String args[]){
        LinkedList2 list = new LinkedList2();
        Node n1 = new Node(0);
        Node n2 = new Node(1);
        Node n3 = new Node(3);

        list.head = n1;
        n1.next = n2;
        n2.next = n3;

        print(head);
        insertAtBegining(4);
        print(head);
    }
    private static void insertAtBegining(int val) {
        // TODO Auto-generated method stub
        Node node = new Node(val);
        node.next = head;
        head = node;
        throw new UnsupportedOperationException("Unimplemented method 'insertAtBegining'");
    }
    private static void print(Node head) {
        // TODO Auto-generated method stub
        while (head!=null) {
            System.out.print(head.val+" -> ");
            head = head.next;
        }
        System.out.println();
        // throw new UnsupportedOperationException("Unimplemented method 'print'");
    }
}
