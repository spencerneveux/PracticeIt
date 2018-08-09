public int lastIndexOf(int value) {
    if (front == null)
        return -1;
    
    int index = 0;
    int countPosition = -1;
    ListNode runner = front;
    while(runner != null) {
        if (runner.data == value) 
            countPosition = index;
        runner = runner.next;
        index++;
    }
    return countPosition;
}
