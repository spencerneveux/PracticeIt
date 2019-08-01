public int size() {return size(overallRoot);}

private int size(IntTreeNode node) {
    if (node == null) return 0;
    
    return size(node.left) + size(node.right) + 1;
}
