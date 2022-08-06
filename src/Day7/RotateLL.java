package Day7;

public class RotateLL {


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

    public ListNode rotateRight(ListNode head, int k) {

        //Edge cases
        if (head == null || head.next == null || k == 0) return head;

        //Compute the lenght
        ListNode current = head;
        int length = 1;

        while (current.next != null) {
            length++;
            current = current.next;
        }

        //go till that node
        current.next = head;
        k = k % length;
        k = length - k;

        while (k-- > 0) current = current.next;


        //make the node head and break connection
        head = current.next;
        current.next = null;

        return head;
    }

}
