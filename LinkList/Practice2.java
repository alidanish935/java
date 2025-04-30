package LinkList;

public class Practice2 {
   static Node head;
   static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            next = null;
        }
    }
    public static void main(String[] args) {
        Node n = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);

        head = n;
        n.next = n1;
        n1.next=n2;

        print(head);
        insertAtEnd(4);
        print(head);
    }

    public static Node insertAtEnd(int val){
        Node n = new Node(val);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = n;
        return  head;

    }

    public static void print(Node node){
        while (node!=null) {
            if(node.next==null){
                System.out.print(node.val);
            }else
                System.out.print(node.val+" -> ");
            node=node.next;
        }
        System.out.println();
    }

}
