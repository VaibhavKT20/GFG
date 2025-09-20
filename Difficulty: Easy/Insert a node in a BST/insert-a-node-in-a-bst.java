/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

*/
class Solution {
    public Node insert(Node root, int key) {
        // code here
        Node temp=new Node(key);
        Node parent=null;
        Node curr=root;
        while(curr!=null){
            parent=curr;
            if(curr.data>key){
                curr=curr.left;
            }
            else if(curr.data<key){
                curr=curr.right;
            }
            else{
                return root;
            }
        }
        if(parent==null){
            return temp;
        }
        else if(parent.data>key){
            parent.left=temp;
        }
        else{
            parent.right=temp;
        }
        return root;
    }
}
