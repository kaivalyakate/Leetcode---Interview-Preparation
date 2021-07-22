import java.util.List;

public class SwapNodesPairs {
    
    public static ListNode swapPairs(ListNode head) {
        ListNode nextSwap = null;
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        if(head.next.next!=null){
            nextSwap = head.next.next;
        }
        ListNode temp = head;
        head = head.next;
        head.next = temp;
        head.next.next = swapPairs(nextSwap);
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        System.out.println(swapPairs(head).value);
    }
}
