package accio.assignment.Tree;

// public class BTfrmInordrPost {
    
// }
//    https://course.acciojob.com/idle?question=fead3653-183f-4eac-94cc-fee94b777e16


import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int value) {
        data = value;
        left = null;
        right = null;
    }
}

class Main {
    public void preOrder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);

        preOrder(root.right);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Main ip = new Main();
        int T = 1;
        while (T > 0) {
            int n = sc.nextInt();
            int[] inorder = new int[n];
            int[] postorder = new int[n];
            for (int i = 0; i < n; i++) postorder[i] = sc.nextInt();
            for (int i = 0; i < n; i++) inorder[i] = sc.nextInt();
            Solution g = new Solution();
            Node root = g.buildTree(inorder, postorder, n);
            ip.preOrder(root);
            System.out.println();

            T--;
        }
        sc.close();
    }
}

class Solution {
    // Node construct(int in[],int isi,int iei, int post[], int psi,int pei){
    //     if(isi>iei || psi>pei) return null;
    //     Node root = new Node(post[pei]);
    //    int itr =isi;
    //     while(in[itr]!=post[pei]){
    //         itr++;//noOfNodesInLeft++;
    //     }
    //      int noOfNodesInLeft = itr-isi;
    //     // root.left =construct(in,isi,itr-1,post,psi,psi+noOfNodesInLeft);
    //     // root.right =construct(in,itr+1,iei,post,psi+noOfNodesInLeft+1,pei);
    //      root.left = construct(in, isi, itr - 1, post, psi, psi + noOfNodesInLeft - 1);
    //     root.right = construct(in, itr + 1, iei, post, psi + noOfNodesInLeft, pei - 1);
    //     return root;
    // }
    Node construct(int post[],int psi,int pei, int in[], int isi,int iei){
        if(isi>iei || psi>pei) return null;
        Node root = new Node(post[pei]);
       int itr =isi;
        int noOfNodesInLeft =0;
        while(in[itr]!=post[pei]){
            itr++;noOfNodesInLeft++;
        }
         // int noOfNodesInLeft = itr-isi;
        
         root.left = construct( post, psi, psi + noOfNodesInLeft - 1,in, isi, itr - 1);
        root.right = construct( post,psi + noOfNodesInLeft, pei - 1,in, itr + 1, iei);
        return root;
    }
    Node buildTree(int in[], int post[], int n){
        //Write code here
        return construct(post,0,n-1,in,0,n-1);
    }
}