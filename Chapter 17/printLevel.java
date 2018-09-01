public void printLevel(int n) {
    if (n < 1) {
        throw new IllegalArgumentException();
    }else {
        printLevel(overallRoot, n, 1);
    }
}

private void printLevel(IntTreeNode root, int level, int depth) {
    if (root == null) {
        return;
    }
    
    if (depth == level) {
        System.out.println(root.data);
        return;
    }
    
    printLevel(root.left, level, depth + 1);
    printLevel(root.right, level, depth + 1);
}
