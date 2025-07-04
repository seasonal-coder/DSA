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

 //checking leet sync
 
class Solution {
    public ListNode middleNode(ListNode head) {
        if (head.next != null) {
        
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

        }
        return slow;
        
        }
        return head;
    }
}