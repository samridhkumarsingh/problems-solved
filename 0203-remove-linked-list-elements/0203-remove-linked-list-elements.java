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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        if(head.next==null) 
        {
            if(head.val==val) return null;
            else return head;
        }
        ListNode temp=head;
        ListNode pre=null;

        while(temp!=null)
        {   
            ListNode after=temp.next;
            if(temp.val==val && temp==head)
            {
                head=head.next;
            }
            else if(temp.val==val)
            {
                pre.next=after;
                temp.next=null;
            }
           if(temp.val!=val) pre=temp;
            temp=after;

        }
        return head;
    }
}