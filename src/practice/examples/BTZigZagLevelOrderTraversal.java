package practice.examples;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right,
 * then right to left for the next level and alternate between).
 * Example:
 *  Input:
 *      3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *  Output: [[3],[20,9],[15,7]]
 */
public class BTZigZagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        helper(root, 0, result);
        return result;
    }

    private static void helper (TreeNode node, int level, List<List<Integer>> res) {
        if (node == null) {
            return;
        }
        if (res.size() == level) {
            res.add(new ArrayList<>());
        }
        if (level % 2 == 0) {
            res.get(level).add(node.val);
        } else {
            res.get(level).add(0, node.val);
        }
        helper(node.left, level + 1, res);
        helper(node.right, level + 1, res);
    }
}
