public int min() {
    if (front == null) {
        throw new NoSuchElementException();
    }
    
    int min = front.data;
    ListNode runner = front;
    while(runner != null) {
        if (runner.data < min)
            min = runner.data;
        runner = runner.next;
    }
    return min;
}
