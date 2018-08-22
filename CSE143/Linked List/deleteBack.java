public int deleteBack() {
    if (front == null) {throw new NoSuchElementException();}
    
    if (front.next == null) {
        int value = front.data;
        front = null;
        return value;
    }
    
    ListNode runner = front;
    while(runner.next.next != null) {
        runner = runner.next;
    }
    
    int value = runner.next.data;
    runner.next = null;
    return value;
}
