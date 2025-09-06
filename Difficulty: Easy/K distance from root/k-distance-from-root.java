/*
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Tree {
    // Recursive function to print right view of a binary tree.
    public void KdistanceHelper(Node root,int k, ArrayList<Integer> result){
        if(root==null){
            return;
            
        }
        if(k==0){
            result.add(root.data);
        }
        else{
            KdistanceHelper(root.left,k-1,result);
            KdistanceHelper(root.right,k-1,result);
        }
    }
    ArrayList<Integer> Kdistance(Node root, int k) {
        // Your code here
        ArrayList<Integer> result=new ArrayList<>();
        KdistanceHelper(root,k,result);
        return result;
    }
}