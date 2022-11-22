import java.util.*;

public class LeafTrails {
    private TreeMap<Integer, String> myMap = new TreeMap<>();

    private void helper(TreeNode tree, String s) {
        if (tree == null) return;
        if (tree.left == null && tree.right == null) {
            myMap.put(tree.info, s);
            return;
        }
        if (tree.left != null) helper(tree.left, s + 0);
        if (tree.right != null) helper(tree.right, s + 1);
    }

    public String[] trails(TreeNode tree) {
        if (tree != null) {
            helper(tree, "");
        }
        String[] str = new String[myMap.size()];
        int index = 0;
        for (int i : myMap.keySet()) {
            str[index] = myMap.get(i);
            index++;
        }
        return str;
    }
}
