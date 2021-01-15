class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

    def add(self, head, Node):
        head1 = head
        if head1 == None:
            return Node
        while head1.next != None:
            head1 = head1.next
        head1.next = Node
        return head

    def middleNode(self, head):
        ans = []
        i = 0
        if head.next == None or head == None:
            return head
        while head != None:
            ans.append([head.val, head.next])
            head = head.next
        return ListNode(ans[len(ans)//2][0], ans[len(ans)//2][1])


lt = [1, 49, 91, 83, 63, 8, 11, 75, 99, 95, 90, 45, 64, 96, 18, 46, 36, 29, 65, 55, 53, 3, 97, 45,
      19, 24, 52, 65, 21, 30, 73, 82, 48, 4, 60, 79, 33, 98, 12, 33, 91, 97, 96, 91, 89, 9, 85, 61, 37]
head = ListNode(lt[0])
for i in range(1, len(lt)):
    head = head.add(head, ListNode(lt[i]))
node = head.middleNode(head)
print(node.val)
