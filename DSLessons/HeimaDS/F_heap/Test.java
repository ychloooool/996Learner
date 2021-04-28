package F_heap;

public class Test {

    public static void main(String[] args) {
        Heap<Integer> heap = new Heap<>(20);
        System.out.println(heap);

        heap.insert(20);
        System.out.println(heap);
        heap.insert(15);
        System.out.println(heap);
        heap.insert(2);
        System.out.println(heap);
        heap.insert(14);
        System.out.println(heap);
        heap.insert(10);
        System.out.println(heap);

        for (int i = 0; i < heap.size(); i++) {
            System.out.println(heap.remove());
            System.out.println(heap);
        }

    }

}
