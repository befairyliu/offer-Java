package offer;

/**
 * @author befairyliu
 * 
 */
//删除链表中重复的结点
public class T56_deleteDuplication {
	
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
    public ListNode deleteDuplication(ListNode head) {
    	// check condition
        if(head == null || head.next == null){
            return head;
        }

        ListNode previous = null;
        ListNode current = head;

        while(current != null){
            if(current.next != null && current.val == current.next.val){
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}
