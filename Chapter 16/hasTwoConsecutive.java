public boolean hasTwoConsecutive() {
    if (front == null) {return false;}
    ListNode curr = front;
    while(curr.next != null) {
        if (curr.next.data - 1 == curr.data)
            return true;
        curr = curr.next;
    }
    return false;
}
