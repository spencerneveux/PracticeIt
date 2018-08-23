public int countLeaves() {
    return countLeaves(overallRoot);
}

private int countLeaves(IntTreeNode root) {
    if (root == null) {
        return 0;
    }
    
    if (root.left == null && root.right == null) {
        return 1 + countLeaves(root.left) + countLeaves(root.right);
    }
    
    return countLeaves(root.left) + countLeaves(root.right);
}
