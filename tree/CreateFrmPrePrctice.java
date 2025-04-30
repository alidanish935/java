public class CreateFrmPrePrctice {
    static class Node{
        int data;Node left;Node right;
        Node(int d){
            data = d;left = right = null;
        }
    }
    static class BuildTree{
        int idx = -1;
        public  Node tree(int arr[]){
            idx++;
            if(arr[idx]==-1)return null;
            Node newNode = new Node(arr[idx]);
            newNode.left = tree(arr);
            newNode.right = tree(arr);
            return newNode;
        }
    }
    public static void main(String[] args) {
        int pre[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int n = pre.length;
        BuildTree buildTree = new BuildTree();
        Node root = buildTree.tree(pre);

        print(root);
    }
    public static void print(Node root){
        if(root == null)return;
        print(root.left);
        System.out.print(root.data+" ");
        print(root.right);
    }
}
