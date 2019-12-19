package pratice.examples;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, return the inorder traversal of its nodes' values.
 * Input: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 * Output: [1,3,2]
 */
public class BTInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        return helper(root, result);
    }

    private static List<Integer> helper(TreeNode node, List<Integer> input) {
        if (node.left == null && node.right == null) {
            input.add(node.val);
        } else {
            if (node.left != null) helper(node.left, input);
            input.add(node.val);
            if (node.right != null) helper(node.right, input);
        }
        return input;
    }
}
