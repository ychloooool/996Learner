package D_list.Queue;

import java.util.Iterator;

public class Queue<T> implements Iterable<T>{

    private class Node {

        public T item;
        public Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }

    }

    private Node head;
    private Node tail;
    private int size;

    public Queue() {
        this.head = new Node(null, null);
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public void enqueue(T t) {
        Node node = new Node(t, null);
        if (this.isEmpty()) {
            this.tail = node;
        } else {
            node.next = this.head.next;
        }
        this.head.next = node;
        this.size++;
    }

    public T dequeue() {
        if (this.isEmpty()) {
            return null;
        } else {
            Node last = this.tail;
            Node temp = this.head;
            for (int i = 0; i < this.size - 1; i++) {
                temp = temp.next;
            }
            temp.next = null;
            this.size--;
            if (this.isEmpty()) {
                this.tail = null;
            } else {
                this.tail = temp;
            }
            return last.item;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator<T> {

        private Node temp;

        public QueueIterator() {
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

    // -1 0 1 2 size=3

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node temp = this.head;
        for (int i = 0; i < this.size; i++) {
            temp = temp.next;
            sb.append(temp.item);
            if (i != this.size -1) {
                sb.append(", ");
            }
        }
        return "Queue{ head-->" + sb.toString() + "-->tail }";
    }
}
