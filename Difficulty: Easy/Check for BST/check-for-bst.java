/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    // Function to check whether a Binary Tree is BST or not.
    Integer prev = null; 
    boolean isBST(Node root) {
        // code here.
        if(root==null)return true;
        if(!isBST(root.left)) return false;
        if(prev!=null&&root.data<=prev) return false;
        prev=root.data;
        return isBST(root.right);
    }
}