package Day5;

public class AddTwoNumbersInLLL {
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


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;

        int carry = 0;
        while (l1 != null || l2 != null || carry == 1) {
            int sum = 0;
            if (l1 != null) {
                // add it to sum
                sum += l1.val;
                // move l1 to next
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }


            // add carry to sum
            sum += carry;
            // reinitiallize carry to sum
            carry = sum / 10;

            // init new node with module
            ListNode node = new ListNode(sum % 10);
            // temp will be pointing to it's next pointer i.e newNode
            temp.next = node;
            temp = temp.next;

        }

        return dummy.next;

    }
}
