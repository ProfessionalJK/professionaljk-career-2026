class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def merge_list_nodes(list_node_1, list_node_2):
    if list_node_1 is None:
        return list_node_2
    if list_node_2 is None:
        return list_node_1
    merged_list = ListNode (0)
    current = merged_list

    while list_node_1 is not None and list_node_2 is not None:
        if list_node_1.val <= list_node_2.val:
            current.next = list_node_1
            list_node_1 = list_node_1.next
        else:
            current.next = list_node_2
            list_node_2 = list_node_2.next
        current = current.next

    current.next = list_node_1 if list_node_1 is not None else list_node_2
    return merged_list.next

l1 = ListNode(1)
l1.next = ListNode(2)
l1.next.next = ListNode(3)
l2 = ListNode(4)
l2.next = ListNode(5)
l2.next.next = ListNode(6)
result = merge_list_nodes(l1, l2)
while result:
    print(result.val, end=" ")
    result = result.next