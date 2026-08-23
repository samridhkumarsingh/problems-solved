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
        ListNode tempa=headA;
        ListNode tempb=headB;
        int al=0,bl=0;

        while(tempa!=null)
        {
            al++;
            tempa=tempa.next;
        }

         while(tempb!=null)
        {
            bl++;
            tempb=tempb.next;
        }
        tempa=headA;
        tempb=headB;
        if(al>bl)
        {
            while(al-bl>0)
            {
                tempa=tempa.next;
                al--;
            }
        }
        else
        {
            while(bl-al>0)
            {
                tempb=tempb.next;
                bl--;
            }
        }

        while(tempa!=tempb)
        {
            tempa=tempa.next;
            tempb=tempb.next;
        }
        if(tempa==tempb) return tempa;
        else return null;
    }
}