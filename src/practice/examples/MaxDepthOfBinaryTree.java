package pratice.examples;

/**
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from
 * the root node down to the farthest leaf node.
 */
public class MaxDepthOfBinaryTree {
    public static int solution(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Integer.max(solution(root.left), solution(root.right)) + 1;
    }
}
