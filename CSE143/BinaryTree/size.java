public int size() {
    return size(overallRoot);
}

private int size(IntTreeNode root) {
    if (root == null) {
        return 0;
    }
    
    return 1 + size(root.left) + size(root.right);
}
