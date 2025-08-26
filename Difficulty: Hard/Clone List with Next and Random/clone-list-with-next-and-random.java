/*
class Node {
    int data;
    Node next;
    Node random;

    Node(int x) {
        data = x;
        next = null;
        random = null;
    }
}
*/
class Solution {
    public Node cloneLinkedList(Node head) {
        // code here
        HashMap<Node,Node> m=new HashMap<>();
        for(Node curr=head;curr!=null;curr=curr.next){
            m.put(curr,new Node(curr.data));
        }
        for(Node curr=head;curr!=null;curr=curr.next){
            Node clone=m.get(curr);
            clone.next=m.get(curr.next);
            clone.random=m.get(curr.random);
        }
        return m.get(head);
    }
}