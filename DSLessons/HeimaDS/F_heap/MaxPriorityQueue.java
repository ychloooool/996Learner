package F_heap;

import java.util.Iterator;

public class MaxPriorityQueue<T extends Comparable<T>> implements Iterable<T> {

    private T[] items;
    private int size;

    public MaxPriorityQueue(int capacity) {
        this.items = (T[]) new Comparable[capacity];
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void insert(T t) {
        this.items[++this.size] = t;
        int index = this.size;
        while (index > 1) {
            if (this.items[index].compareTo(this.items[index/2]) <= 0){
                break;
            } else {
                T temp = this.items[index];
                this.items[index] = this.items[index / 2];
                this.items[index / 2] = temp;
                index = index / 2;
            }
        }
    }

    public T remove() {
        T item = this.items[1];
        this.items[1] = this.items[this.size--];
        int index = 1;
        while (2 * index <= this.size) {
            int maxIndex;
            if (2 * index + 1 > this.size || this.items[2 * index].compareTo(this.items[2 * index + 1]) >= 0) {
                maxIndex = 2 * index;
            } else {
                maxIndex = 2 * index + 1;
            }
            if (this.items[index].compareTo(this.items[maxIndex]) >= 0) {
                break;
            } else {
                T temp = this.items[index];
                this.items[index] = this.items[maxIndex];
                this.items[maxIndex] = temp;
                index = maxIndex;
            }
        }
        return item;
    }

    @Override
    public Iterator<T> iterator() {
        return new HeapIterator();
    }

    private class HeapIterator implements Iterator<T> {

        private int cursor;

        public HeapIterator() {
            this.cursor = 1;
        }

        @Override
        public boolean hasNext() {
            return this.cursor != size;
        }

        @Override
        public T next() {
            return items[this.cursor];
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= this.size; i++) {
            sb.append(this.items[i]);
            if (i != this.size) {
                sb.append(", ");
            }
        }
        return "Heap{" + sb.toString() + "}";
    }
}
