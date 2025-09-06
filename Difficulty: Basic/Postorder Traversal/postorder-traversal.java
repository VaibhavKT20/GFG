/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Solution {
    // Function to return a list containing the postorder traversal of the tree.
    public void postOrderHelper(Node root, ArrayList<Integer> result){
        if(root!=null){
            postOrderHelper(root.left,result);
            postOrderHelper(root.right,result);
            result.add(root.data);
        }
    }
    ArrayList<Integer> postOrder(Node root) {
        // Your code goes here
        ArrayList<Integer> result=new ArrayList<>();
        postOrderHelper(root,result);
        return result;
    }
}