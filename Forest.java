public class Forest {

    // instance variables
    private Tree tree0 = null, tree1 = null, tree2 = null, tree3 = null;

    // methods
    public void setTree(int treeNum, Tree tree) {
        if      (treeNum == 0) tree0 = tree;
        else if (treeNum == 1) tree1 = tree;
        else if (treeNum == 2) tree2 = tree;
        else if (treeNum == 3) tree3 = tree;
    }

    public Tree getTree(int treeNum) {
        if      (treeNum == 0) return tree0;
        else if (treeNum == 1) return tree1;
        else if (treeNum == 2) return tree2;
        else if (treeNum == 3) return tree3;
        else                   return null;
    }

    // build a string
    public String toString() {
        if (tree0 == null && tree1 == null && tree2 == null && tree3 == null)
            return "No Trees in Forest";

        String str = "Forest:\n";
        if (tree0 != null) str += "Tree 0: " + tree0.toString() + "\n";
        if (tree1 != null) str += "Tree 1: " + tree1.toString() + "\n";
        if (tree2 != null) str += "Tree 2: " + tree2.toString() + "\n";
        if (tree3 != null) str += "Tree 3: " + tree3.toString() + "\n";

        return str;
    }
}
