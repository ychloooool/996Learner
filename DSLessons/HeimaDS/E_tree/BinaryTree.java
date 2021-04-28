package E_tree;

import java.util.Iterator;

public class BinaryTree<Key extends Comparable<Key>, Value> implements Iterable<Key> {

    private class Node {

        public Key key;
        public Value value;
        public Node left;
        public Node right;

        public Node(Key key, Value value, Node left, Node right) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
        }

    }

    private Node root;
    private int size;

    public BinaryTree() {
        this.root = null;
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public void put(Key key, Value value) {
        this.root = put(this.root, key, value);
    }

    private Node put(Node node, Key key, Value value) {
        // TODO: 2021/4/27
        return null;
    }

    public Value get(Key key) {
        return get(this.root, key);
    }
    
    private Value get(Node node, Key key) {
        // TODO: 2021/4/27  
        return null;
    }
    
    public void delete(Key key) {
        this.root = delete(this.root, key);
    }
    
    private Node delete(Node node, Key key) {
        // TODO: 2021/4/27  
        return null;
    }

    public void preOrderTraversal() {
        preOrderTraversal(this.root);
    }

    private void preOrderTraversal(Node node) {
        // TODO: 2021/4/27
    }

    public void inOrderTraversal() {
        inOrderTraversal(this.root);
    }

    private void inOrderTraversal(Node node) {
        // TODO: 2021/4/27
    }

    public void postOrderTraversal() {
        postOrderTraversal(this.root);
    }

    private void postOrderTraversal(Node node) {
        // TODO: 2021/4/27
    }

    public void levelOrderTraversal() {
        levelOrderTraversal(this.root);
    }

    private void levelOrderTraversal(Node node) {
        // TODO: 2021/4/27
    }

    public Value getMax() {
        return getMax(this.root);
    }

    private Value getMax(Node node) {
        // TODO: 2021/4/27
        return null;
    }

    public Value getMin() {
        return getMin(this.root);
    }

    private Value getMin(Node node) {
        // TODO: 2021/4/27
        return null;
    }


    @Override
    public Iterator<Key> iterator() {
        return new BinaryTreeIterator();
    }

    private class BinaryTreeIterator implements Iterator<Key> {

        public BinaryTreeIterator() {
            // TODO: 2021/4/27  
        }

        @Override
        public boolean hasNext() {
            // TODO: 2021/4/27  
            return false;
        }

        @Override
        public Key next() {
            // TODO: 2021/4/27
            return null;
        }

    }

}
