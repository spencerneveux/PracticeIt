public int depthSum() {
    return depthSum(overallRoot, 1);
}

private int depthSum(IntTreeNode root, int level) {
    if (root == null){
        return 0;
    }else {
        return level * root.data + depthSum(root.left, level + 1) + depthSum(root.right, level + 1);
    }
}
