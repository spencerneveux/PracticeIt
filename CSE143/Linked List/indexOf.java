public int indexOf(int value) {
    int counter = 0;
    ListNode runner = front;
    while(runner != null) {
        if (runner.data == value) {
            return counter;
        }
        counter++;
        runner = runner.next;
    }
    
    return -1;
}
