public class LinkedListCycle {

    public static LNode DetectCycle(LNode head) {
        LNode fPot = head;
        LNode sPot = head;
        if(head.next.next==null){
            sPot = head.next;
        } else if(head.next==null){
            return null;
        } else {
            sPot = head.next.next;
        }
        while (fPot != null && sPot != null) {
            if (fPot.data == sPot.data) {
                return sPot;
            }
            fPot = fPot.next;
            sPot = sPot.next.next;
        }
        return null;
    }

    public static void main(String[] args) {
        LNode newNode = new LNode(1);
        LNode newNode1 = new LNode(2);
        LNode newNode2 = new LNode(0);
        LNode newNode3 = new LNode(-4);
        LNode newNode4 = new LNode(2);
        newNode.setNext(newNode1);
        newNode1.setNext(newNode2);
        newNode2.setNext(newNode3);
        newNode3.setNext(newNode1);
        LNode ans = DetectCycle(newNode);
        System.out.println(ans.data);
    }
}

class LNode {
    int data;
    LNode next;

    LNode(int data) {
        this.data = data;
    }

    public void setNext(LNode next) {
        this.next = next;
    }
}
