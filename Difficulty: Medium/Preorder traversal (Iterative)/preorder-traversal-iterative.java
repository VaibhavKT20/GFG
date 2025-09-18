// User function Template for Java

/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class Tree {
    // Return a list containing the Preorder traversal of the given tree
    ArrayList<Integer> preOrder(Node root) {
        // Code
        if(root==null){
            return null;
        }
        ArrayList<Integer>result=new ArrayList<>();
        Stack<Node> s=new Stack<Node>();
        s.push(root);
        while(!s.isEmpty()){
            Node curr=s.pop();
            result.add(curr.data);
            if(curr.right!=null){
                s.push(curr.right);
            }
            if(curr.left!=null){
                s.push(curr.left);
            }
        }
        return result;
    }
}