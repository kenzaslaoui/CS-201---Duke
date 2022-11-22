import java.util.*;

public class UniqueTreeValues {
    private TreeSet<Integer> set = new TreeSet<>();
    private void helper(TreeNode tree){
        if(tree == null){ return;}
        helper(tree.left);
        helper(tree.right);
        set.add(tree.info);
    }
    public int[] unique(TreeNode root) {
        if(root != null){
            helper(root);
        }
        int[] array = new int[set.size()];
        int index = 0;
        for(Integer value : set){
            array[index] = value;
            index++;
        }
        return array;
    }
}