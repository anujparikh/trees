package pratice.examples;

/**
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 * Assume a BST is defined as follows:
 * - The left subtree of a node contains only nodes with keys less than the node's key.
 * - The right subtree of a node contains only nodes with keys greater than the node's key.
 * - Both the left and right subtrees must also be binary search trees.
 *
 * Example:
 *  Input: [2,1,3] Output: true; Input: [5,1,4,null,null,3,6] Output: false
 */
public class ValidBST {
    public boolean isValidBST(TreeNode root) {
        return ValidBST.helper(root, null, null);
    }

    private static boolean helper (TreeNode node, TreeNode lower, TreeNode upper) {
        if (node == null) {
            return true;
        }
        if (lower != null && node.val <= lower.val) {
            return false;
        }
        if (upper != null && node.val >= upper.val) {
            return false;
        }
        if ((node.left != null && node.left.val >= node.val) || (node.right != null && node.right.val <= node.val )) {
            return false;
        } else {
            return helper(node.left, lower, node) && helper(node.right, node, upper);
        }
    }
}
