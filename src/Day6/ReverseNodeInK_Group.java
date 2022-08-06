package Day6;

import java.util.List;

public class ReverseNodeInK_Group {
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

    void reverse(ListNode s, ListNode e) {
        // initially Null
        ListNode p = null, c = s, n = s.next;

        while (p != e) {

            c.next = p;
            p = c;
            c = n;
            if (n != null) n = n.next;
            // end j hobe ata jana e karon niche ata k call e korechi reverse korar jonno

        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || head.next == null || k == 1) return head;

        ListNode dummy = new ListNode(-1);
        // dummy node is before the start value means -1
        // -1 1,2,3,4
        // initially end is
        dummy.next = head;
        ListNode beforeStart = dummy, e = head;

        // track how many time i incremented i
        int i = 0;
        while (e != null) {
            i++;

            if (i % k == 0) {
                // reversal

                ListNode s = beforeStart.next, temp = e.next;
                reverse(s, e);
                beforeStart.next = e;
                s.next = temp;
                //changing beforeStart
                beforeStart = s;
                e = temp;
            } else {
                e = e.next;
            }
        }

        return dummy.next;
    }
/*


    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || head.next == null || k == 1) return head;

        ListNode s = head, e = head;

        // end ke k ar last point koranor jonno
        int inc = k - 1;

        while (inc > 0) {
            e = e.next;
            if (e == null) return head;

            inc--;
        }

        ListNode nextHead = reverseKGroup(e.next, k);
        reverse(s, e);
        //recursion
        s.next = nextHead;
        return e;
    }*/
}
