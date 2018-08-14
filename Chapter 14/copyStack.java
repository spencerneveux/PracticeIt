public Stack copyStack(Stack<Integer> s1) {
    Queue<Integer> q = new LinkedList<>();
    Stack<Integer> s2 = new Stack<>();
    
    while(!s1.isEmpty()) {
        s2.push(s1.pop());
    }
    
    while(!s2.isEmpty()) {
        q.add(s2.pop());
    }
    
    while(!q.isEmpty()) {
        int element = q.remove();
        s1.push(element);
        s2.push(element);
    }
    
    return s2;
}
