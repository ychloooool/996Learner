package D_list.TwoWayLinkList;

import D_list.LinkList.LinkList;

import java.util.Iterator;

public class Test {

    public static void main(String[] args) {

        basicTest();

        iterableTest();

    }

    public static void basicTest() {

        LinkList<Integer> list = new LinkList<>();
        list.insert(5);
        list.insert(4);
        list.insert(3);
        list.insert(2);
        list.insert(1);
        System.out.println(list);
        System.out.println(list.length());

        list.insert(2, 10);
        System.out.println(list);
        System.out.println(list.length());

        int element1 = list.get(2);
        int element2 = list.remove(2);
        System.out.println(list);
        System.out.println(list.length());
        System.out.println(element1);
        System.out.println(element2);

        System.out.println(list.indexOf(3));

        System.out.println(list.isEmpty());
        System.out.println(list.length());
        list.clear();
        System.out.println(list.isEmpty());
        System.out.println(list.length());

    }

    public static void iterableTest() {

        LinkList<Integer> list = new LinkList<>();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        System.out.println(list);
        System.out.println(list.length());

        // iterator底层调用
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // iterator在foreach中使用
        for (int i : list) {
            System.out.println(i);
        }

    }

}
