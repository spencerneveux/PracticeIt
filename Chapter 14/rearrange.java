public void rearrange(Queue<Integer> q) {
    Stack<Integer> s = new Stack<>();
    int size = q.size();
    
    for (int i = 0; i < size; i++) {
        int value = q.remove();
        if (value % 2 == 0) {
            s.push(value);
        }else {
            q.add(value);
        }
    }
    
    for (int i = 0; i < 2; i++) {
        while(!q.isEmpty()) {
            s.push(q.remove());
        }
        
        while(!s.isEmpty()) {
            q.add(s.pop());
        }
    }
}
