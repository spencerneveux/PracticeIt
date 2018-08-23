public void stutter(Stack<Integer> s) {
    if (s.isEmpty()) {
        return;
    }
    
    int x = s.pop();
    stutter(s);
    s.push(x);
    s.push(x); 
}
