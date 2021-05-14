package G_disjointSet;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        DisjointSetAdvanced set = new DisjointSetAdvanced(5);
//        DisjointSet set = new DisjointSet(5);
//        DisjointSetTree set = new DisjointSetTree(5);
        System.out.println("默认情况下，并查集中有 "+set.count()+" 个分组");
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(count != 10) {
            System.out.println("请输入第一个要合并的元素：");
            int p = sc.nextInt();
            System.out.println("请输入第二个要合并的元素：");
            int q = sc.nextInt();
            if (set.connected(p,q)){
                System.out.println(p+"元素和"+q+"元素已经在同一个组中了");
                continue;
            }
            set.union(p,q);
            System.out.println("当前并查集中还有 "+set.count()+" 个分组");
            count++;
        }
    }

}
