package D_list.Stack;

import D_list.LinkList.LinkList;

import java.util.Iterator;

public class Stack<T> implements Iterable<T> {

    private class Node {

        public T item;
        public Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }

    }

    private Node head;
    private int size;

    public Stack() {
        this.head = new Node(null, null);
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }
    public int size() {
        return this.size;
    }

    public void push(T t) {
        Node temp = new Node(t, this.head.next);
        this.head.next = temp;
        this.size++;
    }

    public T pop() {
        if (this.isEmpty()) {
            return null;
        }
        Node temp = this.head.next;
        this.head.next = this.head.next.next;
        this.size--;
        return temp.item;
    }

    @Override
    public Iterator<T> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<T> {

        private Node temp;

        public StackIterator() {
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
        for (int i = 0; i < this.size; i++) {
            temp = temp.next;
            sb.append(temp.item);
            if (i != this.size -1) {
                sb.append(", ");
            }
        }
        return "Stack{ top-->" + sb.toString() + "}";
    }

}
