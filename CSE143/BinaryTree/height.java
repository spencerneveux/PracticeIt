public int height() {
    return height(overallRoot);
}

private int height(IntTreeNode root) {
    if (root == null) {
        return 0;
    }
    int leftHeight = 1 + height(root.left);
    int rightHeight = 1 + height(root.right);
    if (leftHeight > rightHeight) {
        return leftHeight;
    }else {
        return rightHeight;
    }
}
