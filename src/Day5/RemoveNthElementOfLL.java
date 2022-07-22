package Day5;

public class RemoveNthElementOfLL {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public ListNode removeNthFromEnd(ListNode head, int n) {

        // dummy Node
        ListNode start = new ListNode();
        // assign next to head
        start.next = head;

        // Take two pointer
        ListNode fast = start;
        ListNode slow = start;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // till null reach
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next;

        return start.next;
    }
}
