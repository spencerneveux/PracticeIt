public int numberNodes() {
   return numberNodes(overallRoot, 1);
}

private int numberNodes(IntTreeNode root, int n) {
    if (root == null) {
        return 0;
    }
    
    root.data = n;
    int leftC = numberNodes(root.left, n + 1);
    int rightC = numberNodes(root.right, leftC + n + 1);
    return 1 + leftC + rightC;
    
    
}
