package D_list.SymbolTable;

public class Test {

    public static void main(String[] args) {

        OrderSymbolTable<Integer, String> table = new OrderSymbolTable<>();
//        SymbolTable<Integer, String> table = new SymbolTable<>();

        System.out.println(table);
        table.put(3, "ccc");
        System.out.println(table);
        table.put(2, "bbb");
        System.out.println(table);
        table.put(1, "aaa");
        System.out.println(table);


        table.put(2, "kkk");
        System.out.println(table);

//        for (String s : table) {
//            System.out.println(s);
//        }

        System.out.println(table.get(1));
        System.out.println(table.get(2));
        System.out.println(table.get(3));
        table.delete(1);
        System.out.println(table);
        table.delete(2);
        System.out.println(table);
        table.delete(3);
        System.out.println(table);

    }

}
