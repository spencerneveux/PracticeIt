public boolean isFull() {
    return isFull(overallRoot);
}

private boolean isFull(IntTreeNode root) {
    if (root == null){
        return true;
    }
    
    if (root.left == null && root.right != null) {
        return false;
    }
    
    if (root.left != null && root.right == null) {
        return false;
    }
    
    return isFull(root.left) && isFull(root.right);
}
