package AlibabaCodeExam;

import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {

    /**
     * todo 问题描述
     * 2021/4/23
     *
     *
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();

        ArrayList<int[]> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int[] row = new int[m];
            for (int j = 0; j < m; j++) {
                row[j] = sc.nextInt();
            }
//            printArray(row);
            list.add(row);
        }

//        int max =

        for (int i = 0; i < q; i++) {
            int k = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            int[] row = list.get(k);
            if (row[j] == 0) {
                row[j] = 1;
            } else {
                row[j] = 0;
            }
            list.set(k, row);
//            System.out.print("current row:");
//            printArray(row);
            int max = 0;
            for (int l = 0; l < list.size(); l++) {
                int count = countOne(row);
                if (count > max) {
                    max = count;
                }
            }
            System.out.println(max);
        }

    }

    public static int countOne(int[] array) {
        ArrayList<Integer> counts = new ArrayList<>();
        boolean flag = false;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
//            System.out.println("____");
//            System.out.println("cur flag" + flag);
            if (array[i] == 1) {
                if (flag == false) {
                    flag = true;
                }
                count += 1;
            } else {
                if (flag == true) {
                    counts.add(count);
                    count = 0;
                    flag = false;
                }
            }
//            System.out.println("cur element" + array[i]);
//            System.out.println("cur count" + count);
//            System.out.println("next flag" + flag);
//            System.out.println("____");
        }
        if (flag == true) {
            counts.add(count);
        }
//        System.out.println(counts);
        return maxCount(counts);
    }

    public static int maxCount(ArrayList<Integer> counts) {
        int max = 0;
        for (int i = 0; i < counts.size(); i++) {
            Integer count = counts.get(i);
            if (count > max) {
                max = count;
            }
        }
        return max;
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

}










