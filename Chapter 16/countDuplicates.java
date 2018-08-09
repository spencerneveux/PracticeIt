public int countDuplicates() {
    if (front == null) {return 0;}
    
    ListNode curr = front;
    ListNode runner = front.next;
    int count = 0;
    
    while(runner != null) {
        if (curr.data == runner.data) {
            count++;
        }else {
            curr = runner;
        }
        runner = runner.next;
    }
    return count;
}
