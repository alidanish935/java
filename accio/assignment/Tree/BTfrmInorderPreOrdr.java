package accio.assignment.Tree;

// public class BTfrmInorderPreOrdr {
    
// }
import java.util.*;
import java.io.*;
class Node{
    int data; 
    Node left, right;
    Node(int key){
        data = key;
        left = right = null;
    }
}

class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node root = null;
        int inorder[] = new int[n];
        int preorder[] = new int[n];
        for(int i = 0; i < n; i++)
          preorder[i] = sc.nextInt();
        for(int i = 0; i < n; i++)
          inorder[i] = sc.nextInt();
        Solution ob = new Solution();
        root = ob.buildTree(inorder, preorder, n);
        postOrdrer(root);
        System.out.println();
    }
    
    public static void postOrdrer(Node root){
        if(root == null)
          return;
        postOrdrer(root.left);
        postOrdrer(root.right);
        System.out.print(root.data + " ");
    }
}


class Solution{
    // public static Node helper(int in[],int isi,int iei, int pre[], int psi,int pei){
    //     if(isi>iei || psi>pei)return null;
    //     Node node = new Node(pre[psi]);
    //     int noOfNodeInLeft =0;
    //     int itr = isi;
    //     while(in[itr]!=pre[psi]){
    //         itr++;noOfNodeInLeft++;
    //     }
    //     System.out.println(itr+ "-> "+noOfNodeInLeft);
    //     node.left = helper(in,isi,itr-1,pre,psi+1,psi+noOfNodeInLeft);
    //     node.right = helper(in, itr+1,iei,pre, psi+noOfNodeInLeft+1,pei);
    //     return node;
    // }
    // public static Node buildTree(int inorder[], int preorder[], int n){
    //     //Your code here 
    
    //     Node node =helper(inorder,0,n-1,preorder,0,n-1);
    //     return node;
    // }

    public static Node helper(int in[], int isi, int iei, int pre[], int psi, int pei) {
    // Base case: if the index ranges are invalid, return null
    if (isi > iei || psi > pei) return null;

    // Create a new node with the value from the pre-order array
    Node node = new Node(pre[psi]);

    // Find the index of the root value in the in-order array
    int rootIndex = isi;
    // Calculate the number of nodes in the left subtree
        int noOfNodesInLeft=0;
    while (in[rootIndex] != pre[psi]) {
        rootIndex++; noOfNodesInLeft++;
    }


    // Recursively construct left and right subtrees
    node.left = helper(in, isi, rootIndex - 1, pre, psi + 1, psi + noOfNodesInLeft);
    node.right = helper(in, rootIndex + 1, iei, pre, psi + noOfNodesInLeft + 1, pei);

    return node;
}

public static Node buildTree(int inorder[], int preorder[], int n) {
    // Call the helper method to construct the tree
    Node node = helper(inorder, 0, n - 1, preorder, 0, n - 1);
    return node;
}

}
// node.left = helper(in, isi, rootIndex - 1, pre, psi + 1, psi + noOfNodesInLeft);

// This line of code constructs the left subtree of the current node.
// in: The in-order array representing the sequence of nodes in the subtree.
// isi: The starting index of the in-order array for the left subtree.
// rootIndex - 1: The ending index of the in-order array for the left subtree, which is one less than the index of the current node in the in-order array.
// pre: The pre-order array representing the sequence of nodes in the subtree.
// psi + 1: The starting index of the pre-order array for the left subtree, which is one position ahead of the current position in the pre-order array (because the next element in the pre-order array represents the root of the left subtree).
// psi + noOfNodesInLeft: The ending index of the pre-order array for the left subtree, which is calculated by adding the number of nodes in the left subtree (noOfNodesInLeft) to the starting index of the pre-order array for the left subtree.
// This line essentially recurses on the left subtree, passing appropriate index ranges for both the in-order and pre-order arrays.
// node.right = helper(in, rootIndex + 1, iei, pre, psi + noOfNodesInLeft + 1, pei);

// This line of code constructs the right subtree of the current node.
// in: The in-order array representing the sequence of nodes in the subtree.
// rootIndex + 1: The starting index of the in-order array for the right subtree, which is one position ahead of the current node's index in the in-order array.
// iei: The ending index of the in-order array for the right subtree.
// pre: The pre-order array representing the sequence of nodes in the subtree.
// psi + noOfNodesInLeft + 1: The starting index of the pre-order array for the right subtree, which is calculated by adding the number of nodes in the left subtree (noOfNodesInLeft) to the starting index of the pre-order array for the left subtree and then adding 1 (because the next element in the pre-order array after the left subtree elements represents the root of the right subtree).
// pei: The ending index of the pre-order array for the right subtree.
// This line essentially recurses on the right subtree, passing appropriate index ranges for both the in-order and pre-order arrays.
