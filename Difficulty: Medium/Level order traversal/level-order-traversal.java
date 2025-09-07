/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<Node> q=new LinkedList<Node>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                level.add(curr.data);
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
             }
             result.add(level);
        }
        return result;
    }
}