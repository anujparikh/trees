package practice.examples;

import java.util.LinkedList;
import java.util.Queue;

/**
 * You are given a perfect binary tree where all leaves are on the same level, and every parent has two children
 * Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
 * Initially, all next pointers are set to NULL.
 */

/**
 * Use queque to connect nodes on different levels
 */
public class NextPointerForEachNode3 {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        helper(root.left, root.right);
        return root;
    }

    public static void helper(Node node1, Node node2){
        if(node1 == null) return;
        node1.next = node2;
        helper(node1.left, node1.right);
        helper(node2.left, node2.right);
        helper(node1.right, node2.left);
    }
}
