package D_list.SymbolTable;

import D_list.LinkList.LinkList;

import java.util.Iterator;

public class SymbolTable<Key, Value> implements Iterable<Key> {

    private class Node {

        public Key key;
        public Value value;
        public Node next;

        public Node(Key key, Value value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private int size;

    public SymbolTable() {
        this.head = new Node(null, null, null);
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public Value get(Key key) {
        Node temp = this.head;
        for (int i = 0; i < this.size; i++) {
            temp = temp.next;
            if (temp.key.equals(key)) {
                return temp.value;
            }
        }
        return null;
    }

    public void put(Key key, Value value) {
        Node temp = this.head;
        for (int i = 0; i < this.size; i++) {
            temp = temp.next;
            if (temp.key.equals(key)) {
                temp.value = value;
                return;
            }
        }
        temp.next = new Node(key, value, null);
        this.size++;
    }

    public void delete(Key key) {
        Node temp = this.head;
        Node previous = null;
        for (int i = 0; i < this.size; i++) {
            previous = temp;
            temp = temp.next;
            if (temp.key.equals(key)) {
                previous.next = temp.next;
                this.size--;
            }
        }
    }

    @Override
    public Iterator<Key> iterator() {
        return new SymbolTableIterator();
    }

    private class SymbolTableIterator implements Iterator<Key> {

        private Node temp;

        public SymbolTableIterator() {
            this.temp = head;
        }

        @Override
        public boolean hasNext() {
            // TODO: 2021/4/26
            return false;
        }

        @Override
        public Key next() {
            // TODO: 2021/4/26
            return null;
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node temp = this.head;
        for (int i = 0; i < this.size; i++) {
            temp = temp.next;
            sb.append("[").append(temp.key).append(":").append(temp.value).append("]");
            if (i != this.size -1) {
                sb.append(", ");
            }
        }
        return "SymbolTable{" + sb.toString() + "}";
    }
}
