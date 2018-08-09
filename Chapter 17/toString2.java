public String toString2() {
    return toString2(overallRoot);
}

private String toString2(IntTreeNode root) {
    if (root == null) {
        return "empty";
    }
    
    if (root.left == null && root.right == null) {
        return String.valueOf(root.data);
    }
    
    return "(" + root.data + ", " + toString2(root.left) + ", " + toString2(root.right) + ")";
}
