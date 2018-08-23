public void doublePositives() {
    doublePositives(overallRoot);
}

private void doublePositives(IntTreeNode root) {
    if (root == null) {
        return;
    }
    
    if (root.data > 0) {
        root.data *= 2;
    }
    
    doublePositives(root.left);
    doublePositives(root.right);
}
