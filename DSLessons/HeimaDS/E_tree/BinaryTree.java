package E_tree;

import D_list.Queue.Queue;

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
        if (node == null) {
            this.size++;
            return new Node(key, value, null, null);
        } else {
            int result = key.compareTo(node.key);
            if (result > 0) {
                node.right = put(node.right, key, value);
            } else if (result < 0) {
                node.left = put(node.left, key, value);
            } else {
                node.value = value;
            }
            return node;
        }
    }

    public Value get(Key key) {
        return get(this.root, key);
    }
    
    private Value get(Node node, Key key) {
        if (node == null) {
            return null;
        } else {
            int result = key.compareTo(node.key);
            if (result > 0) {
                return get(node.right, key);
            } else if (result < 0) {
                return get(node.left, key);
            } else {
                return node.value;
            }
        }
    }
    
    public void delete(Key key) {
        this.root = delete(this.root, key);
    }
    
    private Node delete(Node node, Key key) {
        if (node == null) {
            return null;
        } else {
            int result = key.compareTo(node.key);
            if (result > 0) {
                node.right = delete(node.right, key);
            } else if (result < 0) {
                node.left = delete(node.left, key);
            } else {
                if (node.right == null) {
                    return node.left;
                } else if (node.left == null) {
                    return node.right;
                } else {
                    this.size--;
                    Node temp = node.right;
                    Node previous = null;
                    if (temp.left == null) {
                        temp.left = node.left;
                    } else {
                        while (temp.left != null) {
                            previous = temp;
                            temp = temp.left;
                        }
                        previous.left = temp.right;
                        temp.left = node.left;
                        temp.right = node.right;
                    }
                    return temp;
                }
            }
            return node;
        }
    }

    public void preOrderTraversal() {
        System.out.print("preOrderTraversal: { ");
        preOrderTraversal(this.root);
        System.out.println("}");
    }

    private void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.key + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void inOrderTraversal() {
        System.out.print("inOrderTraversal: { ");
        inOrderTraversal(this.root);
        System.out.println("}");
    }

    private void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.key + " ");
        inOrderTraversal(node.right);
    }

    public void postOrderTraversal() {
        System.out.print("postOrderTraversal: { ");
        postOrderTraversal(this.root);
        System.out.println("}");
    }

    private void postOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.key + " ");
    }

    public void levelOrderTraversal() {
        System.out.print("levelOrderTraversal: { ");
        Queue<Node> queue = new Queue<>();
        queue.enqueue(this.root);
        while (!queue.isEmpty()) {
            Node temp = queue.dequeue();
            System.out.print(temp.key + " ");
            if (temp.left != null) {
                queue.enqueue(temp.left);
            }
            if (temp.right != null) {
                queue.enqueue(temp.right);
            }
        }
        System.out.println("}");
    }

    public Key getMax() {
        Node temp = this.root;
        while (temp.right != null) {
            temp = temp.right;
        }
        return temp.key;
    }

    public Key getMin() {
        Node temp = this.root;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp.key;
    }

    public int depth() {
        return depth(this.root);
    }

    private int depth(Node node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + Math.max(depth(node.left), depth(node.right));
        }
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
