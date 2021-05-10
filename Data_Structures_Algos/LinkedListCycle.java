public class LinkedListCycle {

    public static LNode DetectCycle(LNode head) {
        LNode fPot = head;
        LNode sPot = head;
        if (head.next.next == null) {
            sPot = head.next;
        } else if (head.next == null) {
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

    public static LNode mergeTwoLists(LNode l1, LNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        LNode temp1 = null;
        if (l1.data <= l2.data) {
            temp1 = l1;
            l1 = l1.next;
        } else {
            temp1 = l2;
            l2 = l2.next;
        }
        LNode head = temp1;
        temp1.next = null;
        while (l1 != null || l2 != null) {
            if ((l1 == null && l2 != null)) {
                while (l2 != null) {
                    temp1.next = l2;
                    l2 = l2.next;
                    temp1 = temp1.next;
                }
            } else if ((l2 == null && l1 != null)) {
                while (l1 != null) {
                    temp1.next = l1;
                    l1 = l1.next;
                    temp1 = temp1.next;
                }
            } else if (l1.data <= l2.data) {
                temp1.next = l1;
                l1 = l1.next;
            } else {
                temp1.next = l2;
                l2 = l2.next;
            }
            temp1 = temp1.next;
        }
        return head;
    }

    public static LNode evenOddList(LNode head){
        LNode oddHead = null;
        LNode evenHead = null;
        LNode o = null, e = null;
        LNode temp = head;
        int i = 0;
        while (temp != null) {
            if (i % 2 == 0) {
                if (oddHead == null) {
                    oddHead = temp;
                    o = oddHead;
                } else {
                    oddHead.next = temp;
                    oddHead = oddHead.next;
                }
            } else {
                if (evenHead == null) {
                    evenHead = temp;
                    e = evenHead;
                } else {
                    evenHead.next = temp;
                    evenHead = evenHead.next;
               }
            }
            temp = temp.next;
            i++;
        }
        LNode temp1 = o;
        while (temp1.next != null) {
            temp1 = temp1.next;
        }
        temp1.next = e;
        return o;
    }

    public static void main(String[] args) {
        LNode newNode = new LNode(1);
        LNode newNode1 = new LNode(2);
        LNode newNode2 = new LNode(3);
        LNode newNode3 = new LNode(4);
        LNode newNode4 = new LNode(5);
        LNode newNode5 = new LNode(6);
        // newNode.setNext(newNode1);
        // newNode1.setNext(newNode2);
        // newNode2.setNext(newNode3);
        // newNode3.setNext(newNode1);
        // LNode ans = DetectCycle(newNode);
        // System.out.println(ans.data);
        LNode head = newNode;
        newNode.next = newNode1;
        newNode1.next = newNode2;
        newNode2.next = newNode3;
        newNode3.next = newNode4;
        newNode4.next = newNode5;
        LNode ans = evenOddList(head);
        while (ans != null) {
            System.out.println(ans.data);
            ans = ans.next;
        }
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
