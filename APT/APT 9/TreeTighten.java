public class TreeTighten {
    public TreeNode tighten(TreeNode t) {
        if(t == null){return null;}
        TreeNode left = tighten(t.left);
        TreeNode right = tighten(t.right);
        if(left == null && right != null){ return right;}
        if(left != null && right == null){ return left;}
        return new TreeNode(t.info, left, right);
    }
}