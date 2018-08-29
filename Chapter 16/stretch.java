public void stretch(int n) {
    if (front == null) {return;}
    if (n <= 0) {
        front = null;
    }
    
    ListNode runner = front;
    while(runner != null) {
        for (int i = 1; i < n; i++) {
            runner.next = new ListNode(runner.data, runner.next);
            runner = runner.next;
        }
        runner = runner.next;
    }
}
