package tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class CreateFrmLevel {
    static class Node{
        int data;Node left,right;
        Node(int d){
            data = d;left=right=null;
        }
    }
    static int diameter = 0;
    public static void main(String[] args) {
        int arr[]={ 1, 2, 3, 4 ,5 ,6 ,7 ,-1, -1, -1, -1, -1, 8 ,-1, 9};
        int n = arr.length;         //                      1
                                       //            2                  3
        Node root =buildTree(arr,n);       //   4         5         6        7                             
        print(root);            //           -1   -1   -1   -1   -1   8   -1   9
        findDiameter(root);
        System.out.println();
        System.out.println("diameter is -"+ diameter);
        int bal = isBalanceTree(root);
        if(bal!=-1){
            System.out.println("Tree is balanced");
        }else{
            System.out.println("Tree is not balanced");
        }
        
        boolean found =findNode(root,1);
        System.out.println("ELM found is "+ found);
        Node lca = findLCA(root,6,5);
        System.out.println("LCA is "+lca.data);
        findMaxPathSum(root);
        System.out.println("maxPathSum is "+maxPathSum);

    }
    static int maxPathSum = 0;
    public static int findMaxPathSum(Node root){
        if(root == null)return 0;
        int left = findMaxPathSum(root.left);
        int right = findMaxPathSum(root.right);
        int ansFoundBelow = left+right+root.data;
        int leftOrRightIsGood = Math.max(left,right)+root.data;
        maxPathSum = Math.max(maxPathSum,Math.max(ansFoundBelow,leftOrRightIsGood));
        return Math.max(leftOrRightIsGood,root.data);
    }
    public static Node findLCA(Node root,int a, int b){
        if(root == null)return null;
        if(root.data == a || root.data == b)return root;

        Node left = findLCA(root.left, a, b);
        Node right = findLCA(root.right, a, b);

        if(left != null && right !=null)return root;
        else if(left == null)return right;
        else return left;

    }
    public static boolean findNode(Node root,int x){
        if(root == null)return false;
        if(root.data == x)return true;
        boolean left = findNode(root.left, x);
        boolean right = findNode(root.right, x);
        return left || right;
    }
    public static int isBalanceTree(Node root){
        if(root== null)return 0;
        int left = isBalanceTree((root.left));
        int right = isBalanceTree((root.right));
        if(left==-1 || right==-1)return -1;
        if(Math.abs(left-right)>1)return -1;
        return Math.max(left,right)+1;
    }
    public static int findDiameter(Node root){
        if(root == null)return 0;
        int left = findDiameter(root.left);
        int right = findDiameter(root.right);
        diameter = Math.max(diameter,left+right);
        return 1+Math.max(left, right);
    }
    public static Node buildTree(int arr[],int n){
        Queue<Node>q = new ArrayDeque<>();
        Node root = new Node(arr[0]);
        q.add(root);
        int i=1;
        while(i<n){
            Node curr = q.remove();
            if(i<n){
                if(arr[i]!=-1){
                    curr.left = new Node(arr[i]);
                    q.add(curr.left);
                }else{
                    curr.left = null;
                }
            }    
            i++;
            if(i<n){
                if(arr[i]!=-1){
                    curr.right = new Node(arr[i]);
                    q.add(curr.right);
                }else{
                    curr.right = null;
                }
                i++;
            }    
        }
        return root;

    }
    public static void print(Node root){
        if(root == null)return;
        print(root.left);
        System.out.print(root.data+" ");
        print(root.right);
    }
}
