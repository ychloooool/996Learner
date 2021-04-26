package D_list.LinkList;

public class LinkListReverse {

    public static class Node {

        public int item;
        public Node next;

        public Node(int item, Node next) {
            this.item = item;
            this.next = next;
        }

    }

    public static void reverse(Node head) {
        if (head.next != null) {
            reverseNode(head, head.next);
        }
    }

    public static Node reverseNode(Node head, Node current) {
        if (current.next == null) {
            head.next = current;
            return current;
        } else {
            Node previous = reverseNode(head, current.next);
            previous.next = current;
            current.next = null;
            return current;
        }
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            System.out.print(temp.item + " ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        Node n1 = new Node(5, null);
        Node n2 = new Node(4, n1);
        Node n3 = new Node(3, n2);
        Node n4 = new Node(2, n3);
        Node n5 = new Node(1, n4);
        Node head = new Node(-1, n5);

        printList(head);
        reverse(head);
        printList(head);

    }

}
