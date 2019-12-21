package practice.examples;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given a perfect binary tree where all leaves are on the same level, and every parent has two children
 * Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
 * Initially, all next pointers are set to NULL.
 */

/**
 * Idea is to do level order list of list and connect the next pointer to next node in the list
 */
public class NextPointerForEachNode {
    public Node connect(Node root) {
        List<List<Node>> levelOrder = new ArrayList<>();
        helper(root, 0, levelOrder);
        for (List<Node> temp : levelOrder) {
            for (int j = 0; j < temp.size() - 1; j++) {
                temp.get(j).next = temp.get(j+1);
            }
        }
        return root;
    }

    private static void helper (Node node, int level, List<List<Node>> levelOrder) {
        if (node == null) return;
        if (levelOrder.size() == level) {
            List<Node> temp = new ArrayList<>();
            temp.add(node);
            levelOrder.add(temp);
        } else {
            levelOrder.get(level).add(node);
        }
        helper(node.left, level + 1, levelOrder);
        helper(node.right, level + 1, levelOrder);
    }
}
