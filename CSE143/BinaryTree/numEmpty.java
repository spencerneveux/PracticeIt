public int numEmpty() {
    return numEmpty(overallRoot);
}

private int numEmpty(IntTreeNode root) {
    if (root == null)
        return 1;
    
    return numEmpty(root.left) + numEmpty(root.right);
}
