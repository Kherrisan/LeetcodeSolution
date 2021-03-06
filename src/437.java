/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int pathSum(TreeNode root, int sum) {
        if(root==null){
            return 0;
        }
        return pathSumFrom(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);
    }
    
    public int pathSumFrom(TreeNode root,int sum){
        if(root==null){
            return 0;
        }
        int cur=0;
        if(sum==root.val){
            cur=1;
        }else{
            cur=0;
        }
        return cur+pathSumFrom(root.left,sum-root.val)+pathSumFrom(root.right,sum-root.val);
    }
}