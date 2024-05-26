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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        ListNode temp1=head;
        while(temp1!=null && temp1.next!=null ){
            temp=temp.next;temp1=temp1.next.next;
        }
        return temp;
    }
}