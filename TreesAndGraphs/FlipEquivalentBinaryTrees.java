/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if(root1 == root2) {
            return true; // base case
        }
        
        if(root1 == null || root2 == null || root1.val != root2.val) {
            return false; // base case
        }
        
        return (flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right)) || 
            (flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left));
    }
}

/*Complexity Analysis
Time Complexity: O(min(N_1, N_2))O(min(N 1,N 2)), where N_1, N_2, N 1,N 2
  are the lengths of root1 and root2.
Space Complexity: O(min(H_1, H_2))O(min(H 1,H 2)), where H_1, H_2, H 1, H 2
  are the heights of the trees of root1 and root2. */