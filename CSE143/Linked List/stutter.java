public void stutter() {
    if (front == null) {return;}
    ListNode runner = front;
    while(runner != null) {
        runner.next = new ListNode(runner.data, runner.next);
        runner = runner.next.next;
    }
}
