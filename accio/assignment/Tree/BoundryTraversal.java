package accio.assignment.Tree;

// public class BoundryTraversal {
    
// }

///  https://course.acciojob.com/idle?question=52812c95-8480-4304-b0b2-9b73ba1ae7c8
import java.util.*;

class Node {

  int data;
  Node left, right;
}

 class Solution{
    
    static void printRightBoundry(Node root){
        if(root == null)return;
        
        if(root.right!=null){
            printRightBoundry(root.right);
        }else{
            printLeftBoundry(root.left);
        }
        if(root.left == null && root.right ==null){
            return;
        }
            System.out.print(root.data+" ");
        
    }
    static void printLeafNode(Node root){
        if(root == null)return;
        if(root.left == null && root.right ==null){
            System.out.print(root.data+" ");
        }
        printLeafNode(root.left);
        printLeafNode(root.right);
        
    }
    static void printLeftBoundry(Node root){
        if(root == null)return;
        if(root.left == null && root.right ==null){
            return;
        }
        System.out.print(root.data+" ");
        if(root.left!=null){
            printLeftBoundry(root.left);
        }else{
            printLeftBoundry(root.right);
        }
    }
    static void printBoundary(Node node){
        if(node == null)return;
        //top
        System.out.print(node.data+" ");
        printLeftBoundry(node.left);
        
        printLeafNode(node);
        printRightBoundry(node.right);
    }
}
public class BoundryTraversal {

  static Node getNode(int data) {
    // Allocate memory
    Node newNode = new Node();

    // put in the data
    newNode.data = data;
    newNode.left = newNode.right = null;
    return newNode;
  }

  static Node LevelOrder(Node root, int data) {
    if (root == null) {
      root = getNode(data);
      return root;
    }
    if (data <= root.data) root.left =
      LevelOrder(root.left, data); else root.right =
      LevelOrder(root.right, data);
    return root;
  }

  static Node constructBst(int arr[], int n) {
    if (n == 0) return null;
    Node root = null;

    for (int i = 0; i < n; i++) root = LevelOrder(root, arr[i]);

    return root;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] tree = new int[n];
    for (int i = 0; i < n; i++) tree[i] = sc.nextInt();
    sc.close();
    Node root = constructBst(tree, n);
    Solution.printBoundary(root);
  }
}


// import java.util.*;

// class Node {
//     int data;
//     Node left, right;
// }

// class Solution {
//     static void getLeftBoundary(Node root) {
//         if (root == null) {
//             return;
//         }

//         if (root.left == null && root.right == null) {
//             return;
//         }

//         System.out.print(root.data + " ");

//         if (root.left != null) {
//             getLeftBoundary(root.left);
//         } else {
//             getLeftBoundary(root.right);
//         }
//     }

//     static void getLeafNodes(Node root) {
//         if (root == null) {
//             return;
//         }

//         if (root.left == null && root.right == null) {
//             System.out.print(root.data + " ");
//         }

//         getLeafNodes(root.left);
//         getLeafNodes(root.right);
//     }

//     static void getRightBoundary(Node root) {
//         if (root == null) {
//             return;
//         }

//         if (root.right != null) {
//             getRightBoundary(root.right);
//         } else {
//             getRightBoundary(root.left);
//         }
//         if (root.left == null && root.right == null) {
//             return;
//         }

//         System.out.print(root.data + " ");

//     }

//         static void printBoundary(Node root) {
//         if (root == null) {
//             return;
//         }
        
//         // top
//         System.out.print(root.data + " ");

//         // left
//         getLeftBoundary(root.left);

//         // bottom
//         if (root.left != null || root.right != null) {            
//             getLeafNodes(root);
//         }

//         // right
//         getRightBoundary(root.right);
//     }
// }

// public class Main {

//     static Node getNode(int data) {
//         // Allocate memory
//         Node newNode = new Node();

//         // put in the data
//         newNode.data = data;
//         newNode.left = newNode.right = null;
//         return newNode;
//     }

//     static Node LevelOrder(Node root, int data) {
//         if (root == null) {
//             root = getNode(data);
//             return root;
//         }
//         if (data <= root.data)
//             root.left = LevelOrder(root.left, data);
//         else
//             root.right = LevelOrder(root.right, data);
//         return root;
//     }

//     static Node constructBst(int arr[], int n) {
//         if (n == 0)
//             return null;
//         Node root = null;

//         for (int i = 0; i < n; i++)
//             root = LevelOrder(root, arr[i]);

//         return root;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] tree = new int[n];
//         for (int i = 0; i < n; i++)
//             tree[i] = sc.nextInt();
//         sc.close();
//         Node root = constructBst(tree, n);
//         Solution.printBoundary(root);
//     }
// }

