public void stretch(int n) {
    ListNode current = front;
    
    for (int i = 0; i <= n; i++) {
        current.next = new ListNode(current.data, current.next);
        current = current.next;
    }
}
