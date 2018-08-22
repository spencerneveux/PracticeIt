public boolean equals(Stack<Integer> s1, Stack<Integer> s2) {
    boolean flag = true;
    Stack<Integer> s3 = new Stack<>();
    
    if (s1.size() != s2.size()) {
        return false;
    }else {
        while(!s1.isEmpty()) {
            s3.push(s1.pop());
            s3.push(s2.pop());
        }
    }
    
    while(!s3.isEmpty()) {
        s1.push(s3.pop());
    }
    
    while(!s1.isEmpty()) {
        s3.push(s1.pop());
    }
    
    while(!s3.isEmpty()) {
        int value1 = s3.pop();
        int value2 = s3.pop();
        
        if (value1 != value2) 
            flag = false;
        
        s1.push(value2);
        s2.push(value1);
    }
    
    return flag;
}
