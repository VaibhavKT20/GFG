/* class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
} */

class Solution {
    int findCeil(Node root, int x) {
        // code here
        int res=-1;
        while(root!=null){
            if(root.data==x){
                return root.data;
            }
            else if(root.data<x){
                root=root.right;
            }
            else{
                res=root.data;
                root=root.left;
            }
        
        }
        return res;
    }
}