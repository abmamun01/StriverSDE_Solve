package Day7;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointers {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {

        Map<Node, Node> map = new HashMap<>();
        Node temp = head;

        // make a copy LL
        while (temp != null) {
            Node copy = new Node(temp.val);
            //original node r address onujay copy node r address store korbo
            map.put(temp, new Node(temp.val));
            temp = temp.next;
        }

        // making connection
        // traverse again
        // Deep Copy
        temp = head;
        while (temp != null) {
            // temp r copy r next == temp r next
            map.get(temp).next = map.get(temp.next);
            map.get(temp).random = map.get(temp.random);
            temp=temp.next;
        }
        return map.get(head);
    }
}
