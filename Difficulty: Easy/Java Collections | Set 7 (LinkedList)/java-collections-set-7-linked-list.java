class GfG {
    public void deleteNode(Node node) {
        // Add your code here
        node.data=node.next.data;
        node.next=node.next.next;
    }
}