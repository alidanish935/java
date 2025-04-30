package bst;

public class creat {
    static class Node{
        int data; Node left;Node right;
        Node(int d){
            data = d;left =right = null;
        }
    }
public static void main(String[] args) {
    int arr[]={2, 81, 42, 87, 90, 91, 66};
    // int arr[]={4, 1, 6, 0, 2, 5,7,3,8};
    int n = arr.length;
    Node root = null;
    for(int i=0;i<n;i++){
        root =insert(root,arr[i]);       
    }
    print(root);
    System.out.println();
    Boolean res = validateBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    System.out.println(res+" "+" for BST validation");
    System.out.println(findNode(root,43)+" for finding Node");
    deleteNode(root,81);
    print(root);
    System.out.println();
    Node lca = LCA(root,42,87);
    System.out.println(lca.data);
    convertBSTtoGreaterTree(root);
    print(root);
    System.out.println();
 }
 static int sum = 0;
 public static void convertBSTtoGreaterTree(Node root){
    if(root == null)return;
    convertBSTtoGreaterTree(root.right);
    sum += root.data;
    root.data = sum;
    convertBSTtoGreaterTree(root.left);
 }
 private static boolean validateBST(Node root,int min,int max) {
    if(root == null)return true;
    if(root.data<min && root.data>max)return false;
    boolean checkLeft = validateBST(root.left, min, root.data);
    if(!checkLeft)return false;
    boolean checkRight = validateBST(root.right, root.data,max);
    if(!checkRight)return false;

    return true;
 }
 private static boolean findNode(Node root,int k) {
    if(root == null)return false;
    if(k<root.data){
        return findNode(root.left, k);
    }else if(k>root.data){
        return findNode(root.right, k);
    }else{
        return true;
    }
 }
 private static Node LCA(Node root,int a,int b) {

    if(a<root.data && b<root.data){
       return LCA(root.left, a, b);
    }else if(a>root.data && b>root.data){
        return LCA(root.right, a, b);
    }else return root;
 }
 private static Node findMin(Node root) {
    if(root.left==null)return root;
    return findMin(root.left);
 }
 private static Node deleteNode(Node root, int val) {
    if(val<root.data){
        root.left = deleteNode(root.left, val);
    }else if(val>root.data){
        root.right = deleteNode(root.right, val);
    }else{
        if(root.left == null && root.right==null){
            return null;
        }else if(root.left==null){
            return root.right;
        }else if(root.right==null){
            return root.left;
        }else{
            Node min = findMin(root.right);
            root.data = min.data;
            root.right = deleteNode(root.right, min.data);
        }
    }
    return root;
 }
private static void print(Node root) {
    if(root == null)return;
    System.out.print(root.data+" ");
    print(root.left);
    print(root.right);
}
private static Node insert(Node root, int val) {
    if(root == null){
        return new Node(val);
    }
    if(val<root.data){
        root.left = insert(root.left, val);
    }else if(val>root.data){
        root.right = insert(root.right, val);
    }
        
    return root;
    
}
    
}