package practice.examples;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
 * Note: You may assume k is always valid, 1 ≤ k ≤ BST's total elements.
 * Example:
 * Input: root = [3,1,4,null,2], k = 1
 *    3
 *   / \
 *  1   4
 *   \
 *    2
 * Output: 1
 * Input: root = [5,3,6,2,4,null,null,1], k = 3
 *        5
 *       / \
 *      3   6
 *     / \
 *    2   4
 *   /
 *  1
 * Output: 3
 */
/**
 * Idea: Do inorder traversal for Binary Search Tree. BST or BT inorder traversal gives sorted array
 * Use the values in sorted array to return kth smallest element
 */
public class KthSmallestBST {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> array = new ArrayList<>();
        helper(root, array, 0);
        System.out.println(array);
        return array.get(k - 1);
    }

    private static void helper(TreeNode node, List<Integer> array, int current) {
        if (node == null) return;
        helper(node.left, array, current);
        array.add(node.val);
        current++;
        helper(node.right, array, current);
    }
}
