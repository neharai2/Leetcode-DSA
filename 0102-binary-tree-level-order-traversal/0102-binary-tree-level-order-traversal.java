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
    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new LinkedList<>();
        if (root ==null) return res;
        
        int count = 1;
        q.add(root);
        
        while (q.size() != 0) {
            int temp = count;
            List<Integer> level = new ArrayList<>();
            while (temp > 0) {
                TreeNode nd = q.remove();
                count--;
                level.add(nd.val);
                
                if (nd.left != null) {
                    q.add(nd.left);
                    count++;
                }
                if (nd.right != null) {
                    q.add(nd.right); 
                    count++;
                }
                temp--;
            }
            res.add(level);
        }
        return res;
        
    }
}