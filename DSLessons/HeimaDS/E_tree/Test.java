package E_tree;

public class Test {

    public static void main(String[] args) {
        BinaryTree<Integer, String> tree = new BinaryTree<>();
        tree.put(5, "5");
        tree.put(2, "2");
        tree.put(1, "1");
        tree.put(3, "3");
        tree.put(4, "4");
        tree.put(8, "8");
        tree.put(6, "6");
        tree.put(9, "9");

        System.out.println(tree.get(4));
        System.out.println(tree.getMax());
        System.out.println(tree.getMin());
        System.out.println(tree.depth());

        tree.preOrderTraversal();
        tree.inOrderTraversal();
        tree.postOrderTraversal();
        tree.levelOrderTraversal();

        tree.delete(9);
        tree.preOrderTraversal();
        tree.delete(2);
        tree.preOrderTraversal();



    }

}
