package practice.examples;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *  Output: [[3], [9,20], [15,7]]
 */
public class BTLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();
        if (root == null) {
            return new ArrayList<>();
        }
        helper(output, root, 0);
        return output;
    }

    private static void helper(List<List<Integer>> output, TreeNode node, int level) {
        if (node == null) {
            return;
        }
        if (output.size() == level) {
            output.add(new ArrayList<>());
        }
        output.get(level).add(node.val);
        helper(output, node.left, level + 1);
        helper(output, node.right, level + 1);
    }
}
