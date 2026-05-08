/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {


    //   ListNode temp=node;      //not optimal because we are traversing till end
    //   while(temp.next.next!=null)
    //   {
    //     temp.val=temp.next.val;
    //     temp=temp.next;
    //   }
    //    temp.val=temp.next.val;
    //   temp.next=null;
   

    node.val=node.next.val;
    node.next=node.next.next;
    }
}