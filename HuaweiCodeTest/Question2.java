package HuaweiCodeTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Question2 {

    /**
     * todo 问题描述
     *
     */

    public static void main(String[] args) {

        int score = 10;

        Scanner sc = new Scanner(System.in);
        int modCount = sc.nextInt();
        int depCount = sc.nextInt();

        int[] modUsed = new int[modCount];
        ArrayList<Dependency> depList = new ArrayList<>();

        for (int i = 0; i < depCount; i++) {
            int c = sc.nextInt();
            int p = sc.nextInt();
            modUsed[c] += 1;
            modUsed[p] += 1;
            depList.add(new Dependency(c, p));
        }

        for (int i = 0; i < modCount; i++) {
            if (modUsed[i] == 0) {
                score -= 1;
            }
        }

        if (score < 0) {
            score = 0;
        }
        System.out.println(score);

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

    public static class Dependency {

        public int child;
        public int parent;

        public Dependency(int child, int parent) {
            this.child = child;
            this.parent = parent;
        }

    }

}
