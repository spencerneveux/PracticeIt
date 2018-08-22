ListNode list2 = list;
list = list.next;
list2.next = list2.next.next;
list.next = list2;
