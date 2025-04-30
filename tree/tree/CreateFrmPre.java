package tree;

public class CreateFrmPre {
    static class Node{
        int data;
        Node left,right;
        Node(int d){
            data = d;
            left = right = null;
        }
    }
    static class BinaryTree{
        int idx =-1;
        public  Node buildTree(int pre[]){
            idx++;
            if(pre[idx]==-1){
                return null;
            }
            Node newNode = new Node(pre[idx]);
            newNode.left = buildTree(pre);
            newNode.right = buildTree(pre);

            return newNode;
        }
    }

    public static void main(String[] args) {
        int pre[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int n = pre.length;

        BinaryTree tree = new BinaryTree();
        Node root =  tree.buildTree(pre);
        printPreOrder(root);
    }
        
    private static void printPreOrder(Node root) {
        // TODO Auto-generated method stub
        if(root == null)return;
        printPreOrder(root.left);
        System.out.print((root.data+" "));
        printPreOrder(root.right);
        // throw new UnsupportedOperationException("Unimplemented method 'printPreOrder'");
    }
}