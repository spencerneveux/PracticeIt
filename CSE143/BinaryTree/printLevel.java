public void printLevel(int n) {
    if (n < 1) {
        throw new IllegalArgumentException();
    }else {
        printLevel(overallRoot, n, 1);
    }
}

private void printLevel(IntTreeNode root, int value, int depth) {
    if (root == null) {
        return;
    }
    
    if (depth == value) {
        System.out.println(root.data);
    }
    
    printLevel(root.left, value, depth + 1);
    printLevel(root.right, value, depth + 1);
}
