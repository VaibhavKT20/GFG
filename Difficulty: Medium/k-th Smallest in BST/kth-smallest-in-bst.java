// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }

class Solution {
    // Return the Kth smallest element in the given BST
    public int kthSmallest(Node root, int k) {
        // Write your code here
        if(root==null){
            return -1;
        }
        int lcount=countNodes(root.left);
        if((lcount+1)==k){
            return root.data;
        }
        else if(k<=lcount){
            return kthSmallest(root.left,k);
        }
        else{
            return kthSmallest(root.right,k-lcount-1);
        }
        
    }
     public int countNodes(Node root){
         if(root==null){
             return 0;
         }
         return 1+countNodes(root.left)+countNodes(root.right);
     }
}