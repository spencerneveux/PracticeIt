public void set(int index, int value) {
    ListNode runner = front;
    int count = 0;
    while(count != index) {
        count++;
        runner = runner.next;
    }
    
    runner.data = value;
}
