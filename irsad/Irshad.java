package irsad;
import java.util.*;
import java.util.Queue;

public class Irshad {
    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, -1, -1, -1, -1, -1, 8, -1, 9 };
        // int arr[] = { 1, 2, 3, -1,-1,4,5 ,-1,-1,-1,-1};
        int n = arr.length;
        Node root = buildTree(arr, n);
        // System.out.println(root);
        // printPreorder(root);
        // printLevorder(root);
        // printInorder(root);
        // topView(root);
        // zigZagTraversal(root);
        burningTree(root, 2);

    }

    private static void burningTree(Node root, int start) {
        // TODO Auto-generated method stub
        HashMap<Node, Node> hm = new HashMap<>();
        addToMap(root, hm);
        Node tNode = findNode(root, start);
        // System.out.println(tNode.data + " ");

        Queue<Node>q = new ArrayDeque<>();
        q.add(tNode);
        HashSet<Node>burnt = new HashSet<>();
        burnt.add(tNode);
        int time = 0;
        while(q.size()>0){
           int size = q.size();
           while(size-->0){
                Node node = q.remove();

                if(node.left != null && !burnt.contains(node.left)){
                    q.add(node.left);
                    burnt.add(node.left);
                }
                if(node.right != null && !burnt.contains(node.right)){
                    q.add(node.right);
                    burnt.add(node.right);
                }

                if(hm.containsKey(node) && !burnt.contains(hm.get(node))){
                    q.add(hm.get(node));
                    burnt.add(hm.get(node));
                } 
           }
           time++;
        }
        System.out.println(time-1);
    }

    private static void addToMap(Node root, HashMap<Node, Node> hm) {
        // TODO Auto-generated method stub
        if(root == null)return;
        if(root.left != null){
            hm.put(root.left, root);
        }
        if(root.right != null){
            hm.put(root.right, root);
        }
        addToMap(root.left, hm);
        addToMap(root.right, hm);
    }

    private static Node findNode(Node root, int start) {
        // TODO Auto-generated method stub
        if (root == null)
            return null;
        if (root.data == start)
            return root;
        Node fLeft = findNode(root.left, start);
        if (fLeft != null)
            return fLeft;

        Node fRight = findNode(root.right, start);
        if (fRight != null)
            return fRight;
        return null;

    }

    private static void zigZagTraversal(Node root) {
        // TODO Auto-generated method stub
        Queue<Node> q = new ArrayDeque<>();
        int lev = 0;
        q.add(root);
        while (q.size() > 0) {
            int size = q.size();
            ArrayList<Node> list = new ArrayList<>();
            while (size-- > 0) {

                Node curr = q.remove();
                list.add(curr);
                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            if (lev % 2 != 0) {
                Collections.reverse(list);
            }
            for (Node x : list) {
                System.out.print(x.data + " ");
            }
            lev++;
        }
    }

    static class Pair {
        Node node;
        int col;

        Pair(Node n, int c) {
            node = n;
            col = c;
        }
    }

    private static void topView(Node root) {
        // TODO Auto-generated method stub
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(root, 0));
        TreeMap<Integer, Node> tm = new TreeMap<>();

        while (q.size() > 0) {
            int size = q.size();
            while (size-- > 0) {
                Pair rPair = q.remove();
                Node node = rPair.node;
                int col = rPair.col;
                tm.putIfAbsent(col, node);

                if (node.left != null) {
                    q.add(new Pair(node.left, col - 1));
                }
                if (node.right != null) {
                    q.add(new Pair(node.right, col + 1));
                }
            }
        }
        for (int x : tm.keySet()) {
            System.out.print(tm.get(x).data + " ");
        }
    }

    private static void printLevorder(Node root) {
        // TODO Auto-generated method stub
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while (q.size() > 0) {
            int size = q.size();
            // System.out.print(q.peek().data+" ");
            while (size > 0) {
                Node curr = q.remove();
                if (size == 1) {
                    System.out.print(curr.data + " ");
                }
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
                size--;
            }
        }
    }

    private static void printPreorder(Node root) {
        // TODO Auto-generated method stub
        if (root == null)
            return;
        printPreorder(root.left);
        printPreorder(root.right);
        System.out.print(root.data + " ");
    }

    private static void printInorder(Node root) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printInorder'");
    }

    private static Node buildTree(int[] arr, int n) {
        // TODO Auto-generated method stub
        // if (n <= 0)
        // return null;
        Queue<Node> q = new ArrayDeque<>();
        Node root = new Node(arr[0]);// 1
        q.add(root);
        int i = 1;
        while (i < n) {
            Node curr = q.remove();
            if (i < n) {
                if (arr[i] != -1) {
                    curr.left = new Node(arr[i]);
                    q.add(curr.left);
                } else {
                    curr.left = null;
                }
            }

            i++;
            if (i < n) {
                if (arr[i] != -1) {
                    curr.right = new Node(arr[i]);
                    q.add(curr.right);
                } else {
                    curr.right = null;
                }
            }
            i++;
        }

        return root;

    }
}
