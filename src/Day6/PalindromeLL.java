package Day6;

public class PalindromeLL {

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


    ListNode reverseList(ListNode head) {

        if (head == null) return null;
        ListNode p = null, c = head, n = head.next;

        while (c != null) {
            c.next = p;
            p = c;
            c = n;
            if (n != null) n = n.next;
        }
        return p;
    }

    public boolean isPalindrome(ListNode head) {

        ListNode slow = head, fast = head;

        // make slow before mid
        while (fast.next != null && fast.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }
        // attach              // this is "slow.next"mid node
        slow.next = reverseList(slow.next);


        ListNode start = head, mid = slow.next;
        // compare
        while (mid != null) {
            if (mid.val != start.val) return false;

            // else ata k age baraw
            start = start.next;
            mid = mid.next;
        }

        // repair that you have reversed by reversing again
        slow.next = reverseList(slow.next);
        return true;
    }
}
