public int deleteBack() {
    if (front == null) {
        throw new NoSuchElementException();
    }
    
    if (front.next == null) {
        int value = front.data;
        front = null;
        return value;
    }
    
    ListNode curr = front;
    while(curr.next.next != null) {
        curr = curr.next;
    }
    int value = curr.next.data;
    curr.next = null;
    return value;
}
