package D_list.LinkList;

public class Joseph {

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

    public static void main(String[] args) {
        Node head = null;
        Node previous = null;
        for (int i = 1; i <= 41; i++) {
            if (i == 1) {
                head = new Node(1, null);
                previous = head;
            } else {
                Node temp = new Node(i, null);
                previous.next = temp;
                previous = temp;
                if (i == 41) {
                    previous.next = head;
                }
            }
        }
        int remain = 41;
        int count = 0;
        Node temp = head;
        previous = null;
        while (remain != 0) {
            count++;
            if (count == 3) {
                remain--;
                System.out.print(temp.item + " ");
                count = 0;
                previous.next = temp.next;
            } else {
                previous = temp;
            }
            temp = temp.next;
        }
    }

}
