/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        Stack<Integer> s=new Stack<>();
        for(Node curr=head;curr!=null;curr=curr.next){
            s.push(curr.data);
        }
        for(Node curr=head;curr!=null;curr=curr.next){
            if(s.pop()!=curr.data){
                return false;
            }
        }
        return true;
    }
}