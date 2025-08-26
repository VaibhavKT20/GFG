// User function Template for Java

/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node divide(Node head) {
        // code here
        Node es=null, ee=null, os=null, oe=null;
        
        for(Node curr=head; curr!=null;curr=curr.next){
            if(curr.data%2==0){
                if(es==null){
                    es=ee=curr;
                }
                else{
                    ee.next=curr;
                    ee=ee.next;
                }
            }
            else{
                if(os==null){
                    os=oe=curr;
                }
                else{
                    oe.next=curr;
                    oe=oe.next;
                }
                
            }
            
        }
        if(os==null || es==null) return head;
        ee.next=os;
        oe.next=null;
        return es;
    }
}