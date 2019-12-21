package practice.examples;

import java.util.Arrays;

/**
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 * TestCases: (Output in form of TreeNode)
 * - Input: [3,9,20,15,7]
 *          [9,3,15,20,7]
 *   Output: [3,9,20,null,null,15,7]
 * - Input: [1,2,4,5,3,6,7]
 *          [4,2,5,1,6,3,7]
 *   Output: [1,2,3,4,5,6,7]
 * - Input: [1,2,4,6,7,3,5]
 *          [2,6,4,7,1,3,5]
 *   Output: [1,2,3,null,4,null,5,6,7]
 */
/**
 * Idea is to take root from preorder and divide inorder array into left sub tree and right sub tree
 */
public class BTFromPreAndInOrderTraversal {
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, inorder);
    }

    private static TreeNode helper (int[] pre, int[] in) {
        if (pre.length == 0 && in.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        int indexOfRootInInOrder = indexOf(in, root.val);

        int[] leftSubTreeIn = Arrays.copyOfRange(in, 0, indexOfRootInInOrder);
        if (leftSubTreeIn.length > 0) {
            int[] leftSubTreePre = Arrays.copyOfRange(pre, 1, leftSubTreeIn.length + 1);
            root.left = helper(leftSubTreePre, leftSubTreeIn);
        }

        int[] rightSubTreeIn = Arrays.copyOfRange(in, indexOfRootInInOrder + 1, in.length);
        if (rightSubTreeIn.length > 0) {
            int[] rightSubTreePre = Arrays.copyOfRange(pre, leftSubTreeIn.length + 1, pre.length);
            root.right = helper(rightSubTreePre, rightSubTreeIn);
        }
        return root;
    }

    private static int indexOf (int[] input, int x) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == x) return i;
        }
        return -1;
    }
}
