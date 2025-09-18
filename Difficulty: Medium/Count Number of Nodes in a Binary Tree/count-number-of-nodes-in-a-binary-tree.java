// User function Template for Java

class Solution {

    public static int countNodes(Node root) {
        // Code here
        if(root==null){
            return 0;
        }
        else{
            return 1+countNodes(root.left)+countNodes(root.right);
        }
    }
}