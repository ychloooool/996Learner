package D_list.Queue;

public class Test {

    public static void main(String[] args) {

        Queue<String> queue = new Queue<>();

        System.out.println(queue);
        queue.enqueue("aaa");
        System.out.println(queue);
        queue.enqueue("bbb");
        System.out.println(queue);
        queue.enqueue("ccc");
        System.out.println(queue);

        for (String s : queue) {
            System.out.println(s);
        }

        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);


    }

}
