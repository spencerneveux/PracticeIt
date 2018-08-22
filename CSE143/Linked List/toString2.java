public String toString2() {
    ListNode runner = front;
    if (runner == null) {return "[]";}
    String result = "[";
    while(runner.next != null) {
        result += runner.data + ", ";
        runner = runner.next;
    }
    
    result += runner.data + "]";
    return result;
}
