package bst.create;

import java.util.Scanner;

public class PreOrder {
    static class Node{
        int data;Node left;Node right;
        Node(int d){
            data = d; left = right = null;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // int arr[]=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=in.nextInt();
        // }
        int arr[]={50,45,35,30,40,49,47,60,55,80};
        int n = arr.length;
        
        Node root = constructBST(arr,n,Integer.MIN_VALUE,Integer.MAX_VALUE);
        print(root);
        // display(root);
    }
    static int idx =0;
    
    private static Node constructBST(int[] arr,int n,int min,int max) {
        if(idx>=n)return null;
        // System.out.println("xxxx"+arr[idx]);
        int curr = arr[idx];
        if(curr<=min || curr>=max)return null;
       
        Node newNode = new Node(curr);
        idx++;
        newNode.left = constructBST(arr,n, min, curr);
        newNode.right = constructBST(arr,n, curr,max);
        return newNode;
    }
    
    public static void print(Node root){
        if(root == null)return;
        print(root.left);
        System.out.print(root.data+" ");
        print(root.right);
    }
}
