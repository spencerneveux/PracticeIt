public void collapse(Stack<Integer> s) {
    Queue<Integer> q = new LinkedList<>();
    
    if (s.size() % 2 == 0) {
        while(!s.isEmpty()) {
            q.add(s.pop() + s.pop());
        }
    }else {
        int fixOdd = s.pop();
        q.add(fixOdd);
        while(!s.isEmpty()) {
            q.add(s.pop() + s.pop());
        }
    }
    
    while(!q.isEmpty()) {
        s.push(q.remove());
    }
    
    while(!s.isEmpty()) {
        q.add(s.pop());
    }
    
    while(!q.isEmpty()) {
        s.push(q.remove());
    }
    
}
