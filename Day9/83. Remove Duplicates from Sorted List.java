class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        if (head == null || head.next == null) {
            return head;
        }
        while (node != null && node.next != null) {
            if(node.val == node.next.val) {
                node.next = node.next.next;
            }
            else{
                node = node.next;
            }
        }
        return head;
    }
}
