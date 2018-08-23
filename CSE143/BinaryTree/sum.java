public int sum() {
    return sum(overallRoot);
}

private int sum(IntTreeNode root) {
    if (root == null) {
        return 0;
    }
    
    return root.data + sum(root.left) + sum(root.right);
}
