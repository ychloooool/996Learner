package HuaweiCodeExam;

import java.util.Scanner;

public class Question3 {

    /**
     * todo 问题描述
     * 2021/4/22
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int maxJump = sc.nextInt();
        int[] eachJumpPrice = new int[maxJump];

        for (int i = 0; i < maxJump; i++) {
            eachJumpPrice[i] = sc.nextInt();
        }
        int nodeNum = sc.nextInt();
        int lineNum = sc.nextInt();
        for (int i = 0; i < lineNum; i++) {
            int parent = sc.nextInt();
            int child = sc.nextInt();
        }
        System.out.println(eachJumpPrice[maxJump - 1]);

    }

}
