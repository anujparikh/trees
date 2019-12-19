package practice.examples;

import java.util.Arrays;

/**
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees
 * of every node never differ by more than 1
 * Example:
 * Given the sorted array: [-10,-3,0,5,9],
 * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 */
public class HeightBalancedBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }
        int pointer = nums.length / 2;
        TreeNode output = new TreeNode(nums[pointer]);
        output.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, pointer));
        output.right = sortedArrayToBST(Arrays.copyOfRange(nums, pointer + 1, nums.length));
        return output;
    }
}
