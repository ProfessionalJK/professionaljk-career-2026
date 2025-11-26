class ListNode:
    def __init__(self, val =0, next=None):
        self.val = val
        self.next = next

def has_cycle(head):
    slow = fast = head
    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next
        if slow == fast:
            return True
    return False

if __name__ == "__main__":
    head = ListNode(3)
    n1 = ListNode(2)
    n2 = ListNode(0)
    n3 = ListNode(-4)

    head.next = n1
    n1.next = n2
    n2.next = n3
    n3.next = n1

    print(has_cycle(head))