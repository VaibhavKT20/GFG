/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    Node prev=null,first=null,second=null;
    public void correctBST(Node root){
        inorder(root);
        if(first!=null && second!=null){
            int temp = first.data;
            first.data = second.data;
            second.data = temp;
        }
    }
    void inorder(Node root) {
        // code here.
        if(root==null){
            return;
        }
        inorder(root.left);
        if(prev!=null && root.data<prev.data){
            if(first==null){
                first=prev;
            }
            second=root;
        }
        prev=root;
        inorder(root.right);
    }
}