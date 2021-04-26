package D_list.LinkList;

public class CircleEntrance {

    public static class Node {

        public int item;
        public Node next;

        public Node(int item, Node next) {
            this.item = item;
            this.next = next;
        }

    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.item + " ");
            temp = temp.next;
        }
        System.out.print("\n");
    }

    /*
        判断链表是否为环装链表
     */
    public static Node getEntrance(Node head) {
        Node slow = head;
        Node fast = head;
        while (true) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        Node temp = head;
        while (true) {
            slow = slow.next;
            temp = temp.next;
            if (slow == temp) {
                return temp;
            }
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(5, null);
        Node n2 = new Node(4, n1);
        Node n3 = new Node(3, n2);
        Node n4 = new Node(2, n3);
        Node n5 = new Node(1, n4);
        n1.next = n3;
        System.out.println(getEntrance(n5).item);
    }

}
