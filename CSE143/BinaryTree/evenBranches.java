public int evenBranches() {
    return evenBranches(overallRoot);
}

private int evenBranches(IntTreeNode root) {
    if (root == null) {
        return 0;
    }
    
    if (root.left != null || root.right != null) {
        if (root.data % 2 == 0) {
            return 1 + evenBranches(root.left) + evenBranches(root.right);
        }
    }
    return evenBranches(root.left) + evenBranches(root.right);
}
