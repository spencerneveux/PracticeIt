public void splitStack(Stack<Integer> s) {
    Queue<Integer> q = new LinkedList<>();
    int negCounter = 0;
    
    while(!s.isEmpty()) {
        int element = s.pop();
        if (element < 0) {
            negCounter++;
        }
        q.add(element);
    }
    
    while(negCounter != 0) {
        if (q.peek() < 0) {
            s.push(q.remove());
            negCounter--;
        }else {
            q.add(q.remove());
        }
    }
    
    while(!q.isEmpty()) {
        s.push(q.remove());
    }
}
