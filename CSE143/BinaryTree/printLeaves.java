public void printLeaves() {
    if (overallRoot == null) {
        System.out.print("no leaves");
    }else {
        System.out.print("leaves: ");
        printLeaves(overallRoot);
    }
}

private void printLeaves(IntTreeNode root) {
    if (root == null) {
        return;
    }
    
    if (root.left == null && root.right == null) {
        System.out.print(root.data + " ");
    }
    
    printLeaves(root.right);
    printLeaves(root.left);
}
