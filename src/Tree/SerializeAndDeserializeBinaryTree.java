package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserializeBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public class ConstructBinaryTree {


        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {

            if (root == null) return "";

            StringBuilder data = new StringBuilder();

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {

                TreeNode value = queue.poll();

                // normally jodi root.left ba right null thake tahole amra
                // ignore kore jai kintu akhane pick korbo karon null thakle
                // amdr string r modde null ba x input kore janate hobe j
                // akhane null so next node dekhte hobe atar nice ar node hobena
                if (value == null) {
                    data.append("x");
                    continue;
                }

                // we are using comma to separating between node
                data.append(value.val + ",");

                //next node r data queue add korbo
                queue.add(value.left);
                queue.add(value.right);
            }
            return data.toString();

        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {

            if (data == "") return null;
            Queue<TreeNode> queue = new LinkedList<>();

            String[] values = data.split(",");
            TreeNode root = new TreeNode(Integer.parseInt(values[0]));

            queue.add(root);

            for (int i = 0; i < values.length; i++) {

                TreeNode parent = queue.poll();

                if (!values[i].equals("x")) {

                    TreeNode left = new TreeNode(Integer.parseInt(values[i]));
                    parent.left = left;
                    queue.add(left);
                }

                if (!values[++i].equals("x")) {

                    TreeNode right = new TreeNode(Integer.parseInt(values[i]));
                    parent.right = right;
                    queue.add(right);
                }
            }

            return root;
        }
    }
}
