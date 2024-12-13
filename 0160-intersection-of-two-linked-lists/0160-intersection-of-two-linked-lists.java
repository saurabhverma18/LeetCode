/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp=headA;
        ListNode temp1=headB;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        int count1=0;
        while(temp1!=null)
        {
            count1++;
            temp1=temp1.next;
        }
        temp=headA;
        temp1=headB;
        if(count>count1)
        {
            for(int i=1;i<=count-count1;i++){
                temp=temp.next;
            }
        }
        else{
            for(int i=1;i<=count1-count;i++){
                temp1=temp1.next;
        }
        }
        while(temp!=temp1)
        {
            temp=temp.next;
            temp1=temp1.next;
        }
       
      return temp;
    }
   
  
} 
