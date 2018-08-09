public void printLevel(int n) {
    if (n < 1) {
        throw new IllegalArgumentException();
    }
    
    printLevel(overallRoot, n);
}

private void printLevel(IntTreeNode root, int level){
    if (root == null) {
        return;
    }
    
    if (level == 1) {
        System.out.println(root.data);
        return;
    }
    
    printLevel(root.left, level - 1);
    printLevel(root.right, level - 1);
    
}
