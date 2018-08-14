public boolean equals(Stack<Integer> s1, Stack<Integer> s2) {
    Stack<Integer> temp = new Stack<>();
    boolean flag = true;
    
    if (s1.size() != s2.size()) {
        return false;
    }
    
    while(!s1.isEmpty()) {
        int value1 = s1.pop();
        int value2 = s2.pop();
        if (value1 != value2) {
            flag = false;
        }
        temp.push(value1);
        temp.push(value2);
    }
    
    while(!temp.isEmpty()) {
        s2.push(temp.pop());
        s1.push(temp.pop());
    }
    
    return flag;
}
