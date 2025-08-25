/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    public static Node reverseKGroup(Node head, int k) {
        // code here
        Node curr=head;
        Node prev=null;
        Node next=null;
        int count=0;
        while(curr!=null &&count<k){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(next!=null){
            Node rest_head=reverseKGroup(next,k);
            head.next=rest_head;
        }
        return prev;
    }
}