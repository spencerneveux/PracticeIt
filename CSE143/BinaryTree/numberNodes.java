public int numberNodes() {
    return numberNodes(overallRoot, 1);
}

private int numberNodes(IntTreeNode root, int n) {
    if (root == null) {
        return 0;
    }
    
    root.data = n;
    int left = numberNodes(root.left, n + 1);
    int right = numberNodes(root.right, left + n + 1);
    return 1 + left + right;
}
