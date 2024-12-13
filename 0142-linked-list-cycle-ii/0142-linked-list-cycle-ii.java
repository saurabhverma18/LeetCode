/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){   //#1----- checking for cycle
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)break;
        }
        if(slow!=fast)return null;      //#2--- if cycle persists or pointer points to null
        ListNode temp=head;
        while(temp!=slow)               //#3-- for finding the element in  linked list where cycle starts
        {                               // for it we initialize temp and do .next in slow and temp till temp==slow.;
            temp=temp.next;
            slow=slow.next;
        }
        return slow;

    }
}