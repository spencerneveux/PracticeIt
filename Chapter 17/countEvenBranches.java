public int countEvenBranches() {
    return countEvenBranches(overallRoot);
}

private int countEvenBranches(IntTreeNode root) {
    if (root == null) {
        return 0;
    }else if (root.left != null || root.right != null) {
        if (root.data % 2 == 0) {
            return 1 + countEvenBranches(root.left) + countEvenBranches(root.right);
        }
        return countEvenBranches(root.left) + countEvenBranches(root.right);
    }
    return countEvenBranches(root.left) + countEvenBranches(root.right);
}
