/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}*/

class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        int len1=getLength(head1);
        int len2=getLength(head2);
        Node curr1=head1;
        Node curr2=head2;
          
        if(len1>len2) {
            int diff=len1-len2;
            for(int i=0;i<diff;i++) curr1=curr1.next;
        } else {
            int diff=len2-len1;
            for(int i=0;i<diff;i++) curr2=curr2.next;
        }
        
        while(curr1!=null && curr2!=null){
            if(curr1==curr2){
                return curr1;
            }
            curr1=curr1.next;
            curr2=curr2.next;
        }
        return null;
    
    }
      private int getLength(Node head) {
        int len=0;
        while(head!=null) {
            len++;
            head=head.next;
        }
        return len;
    }
}