package LinkList;

public class practice {
    public static void main(String[] args) {
        Node n = new Node(3);
        Node n1 = new Node(5);
        Node n2 = new Node(6);
        n.next =n1;n1.next=n2;
        print(n);
        
        // insert at start
        Node head=null;
        for(int i=1;i<=5;i++){
            Node a = new Node(i);//        2-1   
            if(head==null){
                head=a;
            }else{
                a.next =head;
                head=a;
            }
        }
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
    
    
}