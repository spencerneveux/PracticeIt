public boolean isSorted() {
    if (front == null) {
        return true;
    }
    
    ListNode runner = front;
    while(runner.next != null) {
        if (runner.data <= runner.next.data){
            runner = runner.next;
        }else {
            return false;
        }
    }
    return true;
}
