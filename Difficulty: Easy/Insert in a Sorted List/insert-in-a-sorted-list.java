/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/

// sortedInsert method should return the head of the modified linked list.
class Solution {
    Node sortedInsert(Node head, int key) {
        // Add your code here.
        Node temp=new Node(key);
        if(head==null){
            return temp;
        }
        if(key<head.data){
            temp.next=head;
            return temp;
        }
        Node curr=head;
        while(curr.next!=null &&curr.next.data<key){
            curr=curr.next;
        }
        temp.next=curr.next;
        curr.next=temp;
        return head;
    }
}