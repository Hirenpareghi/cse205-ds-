class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null && head.next == null) return head;
        ListNode dummy = new ListNode(-1, head);
        ListNode curr = head;
        ListNode numInsert, prev;

        while(curr != null && curr.next != null) {
            if(curr.val <= curr.next.val) {
                curr = curr.next;
            } else {
                numInsert = curr.next; // numInsert -> the smaller value which needs to be its correct position
                prev = dummy; // prev -> this indicate the position where numInsert will be inserted
                while(prev.next.val < numInsert.val) {
                    prev = prev.next;
                }
                curr.next = numInsert.next;
                numInsert.next = prev.next;
                prev.next = numInsert;
            }
        }
        return dummy.next;
    }
}