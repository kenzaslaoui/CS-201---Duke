public class PathSum {
    public int hasPath(int target, TreeNode tree){
        if(tree == null){ return 0;}
        if(tree.left == null & tree.right == null & tree.info == target) {return 1;}
        int leftAnswer = hasPath(target - tree.info, tree.left);
        int rightAnswer = hasPath(target - tree.info, tree.right);
        return Math.max(leftAnswer, rightAnswer);
    }
}