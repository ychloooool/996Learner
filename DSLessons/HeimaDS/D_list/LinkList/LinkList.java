package D_list.LinkList;

import java.util.Iterator;

public class LinkList<T> implements Iterable<T>{

    private class Node {

        public T item;
        public Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }

    }

    private Node head;
    private int length;

    public LinkList() {
        this.head = new Node(null, null);
        this.length = 0;
    }

    public void clear() {
        this.head.next = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public int length() {
        return this.length;
    }

    public T get(int i) {
        Node temp = this.head;
        for (int j = 0; j <= i; j++) {
            temp = temp.next;
        }
        return temp.item;
    }

    public void insert(T t) {
        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(t, null);
        this.length++;
    }

    public void insert(int i, T t) {
        Node temp = this.head;
        for (int j = 0; j <= i - 1; j++) {
            temp = temp.next;
        }
        Node current = temp.next;
        temp.next = new Node(t, current);
        this.length++;
    }

    public T remove(int i) {
        Node temp = this.head;
        for (int j = 0; j <= i - 1; j++) {
            temp = temp.next;
        }
        Node current = temp.next;
        temp.next = current.next;
        this.length--;
        return current.item;
    }

    public int indexOf(T t) {
        Node temp = this.head;
        for (int i = 0; i < this.length; i++) {
            temp = temp.next;
            if (temp.item.equals(t)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkListIterator();
    }

    private class LinkListIterator implements Iterator<T> {

        private Node temp;

        public LinkListIterator() {
            this.temp = head;
        }

        @Override
        public boolean hasNext() {
            return this.temp.next != null;
        }

        @Override
        public T next() {
            this.temp = this.temp.next;
            return this.temp.item;
        }

    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node temp = this.head;
        for (int i = 0; i < this.length; i++) {
            temp = temp.next;
            sb.append(temp.item);
            if (i != this.length -1) {
                sb.append(", ");
            }
        }
        return "LinkList{" + sb.toString() + "}";
    }

}
