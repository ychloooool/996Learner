package G_disjointSet;

import java.util.Scanner;

public class TrafficProject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入城市的个数：");
        int cityNum = sc.nextInt();
        DisjointSetAdvanced set = new DisjointSetAdvanced(cityNum);
        System.out.print("请输入已修建道路的条数：");
        int roadNum = sc.nextInt();
        for (int i = 0; i < roadNum; i++) {
            System.out.print("已修建道路 " + (i + 1) + " 的两端城市：");
            int city1 = sc.nextInt();
            int city2 = sc.nextInt();
            set.union(city1, city2);
        }
        System.out.println("结论：仍需至少修建 " + set.count() + " 条道路");
    }

}
