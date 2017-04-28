package Medium;

/**
 * Created by lby on 2017/4/28.
 * 129.SumRootToLeafNumbers
 */
public class SumRootToLeafNumbers {
    public long sumNumbers(TreeNode root) {
        return sum(root,0);
    }
    private long sum(TreeNode root,long s){
        if(root==null) return 0;
        if(root.left==null&&root.right==null) return s*10+root.val;
        return sum(root.left,s*10+root.val)+sum(root.right,s*10+root.val);
    }
}
