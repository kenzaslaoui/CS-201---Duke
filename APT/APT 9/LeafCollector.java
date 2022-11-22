import java.util.*;


public class LeafCollector {

    private List<ArrayList<String>> finalList = new ArrayList<>();

    public void collectAndRemove(TreeNode root, ArrayList<String> localList) {
        if(root == null) return;

        if(root.left != null && isLeaf(root.left)) {
            localList.add(String.valueOf(root.left.info));
            root.left = null;
        } 
        else {
            collectAndRemove(root.left, localList);
        }

        if(root.right != null && isLeaf(root.right)) {
            localList.add(String.valueOf(root.right.info));
            root.right = null;
        } 
        else {
            collectAndRemove(root.right, localList);
        }
    }


    public String[] getLeaves(TreeNode tree) {

        ArrayList<String> localList;
        while(tree.left != null || tree.right != null) {
            localList = new ArrayList<>();
            collectAndRemove(tree, localList);
            finalList.add(localList);
        }

        localList = new ArrayList<>();
        localList.add(String.valueOf(tree.info));

        finalList.add(localList);

        String[] ret = new String[finalList.size()];

        for (int i = 0; i < finalList.size(); i++) {
            ArrayList<String> round = finalList.get(i);
            ret[i] = String.join(" ", round);
        }

        return ret;
    }

    public boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
}

/*public class LeafCollector {
    private List<String> list = new ArrayList<String>();
    
    private void collectAndRemove(TreeNode root, List<String> localList){
        if(root == null){return;}
        if(root.left == null && root.right == null){return;}

        if(isLeaf(root.left)){
            list.add("" + String.valueOf(root.left.info));
            root.left = null;
        }
        else{collectAndRemove(root.left, list);}

        if(isLeaf(root.right)){
            list.add("" + String.valueOf(root.right.info));
            root.right = null;
        }
        else{collectAndRemove(root.right, list);}
    }

    public String[] getLeaves(TreeNode tree) {
        while(tree.left != null || tree.right != null){
            List<String> localList = new ArrayList<String>();
            collectAndRemove(tree, localList);
            list.add(String.join(" ", localList));
        }
        String[] leafArray = new String[list.size()];
        for(int i = 0; i<list.size(); i++){
            leafArray[i] = list.get(i);
        }
        return leafArray;
    }

    public boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
}
*/