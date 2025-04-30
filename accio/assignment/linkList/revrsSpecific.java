package accio.assignment.linkList;

import java.io.*;
import java.util.*;
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
class insertion
{
    Node head;  
    Node tail;
	public void addToTheLast(Node node) 
	{
	  if (head == null) 
	  {
	   head = node;
	   tail = node;
	  } 
	  else 
	  {
	   tail.next = node;
	   tail = node;
	  }
	}
      void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	/* Drier program to test above functions */
	
}
class Main
{
    public static void main(String args[])throws IOException
    {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
            String S[] = br.readLine().split(" ");
			int N = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            int n = Integer.parseInt(S[2]);
		
		    String S1[] = br.readLine().split(" ");
			insertion llist = new insertion(); 
			int a1=Integer.parseInt(S1[0]);
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < N; i++) 
			{
				int a = Integer.parseInt(S1[i]);
				llist.addToTheLast(new Node(a));
			}
			
        Solution ob = new Solution();
		Node newhead=ob.reverseBetween(llist.head, m, n);
		llist.printList(newhead);
    }
}


class Solution
{
    public static Node reverseBetween(Node head, int m, int n)
    {
        //code here
        Node temp =head;Node h2 = head;Node prev =head;int ct =1;
        while(ct!=m){
               prev=h2;
               h2 = h2.next ;ct++;// 2
             // temp=temp.next;//2 
        }
        Node tail =h2;Node ahead = tail;
        while(ct!=n){
            ahead = tail.next.next;
            tail =tail.next ;// 3
            ct++;
        }
        
        System.out.println("h2 - "+ h2.data);
        System.out.println("ahead - "+ ahead.data);
        tail.next = null;
        //print(h2);
        Node pre =null;//                             p    c  n
        Node curr = h2;Node next = null; // 2 <- 3 <- 4
        while(curr!=null){
            next = curr.next;// null
            curr.next = pre;//null ,2 ,3
            pre = curr;// //2 ,3,4
            curr = next;//3 , 4,null
        }
        System.out.println("h2 - "+ h2.data);
        System.out.println("prev - "+ prev.data);
       // System.out.println("curr - "+ curr.data);
        prev.next = pre;
        h2.next = ahead;
        
       return head;
    } 
    static void print(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
}

                            //     a b
// Node a = h2,b=h2.next,c;    2 3 4 
//         while(b!=null){
//             c=b.next; // 4 null
//             b.next = a; // 2 <-3 <-4
//             a=b; // 3 4
//             b=c;// 4 null
//         }
//         h2.next = null;