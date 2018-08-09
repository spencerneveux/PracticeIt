public boolean hasTwoConsecutive(){
    if (front == null || front.next == null) {
        return false;
    }
    
    ListNode curr = front;
    ListNode runner = front.next;
    
    while(runner.next != null) {
        if (curr.data - runner.data == -1) {
            return true;
        }
        runner = runner.next;
        curr = curr.next;
    }
    return false;
}
