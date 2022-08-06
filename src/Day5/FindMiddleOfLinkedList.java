package Day5;

public class FindMiddleOfLinkedList {


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


    ListNode middleNode(ListNode head) {


        ListNode slowNode = head, fastNode = head;

        while (fastNode != null && fastNode.next != null) {

            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }

        return slowNode;
    }

/*    ListNode middleNode(ListNode head) {

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            // move step by 1
            slow = slow.next;
            // move step 2
            fast = fast.next.next;
        }
        return slow;
    }*/


}
