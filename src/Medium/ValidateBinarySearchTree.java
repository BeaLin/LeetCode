package Medium;

/**
 * Created by lby on 2017/4/17.
 * 98.Validate Binary Search Tree
 */
class TreeNode {
    long val;
    TreeNode left;
    TreeNode right;
    TreeNode(long x) { val = x; }
}
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
//        if(root==null)
//            return true;
//        if(root.left!=null && root.left.val>root.val)
//            return false;
//        if(root.right!=null && root.right.val<=root.val)
//            return false;
//        return isValidBST(root.left) && isValidBST(root.right);
        return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean isValidBST(TreeNode root,long minVal,long maxVal){
        if(root==null)
            return true;
        if(root.val<= minVal || root.val>=maxVal) return false;
        return isValidBST(root.left,minVal,root.val) && isValidBST(root.right,root.val,maxVal);
    }
}
