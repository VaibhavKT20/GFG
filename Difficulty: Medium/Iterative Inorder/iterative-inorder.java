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
class Solution {
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> result=new ArrayList<Integer>();
        Stack<Node> s=new Stack<Node>();
        Node curr=root;
        while(curr!=null||!s.isEmpty()){
            while(curr!=null){
                s.push(curr);
                curr=curr.left;
            }
            curr=s.pop();
            result.add(curr.data);
            curr=curr.right;
        }
        return result;
    }
}