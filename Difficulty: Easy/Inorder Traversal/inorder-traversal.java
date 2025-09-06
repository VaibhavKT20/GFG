/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> result=new ArrayList<>();
        inOrderHelper(root,result);
        return result;
    }
    public void inOrderHelper(Node root, ArrayList<Integer> result){
        if(root!=null){
            inOrderHelper(root.left,result);
            result.add(root.data);
            inOrderHelper(root.right,result);
        }
    }
}