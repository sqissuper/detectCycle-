public ListNode detectCycle() {
//        if(head == null){
//            return null;
//        }
//        Node fast = head;
//        Node slow = head;
//        while(fast != null && fast.next != null){
//            fast = fast.next.next;
//            slow = slow.next;
//            if(fast == slow){
//                break;
//            }
//        }
//        if(fast == null || fast.next ==null){
//            return null;
//        }
//        slow = head;
//        while(slow != fast){
//            slow = slow.next;
//            fast = fast.next;
//        }
//        return fast;
//    }