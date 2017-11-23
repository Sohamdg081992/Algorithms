public class CycleDetect{
    public boolean hasCycle(ListNode head) {
        if(head==null)return false;
        ListNode rab=head; ListNode tor=head;
        while(rab.next!=null && rab.next.next!=null){
            rab=rab.next.next;
            tor=tor.next;
        if (rab==tor)return true;
        } 
return false;
    }
}