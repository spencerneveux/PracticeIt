public void switchPairs() {
     if (front == null || front.next == null) {
         return;
     }
    
    // get count to determine if even or odd
    ListNode runner0 = front;
    int count = 1;
    while(runner0.next != null) {
        count++;
        runner0 = runner0.next;
    }
    
    ListNode curr = front;
    ListNode runner = front.next;

        while(curr.next != null) {
            front = runner;
            curr.next = runner.next;
            runner.next = curr;
        }
}
