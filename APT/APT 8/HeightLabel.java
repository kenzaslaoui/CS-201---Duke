/*public class HeightLabel {
    private int height(TreeNode t) {
        if (t == null){return 0;}
        return 1 + Math.max(height(t.left),height(t.right));
    
    }
    public TreeNode rewire(TreeNode t) {
        if (t == null){ return null;}
        return new TreeNode(height(t), rewire(t.left),rewire(t.right));
    }
}*/

public class HeightLabel {
    public TreeNode rewire(TreeNode t) {
        if (t == null){ return null;}
        //if(t.left == null && t.right == null) {return new TreeNode(1, null, null);}
        TreeNode left = rewire(t.left);
        TreeNode right = rewire(t.right);
        if(left == null && right == null){ t.info = 1;}
        else if (left == null && right != null) {t.info = 1+ right.info;}
        else if (left != null && right == null) {t.info = 1 + left.info;}
        else {t.info = 1 + Math.max(left.info, right.info);}
        return new TreeNode(t.info, left, right);

    }
}



        