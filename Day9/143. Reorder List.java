class Solution {
     public void reorderList(ListNode head) {
        if (head==null){
            System.out.println("List is empty");
            return;
        }

        ListNode mid = mid(head);

        ListNode firstHalf = head;
        ListNode nextHalf = reverse(mid);

        while (firstHalf != null && nextHalf!=null){

            ListNode temp = firstHalf.next;
            firstHalf.next = nextHalf;
            firstHalf = temp;

            temp = nextHalf.next;
            nextHalf.next = firstHalf;
            nextHalf = temp;
        }

        if (firstHalf!=null){
            firstHalf.next = null;
        }
    }
    public ListNode mid(ListNode head){
        if (head == null || head.next == null)return head;

        ListNode slow = head;
        ListNode fast = head;

        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        if (head==null||head.next==null)return head;

        ListNode pre = null;
        ListNode current = head;

        while (current!=null){
            ListNode next_Node = current.next;
            current.next = pre;
            pre = current;
            current = next_Node;

        }
        return pre;
    }
}
