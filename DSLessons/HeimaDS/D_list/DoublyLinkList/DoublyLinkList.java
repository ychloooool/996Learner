package D_list.DoublyLinkList;


import D_list.LinkList.LinkList;

import java.util.Iterator;

public class DoublyLinkList<T> implements Iterable<T> {

    private class Node {

        public T item;
        public Node previous;
        public Node next;

        public Node(T item, Node previous, Node next) {
            this.item = item;
            this.previous = previous;
            this.next = next;
        }

    }

    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkList() {
        this.head = new Node(null, null, null);
        this.tail = new Node(null, null, null);
        this.head.next = this.tail;
        this.tail.previous = this.head;
        this.length = 0;
    }

    public void clear() {
        this.head.next = this.tail;
        this.tail.previous = this.head;
        this.length = 0;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public int length() {
        return this.length;
    }

    public T get(int i) {
        Node temp;
        if (2 * (i + 1) > this.length) {
            // from tail
            temp = this.tail;
            for (int j = this.length; j > i; j--) {
                temp = temp.previous;
            }
        } else {
            // from head
            temp = this.head;
            for (int j = -1; j < i; j++) {
                temp = temp.next;
            }
        }
        return temp.item;
    }

    public void insert(T t) {
        Node newNode = new Node(t, this.tail.previous, this.tail);
        this.tail.previous.next = newNode;
        this.tail.previous = newNode;
        this.length++;
    }

    public void insert(int i, T t) {
        Node temp;
        if (2 * (i + 1) > this.length) {
            // from tail
            temp = this.tail;
            for (int j = this.length; j > i; j--) {
                temp = temp.previous;
            }
        } else {
            // from head
            temp = this.head;
            for (int j = -1; j < i; j++) {
                temp = temp.next;
            }
        }
        Node newNode = new Node(t, temp.previous, temp);
        temp.previous.next = newNode;
        temp.previous = newNode;
        this.length++;
    }

    public T remove(int i) {
        Node temp;
        if (2 * (i + 1) > this.length) {
            // from tail
            temp = this.tail;
            for (int j = this.length; j > i; j--) {
                temp = temp.previous;
            }
        } else {
            // from head
            temp = this.head;
            for (int j = -1; j < i; j++) {
                temp = temp.next;
            }
        }
        temp.next.previous = temp.previous;
        temp.previous.next = temp.next;
        this.length--;
        return temp.item;
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

    public T getFirst() {
        if (this.isEmpty()) {
            return null;
        } else {
            return this.head.next.item;
        }
    }

    public T getLast() {
        if (this.isEmpty()) {
            return null;
        } else {
            return this.tail.previous.item;
        }
    }


    @Override
    public Iterator<T> iterator() {
        return new DoublyLinkListIterator();
    }

    private class DoublyLinkListIterator implements Iterator<T> {

        Node temp;

        public DoublyLinkListIterator() {
            this.temp = head;
        }

        @Override
        public boolean hasNext() {
            return this.temp.next != tail;
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
        return "DoublyLinkList{" + sb.toString() + "}";
    }
}
