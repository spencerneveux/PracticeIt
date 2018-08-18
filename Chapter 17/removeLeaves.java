public void removeLeaves() {
    overallRoot = removeLeaves(overallRoot);
}

private IntTreeNode removeLeaves(IntTreeNode root) {
    if (root == null) {
        return null;
    }
    
    if (root.left == null && root.right == null) {
        return null;
    }
    
    root.left = removeLeaves(root.left);
    root.right = removeLeaves(root.right);
    return root;
}
