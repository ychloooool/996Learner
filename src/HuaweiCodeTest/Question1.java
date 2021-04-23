package HuaweiCodeTest;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Question1 {

    /**
     * todo 问题描述
     *
     */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int orderCount = sc.nextInt();
        int seatCount = sc.nextInt();

        int[] numberCounts = new int[24];

        Queue<Order> queue = new ConcurrentLinkedDeque<>();
        for (int i = 0; i < orderCount; i++) {
            int a = sc.nextInt();
            int l = sc.nextInt();
            int n = sc.nextInt();
            queue.add(new Order(a, l ,n));
            System.out.println("{add " + a + " " + l + " " + n + " }");
        }

        while (!queue.isEmpty()) {
            Order order = queue.remove();
            System.out.println("processing order{" + order.arrive
                    + " " + order.left + " " + order.number + " }");
            int[] tempList = numberCounts.clone();
            boolean accept = true;
            for (int i = order.arrive; i < order.left; i++) {
                if (tempList[i] + order.number > seatCount) {
                    accept = false;
                    break;
                } else {
                    tempList[i] = tempList[i] + order.number;
                }
            }
            if (accept) {
                numberCounts = tempList.clone();
                System.out.print("order accepted, current list is ");
                printArray(numberCounts);
            } else {
                System.out.println("order denied");
            }
        }

        printArray(numberCounts);

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(" ");
            } else {
                System.out.print("\n");
            }
        }
    }

    public static class Order {

        public int arrive;
        public int left;
        public int number;

        public Order(int arrive, int left, int number) {
            this.arrive = arrive;
            this.left = left;
            this.number = number;
        }

    }

}
