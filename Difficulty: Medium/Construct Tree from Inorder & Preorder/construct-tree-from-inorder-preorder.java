/*
class Node {
    int data;
    Node left, right;

    Node(int key) {
        data = key;
        left = right = null;
    }
}
*/

class Solution {
    static int preIndex = 0;
    public static Node buildTree(int inorder[], int preorder[]) {
        // code here
        preIndex = 0;
        return buildTree(inorder, preorder, 0, inorder.length - 1);
    }
    public static Node buildTree(int inorder[], int preorder[], int inStart, int inEnd){
        if (inStart > inEnd) return null;
        Node root = new Node(preorder[preIndex++]);

        if (inStart == inEnd) return root;
        
        int inIndex = inStart;
        while (inIndex <= inEnd && inorder[inIndex] != root.data) {
            inIndex++;
        }

        root.left = buildTree(inorder, preorder, inStart, inIndex - 1);
        root.right = buildTree(inorder, preorder, inIndex + 1, inEnd);

        return root;
    }
}