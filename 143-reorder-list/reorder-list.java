class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // Step 1: Find middle
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        ListNode second = reverseList(slow.next);
        slow.next = null; // Cut the list

        // Step 3: Merge two halves
        ListNode first = head;
        while (second != null) {
            ListNode tmp1 = first.next, tmp2 = second.next;
            first.next = second;
            second.next = tmp1;
            first = tmp1;
            second = tmp2;
        }
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
