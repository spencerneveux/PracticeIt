public int lastIndexOf(int value) {
    if (front == null) {return -1;}
    
    ListNode runner = front;
    int index = -1;
    int counter = 0;
    while(runner != null) {
        if (runner.data == value) {
            index = counter;
        }
        counter++;
        runner = runner.next;
    }
    
    return index;
}
