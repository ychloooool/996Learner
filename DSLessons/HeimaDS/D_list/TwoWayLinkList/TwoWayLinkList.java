//package D_list.TwoWayLinkList;
//
//
//import D_list.LinkList.LinkList;
//
//import java.util.Iterator;
//
//public class TwoWayLinkList<T> implements Iterable<T> {
//
//    private class Node {
//
//        public T item;
//        public Node previous;
//        public Node next;
//
//        public Node(T item,Node previous, Node next) {
//            this.item = item;
//            this.previous = previous;
//            this.next = next;
//        }
//
//    }
//
//    private Node head;
//    private Node tail;
//    private int length;
//
//    public TwoWayLinkList() {
//        this.head = new Node(null, null, null);
//        this.tail = new Node(null, null, null);
//        this.head.next = this.tail;
//        this.tail.previous = this.head;
//        this.length = 0;
//    }
//
//    public void clear() {
//        this.head.next = null;
//        this.tail.previous = null;
//        this.length = 0;
//    }
//
//    public boolean isEmpty() {
//        return this.length == 0;
//    }
//
//    public int length() {
//        return this.length;
//    }
//
//    public T get(int i) {
//        Node temp;
//        if (2 * (i + 1) > this.length) {
//            // from tail
//            temp = this.tail;
//            for (int j = this.length; j > i; j--) {
//                temp = temp.previous;
//            }
//        } else {
//            // from head
//            temp = this.head;
//            for (int j = -1; j < i; j++) {
//                temp = temp.next;
//            }
//        }
//        return temp.item;
//    }
//
//    public void insert(T t) {
//        Node newNode = new Node(t, this.tail.previous, this.tail);
//        this.tail.previous.next = newNode;
//        this.tail.previous = newNode;
//        this.length++;
//    }
//
//    public void insert(int i, T t) {
//        if (2 * (i + 1) > this.length) {
//            // from tail
//
//        } else {
//            // from head
//            Node temp = this.head;
//            for (int j = -1; j < i - 1; j++) {
//                temp = temp.next;
//            }
//            Node current = temp.next;
//            temp.next = new Node(t, current);
//            this.length++;
//        }
//    }
//
//    public T remove(int i) {
//        LinkList.Node temp = this.head;
//        for (int j = 0; j <= i - 1; j++) {
//            temp = temp.next;
//        }
//        LinkList.Node current = temp.next;
//        temp.next = current.next;
//        this.length--;
//        return current.item;
//    }
//
//    public int indexOf(T t) {
//        LinkList.Node temp = this.head;
//        for (int i = 0; i < this.length; i++) {
//            temp = temp.next;
//            if (temp.item.equals(t)) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public T getFirst() {
//        // TODO: 2021/4/25
//        return null;
//    }
//
//    public T getLast() {
//        // TODO: 2021/4/25
//        return null;
//    }
//
//
//    @Override
//    public Iterator<T> iterator() {
//        return new TwoWayLinkListIterator();
//    }
//
//    private class TwoWayLinkListIterator implements Iterator<T> {
//
//        @Override
//        public boolean hasNext() {
//            // TODO: 2021/4/25
//            return false;
//        }
//
//        @Override
//        public T next() {
//            // TODO: 2021/4/25
//            return null;
//        }
//
//    }
//
//    @Override
//    public String toString() {
//        // TODO: 2021/4/25
//        return super.toString();
//    }
//}
