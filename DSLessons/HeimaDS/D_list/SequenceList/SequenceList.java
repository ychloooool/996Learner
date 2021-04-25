package D_list.SequenceList;

import java.util.Iterator;

public class SequenceList<T> implements Iterable<T> {

    private T[] elements;
    private int length;

    public SequenceList() {
        this.elements = (T[]) new Object[10];
        this.length = 0;
    }

    public SequenceList(int capacity) {
        this.elements = (T[]) new Object[capacity];
        this.length = 0;
    }

    public SequenceList(T[] elements) {
        this.elements = elements;
    }

    public void clear() {
        this.elements = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public int length() {
        return this.length;
    }

    public T get(int i) {
        return this.elements[i];
    }

    public void insert(int i, T t) {
        if (this.length == this.elements.length) {
            resize(this.elements.length * 2);
        }
        for (int j = this.length - 1; j >= i; j--) {
            this.elements[j + 1] = this.elements[j];
        }
        this.elements[i] = t;
        this.length++;
    }

    public void insert(T t) {
        if (this.length == this.elements.length) {
            resize(this.elements.length * 2);
        }
        this.elements[this.length++] = t;
    }

    public T remove(int i) {
        T result = this.elements[i];
        for (int j = i; j < this.length - 1; j++) {
            this.elements[j] = this.elements[j + 1];
        }
        this.length--;
        if (this.length == this.elements.length / 4) {
            resize(this.elements.length / 2);
        }
        return result;
    }

    private void resize(int newSize) {
        T[] tempElements = (T[]) new Object[newSize];
        for (int i = 0; i < this.length; i++) {
            tempElements[i] = this.elements[i];
        }
        this.elements = tempElements;
    }

    public int indexOf(T t) {
        for (int i = 0; i < this.length; i++) {
            if (this.elements[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Iterator<T> iterator() {
        return new SequenceListIterator();
    }

    private class SequenceListIterator implements Iterator<T> {

        private int cursor;

        public SequenceListIterator() {
            this.cursor = 0;
        }

        @Override
        public boolean hasNext() {
            return this.cursor != length;
        }

        @Override
        public T next() {
            return elements[cursor++];
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.length; i++) {
            sb.append(this.elements[i]);
            if (i != this.length -1) {
                sb.append(", ");
            }
        }
        return "SequenceList{" + sb.toString() + "}";
    }

}
