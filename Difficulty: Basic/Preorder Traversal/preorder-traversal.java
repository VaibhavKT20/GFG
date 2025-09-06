class Solution {
    public void preorderHelper(Node root,ArrayList<Integer> result){
        
        if(root!=null){
            result.add(root.data);
            preorderHelper(root.left,result);
            preorderHelper(root.right,result);
        }
          
    }
    public ArrayList<Integer> preorder(Node root) {
        //  code here
        ArrayList<Integer> result=new ArrayList<>();
        preorderHelper(root,result);
        return result;
    }
}