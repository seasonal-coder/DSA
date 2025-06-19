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
    public ListNode partition(ListNode head, int x) {
        ListNode d1 = new ListNode(0);
        ListNode d2 = new ListNode(0);
        ListNode p1 = d1, p2 = d2;

        while (head!=null){
            if(head.val<x){
                p1.next=head;
                p1=p1.next;
                head=head.next;
            } else {
                p2.next=head;
                p2=p2.next;
                head=head.next;
        
            }

        }
        p2.next=null;
        p1.next=d2.next;
        
        return d1.next;
    }
}