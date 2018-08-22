public boolean hasTwoConsecutive() {
    if (front == null) {return false;}
    ListNode runner = front;
    while(runner.next != null) {
        if (runner.next.data == runner.data + 1)
            return true;
        runner = runner.next;
    }
    
    return false;
}
