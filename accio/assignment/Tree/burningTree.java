// import java.util.ArrayDeque;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.Queue;

// public class burningTree {
    
//     public static void addToMap(Node root,HashMap<Node,Node>hm ){
//         if(root ==null)return;
//         Node left = root.left;
//         hm.put(left,root);
//         Node right = root.right;
//         hm.put(right,root);
//         addToMap(root.left);
//         addToMap(root.right);
//     }
//     public static Node find(Node root, int t){
//         if(root ==null || root.data == t) return root;
        
//         Node filc = find(root.left,t);
//         if(filc != null) return filc;
        
//         Node firc = find(root.right,t);
//         if(firc != null) return firc;
        
//         return null;
//     }
    
//     public static int minTime(Node root, int target) 
//     {
//         // Your code goes here
//         // creating hasmap and storing child as key and parent as value
//         HashMap<Node,Node>hm = new HashMap<>();
//         addToMap(root,hm);
        
//         // finding target node
//         Node targetNode = find(root,target);
        
//         Queue<Node> que = new ArrayDeque<>();
//         que.add(targetNode);
        
//         HashSet<Node> burnt = new HashSet<>();
//         int level = 0;
//         while(que.size()!=0){
//             int size = que.size();
//             while(size-- > 0 ){
//                 Node rnode = que.remove();
//                 if(rnode.left!=null && !burnt.contains(rnode.left)){
//                     burnt.add(rnode.left);
//                     que.add(rnode.left);
//                 }
//                 if(rnode.right!=null && !burnt.contains(rnode.right)){
//                     burnt.add(rnode.right);
//                     que.add(rnode.right);
//                 }
//                 if(hm.get(rnode)!=null && !burnt.contains(hm.get(rnode))){
//                     burnt.add(hm.get(rnode));
//                     que.add(hm.get(rnode));
//                 }
//             }
//             level++;
//         }
//         return level-1;
        
//     }
// }
