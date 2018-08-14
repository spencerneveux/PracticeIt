public void reverseHalf(Queue<Integer> q) {
    Stack<Integer> s = new Stack<>();
    int oldSize = q.size();
    
    for (int i = 0; i < oldSize; i++) {
        if (i % 2 == 1) {
            s.push(q.remove());
        }else {
            q.add(q.remove());
        }
    }
    
    while(!s.isEmpty()) {
        q.add(q.remove());
        q.add(s.pop());
    }
    
    if (oldSize % 2 == 1) {
        q.add(q.remove());
    }

}
