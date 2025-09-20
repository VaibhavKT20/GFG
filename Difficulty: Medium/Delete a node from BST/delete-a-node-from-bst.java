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
    Node getSucc(Node root){
        Node curr=root.right;
        while(curr!=null && curr.left!=null){
            curr=curr.left;
        }
        return curr;
    }
    Node deleteNode(Node root, int x) {
        // code here
        if(root==null){
            return null;
        }
        if(root.data>x){
            root.left=deleteNode(root.left,x);
        }
        else if(root.data<x){
            root.right=deleteNode(root.right,x);
        }
        else{
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            else{
                Node succ=getSucc(root);
                root.data=succ.data;
                root.right=deleteNode(root.right,succ.data);
            }
        }
        return root;
        
    }
}