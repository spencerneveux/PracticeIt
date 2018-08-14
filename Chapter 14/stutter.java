public void stutter(Stack<Integer> s) {
    Queue<Integer> q = new LinkedList<>();
    
    while(!s.isEmpty()) {
        int element = s.pop();
        q.add(element);
        q.add(element);
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
