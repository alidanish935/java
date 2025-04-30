package bst.create;

public class Insert {
    static class Node{
        int data; Node left;Node right;
        Node(int d){
            data = d;
            left = right = null;
        }
    }
    public static void main(String[] args) {
        // int arr[]={50,45,35,30,40,49,47,60,55,80};
        int arr[]={2, 81, 42, 87, 90, 41, 66};
        int n = arr.length;
        
        Node root = null;
        for(int i=0;i<n;i++){
           root =  insertToBST(root,arr[i]);
        }
        boolean found = findNode(root,81);
        System.out.println(found);
        root = deleteNode(root,42);
        print(root);
    }
    private static Node findMin(Node root) {
        if(root.left == null)return root;
        return findMin(root.left);
    }
    private static Node deleteNode(Node root, int k) {
        if(k<root.data){
            root.left = deleteNode(root.left, k);
        }else if(k>root.data){
            root.right = deleteNode(root.right, k);
        }else{
            if(root.left == null && root.right==null){
                return null;
            }
            else if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }else{
                Node min = findMin(root.right);
                root.data = min.data;
                root.right = deleteNode(root.right, min.data);
            }
        }
        return root;    
    }


    public static void print(Node root){
        if(root == null)return;
        System.out.print(root.data+" ");
        print(root.left);
        print(root.right);
    }
    private static boolean findNode(Node root,int val) {
        if(root ==null)return false;
        if(val<root.data){
            return findNode(root.left, val);
        }else if(val>root.data){
            return findNode(root.right, val);
        }else{
            return true;
        }
    }
    private static Node insertToBST(Node root,int val) {
        if(root == null){
            return new Node(val);
        }

        if(val<root.data){
            root.left = insertToBST(root.left, val);
        }else if(val>root.data){
            root.right = insertToBST(root.right, val);
        }
        return root;
        
    }
}
