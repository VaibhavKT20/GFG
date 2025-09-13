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
} */

class Solution {
    int maxWidth(Node root) {
        //  code here
        if(root==null){
            return 0;
        }
        Queue<Node> q=new LinkedList<Node>();
        q.offer(root);
        int res=0;
        while(!q.isEmpty()){
            int count=q.size();
            res=Math.max(res,count);
            for(int i=0;i<count;i++){
                Node curr=q.poll();
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
        }
        return res;
    }
}