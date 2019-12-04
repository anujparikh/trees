package pratice.examples;

/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * Example:
 *      1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3 Output: true
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3 Output: false
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return helper(root.left, root.right);
    }

    private static boolean helper(TreeNode l, TreeNode r) {
        if (l == null && r == null) return true;
        if (l == null || r == null || l.val != r.val) return false;
        return helper(l.left, r.right) && helper(l.right, r.left);
    }
}
