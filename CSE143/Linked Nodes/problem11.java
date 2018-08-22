ListNode list2 = list;
list2 = list.next;
list2.next.next = list;
list.next = null;
list = list2;
