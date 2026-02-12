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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        Map<Integer, Integer> preIndex = new HashMap<>();

        for(int i =0; i< inorder.length; i++){
            preIndex.put(inorder[i], i);
        }

        return helper(preorder, preIndex, 0, 0, inorder.length-1);
    }

    public TreeNode helper(int[]preorder, Map<Integer, Integer> preIndex, int start, int left, int right){

        TreeNode root = new TreeNode(preorder[start]);

        int mid = preIndex.get(preorder[start]);

        if(mid > left){
            root.left = helper(preorder, preIndex, start+1 , left, mid-1);
        }
        if(mid < right){
            root.right = helper(preorder, preIndex, start+ mid-left +1, mid+1, right);
        }

      return root;
    }
}