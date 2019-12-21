package practice.examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * You are given a perfect binary tree where all leaves are on the same level, and every parent has two children
 * Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
 * Initially, all next pointers are set to NULL.
 */
/**
 * Use queque to connect nodes on different levels
 */
public class NextPointerForEachNode2 {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size() != 0) {
            int size = queue.size();
            Node previous = null;
            for (int i = 0; i < size; i++) {
                Node n = queue.poll();
                if (previous != null) {
                    previous.next = n;
                }
                previous = n;
                if (n.left != null && n.right != null) {
                    queue.add(n.left);
                    queue.add(n.right);
                }

            }
        }
        return root;
    }
}
