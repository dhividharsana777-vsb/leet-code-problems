class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Node temp = head;
        while (temp != null) {
            Node node = new Node(temp.val);
            node.next = temp.next;
            temp.next = node;
            temp = node.next;
        }
        temp = head;
        while (temp != null) {
            Node node = temp.next; 
            node.random = temp.random != null ? temp.random.next : null;
            temp = node.next;
        }

        temp = head;
        Node newHead = head.next;
        while (temp != null) {
            Node node = temp.next;
            temp.next = node.next; 
            if (node.next != null) {
                node.next = node.next.next;
            }
        
            temp = temp.next; 
        }
        
        return newHead;
    }
}
