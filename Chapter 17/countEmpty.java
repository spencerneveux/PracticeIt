public int countEmpty() {
    return countEmpty(overallRoot);
}

private int countEmpty(IntTreeNode root) {
    if (root == null) {
        return 1;
    }else if (root.left == null) {
        return 1 + countEmpty(root.right);
    }else if (root.right == null) {
        return 1 + countEmpty(root.left);
    }else {
        return countEmpty(root.left) + countEmpty(root.right);
    }
}
