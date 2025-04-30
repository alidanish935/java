package accio.assignment.Tree;
import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

// https://course.acciojob.com/idle?question=2e9cb785-6601-4de7-90c3-0e79638c9f5b

class Main {
    static Node buildTree(String str){
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>(); 
        queue.add(root);
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if(i >= ip.length)
                break;   
            currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }
        return root;
    }
    void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }
    
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-- > 0){
			String s = br.readLine();
			Node root = buildTree(s);
			Solution tree = new Solution();
			ArrayList<Integer> arr = tree.topView(root);
			for(int x : arr)
			System.out.print(x +" ");
			System.out.println();  
		}
	}
}
  

class qObj
{
    Node node;
    int level;
    qObj(Node n,int l)
    {
        node=n;
        level=l;
    }
}

class Solution
{// solution by chat GPT

//     class Pair {
//     Node node;
//     int level;
    
//     Pair(Node n, int l) {
//         node = n;
//         level = l;
//     }
// }

// public ArrayList<Integer> topView(Node root) {
//     ArrayList<Integer> list = new ArrayList<>();
//     Queue<Pair> queue = new ArrayDeque<>();
    
//     // If the root is null, return an empty list
//     if (root == null) return list;
    
//     // Add the root node along with its level (horizontal distance) to the queue
//     queue.add(new Pair(root, 0));
    
//     // TreeMap to store nodes at each horizontal distance
//     TreeMap<Integer, Integer> map = new TreeMap<>();
    
//     // Perform level-order traversal
//     while (!queue.isEmpty()) {
//         int size = queue.size();
//         while (size-- > 0) {
//             Pair pair = queue.poll();
//             Node node = pair.node;
//             int level = pair.level;
            
//             // Add the node to the TreeMap only if it's the first node encountered at this horizontal distance
//             if (!map.containsKey(level)) {
//                 map.put(level, node.data);
//             }
            
//             // Enqueue the left child with level decreased by 1
//             if (node.left != null) {
//                 queue.add(new Pair(node.left, level - 1));
//             }
            
//             // Enqueue the right child with level increased by 1
//             if (node.right != null) {
//                 queue.add(new Pair(node.right, level + 1));
//             }
//         }
//     }
    
//     // Add the nodes from the TreeMap to the result list
//     for (int value : map.values()) {
//         list.add(value);
//     }
    
//     return list;
// }



    // own solution
    class Pair{
        Node node;
        int lev;
        Pair(Node n,int l){
            node = n;
            lev = l;
        }
    }
    
    
    public ArrayList<Integer> topView(Node root){
    ArrayList<Integer> list = new ArrayList<>();  // Initialize an ArrayList to store the top view nodes
    Queue<Pair> que = new ArrayDeque<>();        // Initialize a queue for level order traversal
        
        // If the root is null, return an empty list
        if (root == null) return list;
        
        // Add the root node along with its level (horizontal distance) to the queue
        que.add(new Pair(root, 0));
        
        // TreeMap to store nodes at each horizontal distance
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        
        // Perform level order traversal
        while (!que.isEmpty()) {
            int size = que.size();
            while (size-- > 0) {
                // Dequeue a pair containing a node and its level
                Pair rpair = que.poll();
                Node rnode = rpair.node;
                int level = rpair.lev;
        
                // If the current level is not already present in the TreeMap, add the node's data
                if (!tm.containsKey(level)) {
                    tm.put(level, rnode.data);
                }
        
                // Enqueue the left child with level decreased by 1
                if (rnode.left != null) {
                    que.add(new Pair(rnode.left, level - 1));
                }
        
                // Enqueue the right child with level increased by 1
                if (rnode.right != null) {
                    que.add(new Pair(rnode.right, level + 1));
                }
            }
        }
        
        // Add the nodes' data from the TreeMap to the result list
        for (int x : tm.values()) {
            list.add(x);
        }
        
        // Return the list containing the top view nodes
        return list;

    }
}













// static ArrayList<Integer> list = new ArrayList<>();



// public static void rightTree(Node root, HashSet<Integer> set, int level){

//     if(root == null) return;

    

//     rightTree(root.right, set, level + 1);

//     if(!set.contains(level)) {

//         list.add(root.data);

//         set.add(level);

//     }

// }



// public static void leftTree(Node root, HashSet<Integer> set, int level){

//     if(root == null) return;

    

//     leftTree(root.left, set, level - 1);

//     if(!set.contains(level)) {

//         list.add(root.data);

//         set.add(level);

//     }

// }



// public static ArrayList<Integer> topView(Node root){

//     if(root == null) return new ArrayList<>();

    

//     HashSet<Integer> set = new HashSet<>();

    

//     leftTree(root.left, set, -1);

//     list.add(root.data);

//     rightTree(root.right, set, 1);

    

//     return list;

// }


