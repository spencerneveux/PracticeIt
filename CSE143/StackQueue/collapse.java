public void collapse(Stack<Integer> s) {
    Queue<Integer> q = new LinkedList<>();
    
    int size = 0;
    while(!s.isEmpty()) {
        size++;
        q.add(s.pop());
    }
    
    if (size % 2 == 0) {
        while(!q.isEmpty()) {
            s.push(q.remove() + q.remove());
        }
    }else {
        s.push(q.remove());
        while(!q.isEmpty()) {
            s.push(q.remove() + q.remove());
        }
    }
    
    while(!s.isEmpty()) {
        q.add(s.pop());
    }
    
    while(!q.isEmpty()) {
        s.push(q.remove());
    }
}
