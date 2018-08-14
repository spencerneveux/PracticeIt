public boolean isPalindrome(Queue<Integer> q) {
    Stack<Integer> s = new Stack<>();
    int oldSize = q.size();
    boolean flag = true;
    
    for (int i = 0; i < oldSize; i++) {
        int value = q.remove();
        q.add(value);
        s.push(value);    
    }
    
    for (int i = 0; i < oldSize; i++) {
        int v1 = q.remove();
        int v2 = s.pop();
        
        if (v1 != v2) {
            flag = false;
        }
        
        q.add(v1);
    }
    
    return flag;
}
