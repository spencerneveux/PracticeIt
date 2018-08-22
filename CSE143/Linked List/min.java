public int min() {
    if (front == null) {throw new NoSuchElementException();}
    ListNode runner = front;
    int min = runner.data;
    while(runner != null) {
        if (runner.data < min) 
            min = runner.data;
        runner = runner.next;
    }
    return min;
}
