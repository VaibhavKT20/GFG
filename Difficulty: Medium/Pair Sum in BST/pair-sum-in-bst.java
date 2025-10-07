/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/
class Solution {
     boolean findTarget(Node root, int target) {
        HashSet<Integer> set = new HashSet<>();
        return helper(root, target, set);
    }
    boolean helper(Node root, int target, HashSet<Integer> set) {
        // Write your code here
        if(root==null){
            return false;
        }
        if(helper(root.left,target,set)){
            return true;
        }
        if(set.contains(target-root.data)){
            return true;
        }
        else{
            set.add(root.data);
        }
        return helper(root.right,target,set);
    }
}