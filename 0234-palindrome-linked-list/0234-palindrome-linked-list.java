/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
     public static ListNode reverse(ListNode head){
            ListNode prev=null;
            ListNode agla=null;
            ListNode curr=head;
            while(curr!=null){
                agla=curr.next;
                curr.next=prev;
                prev=curr;
                curr=agla;

            }
            return prev;
        }
        public static ListNode middle(ListNode head){
            ListNode slow=head;
            ListNode fast=head;
            while( fast!=null && fast.next!=null ){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }
    public boolean isPalindrome(ListNode head) {
        ListNode middle=middle(head);
        ListNode r=reverse(middle);

        ListNode temp=head;
        while(r!=null){
            if(temp.val!=r.val){
                return false;
            }
            r=r.next;
            temp=temp.next;
        }
        return true;
    }
}