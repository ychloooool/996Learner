package D_list.LinkedList;

public class LinkedList {


    private class Node<T> {

        public T item;
        public Node<T> next;

        public Node(T item, Node<T> next) {
            this.item = item;
            this.next = next;
        }

    }

}
