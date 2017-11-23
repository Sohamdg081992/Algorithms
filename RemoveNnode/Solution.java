class Solution {
	public class ListNode {
		  int val;
		ListNode next;
		 ListNode(int x) { val = x; }
		 }
  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode start= new ListNode(0);
    start.next = head;
    ListNode first = start;
    ListNode second = start;
    // Advances first pointer so that the gap between first and second is n nodes apart
    for (int i = 1; i <= n + 1; i++) {
        first = first.next;
    }
    // Move first to the end, maintaining the gap
    while (first != null) {
        first = first.next;
        second = second.next;
    }
    second.next = second.next.next;
    return start.next;
}
}