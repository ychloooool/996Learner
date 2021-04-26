package D_list.LinkList;

public class FastSlow {

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
        获取中间值：通过快慢指针的方法解决
     */
    private static int getMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.item;
    }

    public static void main(String[] args) {
//        Node n0 = new Node(6, null);
        Node n1 = new Node(5, null);
        Node n2 = new Node(4, n1);
        Node n3 = new Node(3, n2);
        Node n4 = new Node(2, n3);
        Node n5 = new Node(1, n4);

        printList(n5);

        System.out.println(getMid(n5));

    }

}
