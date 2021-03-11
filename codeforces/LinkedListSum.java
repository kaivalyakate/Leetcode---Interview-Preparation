import java.util.LinkedList;

/**
 * LinkedListSum
 */
public class LinkedListSum {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1, temp2 = l2;
        ListNode temp = null;
        ListNode ansRootNode = temp;
        int carry = 0;
        while (temp1 != null || temp2 != null) {
            if (temp == null) {
                temp = new ListNode((temp1.value + temp2.value) % 10);
                ansRootNode = temp;
            } else {
                if (temp1 == null) {
                    temp1 = new ListNode(0);
                }
                if (temp2 == null) {
                    temp2 = new ListNode(0);
                }
                temp.next = new ListNode((temp1.value + temp2.value + carry) % 10);
                temp = temp.next;
            }
            carry = (temp1.value + temp2.value + carry) / 10;
            temp1 = temp1.next;
            temp2 = temp2.next;
            if (temp1 == null & temp2 == null & carry > 0) {
                temp.next = new ListNode(carry);
                temp = temp.next;
            }
        }
        return ansRootNode;
    }

    public static void main(String[] args) {
        LinkedListImplementation llist = new LinkedListImplementation();
        llist.AddNode(new ListNode(0));
        LinkedListImplementation llistTwo = new LinkedListImplementation();
        llistTwo.AddNode(new ListNode(0));
        LinkedListImplementation ansList = new LinkedListImplementation();
        ansList.AddNode(addTwoNumbers(llist.root, llistTwo.root));
        System.out.println(ansList);
    }
}

class ListNode {
    public int value;
    public ListNode next = null;

    public ListNode(int val) {
        this.value = val;
    }
}

class LinkedListImplementation {

    public ListNode root;

    public void AddNode(ListNode node) {
        if (this.root == null) {
            this.root = node;
        } else {
            ListNode temp = root;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    @Override
    public String toString() {
        ListNode temp = this.root;
        String ans = "";
        while (temp != null) {
            ans += temp.value + " ";
            temp = temp.next;
        }
        return ans;
    }
}
