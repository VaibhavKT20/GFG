/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Solution {
    ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        Queue<Node> q=new LinkedList<Node>();
        if(root==null){
            return result;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int count=q.size();
            for(int i=0;i<count;i++){
                Node curr=q.poll();
                if(i==0){
                    result.add(curr.data);
                }
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
        }
        return result;
    }
}