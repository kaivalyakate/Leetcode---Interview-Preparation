import java.util.LinkedList;

/**
 * LinkedListSum
 */
public class LinkedListSum {

    

    public static void main(String[] args) {
        LinkedListImplementation llist = new LinkedListImplementation();
        llist.AddNode(new ListNode(2));
        llist.AddNode(new ListNode(4));
        llist.AddNode(new ListNode(3));
        LinkedListImplementation llistTwo = new LinkedListImplementation();
        llistTwo.AddNode(new ListNode(5));
        llistTwo.AddNode(new ListNode(6));
        llistTwo.AddNode(new ListNode(4));
        System.out.println(llist);
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
