package tree;

public class Practice {
    static class Node{
        int  data;Node left ; Node right;
        Node(int d){
            data = d;
            left = right = null;
        }
    }
    static int i =-1;
    static Node buildTree(int arr[]){
        i++; 
        if(arr[i]==-1)return null;
        Node newNode = new Node(arr[i]);
        newNode.left = buildTree(arr);
        newNode.right = buildTree(arr);
        return newNode;
    } 
    public static void main(String[] args) {
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int n = arr.length;
        Node root = buildTree(arr);
        printPreOrder(root);
    }
    private static void printPreOrder(Node root) {
        // TODO Auto-generated method stub
        if(root == null)return;
        printPreOrder(root.left);
        System.out.print((root.data+" "));
        printPreOrder(root.right);
    }
}
