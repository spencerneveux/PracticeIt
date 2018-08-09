public int countLeftNodes(){
    return countLeftNodes(overallRoot);
}

private int countLeftNodes(IntTreeNode root){
    if (root == null) {
        return 0;
    }else if (root.left == null) {
        return countLeftNodes(root.right);
    }else {
        return 1 + countLeftNodes(root.left) + countLeftNodes(root.right);
    }
}
