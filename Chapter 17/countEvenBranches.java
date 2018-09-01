public int countEvenBranches() {
    return countEvenBranches(overallRoot);
}

private int countEvenBranches(IntTreeNode root) {
    if (root == null) {
        return 0;
    }
    
    int count = 0;
    if (root.left != null || root.right != null) {
        if (root.data % 2 == 0) 
            count++;
    }
    
    return count + countEvenBranches(root.left) + countEvenBranches(root.right);
}
