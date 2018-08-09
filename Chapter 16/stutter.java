public void stutter() {
    ListNode curr = front;
    while(curr != null) {
        curr.next = new ListNode(curr.data, curr.next);
        curr = curr.next.next;
    }
}
