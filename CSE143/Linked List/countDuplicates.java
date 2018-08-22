public int countDuplicates() {
    if (front == null) {return 0;}
    int count = 0;
    ListNode runner = front;
    while(runner.next != null) {
        if (runner.data == runner.next.data) 
            count++;
        runner = runner.next;
    }
    return count;
}
