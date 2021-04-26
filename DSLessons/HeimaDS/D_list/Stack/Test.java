package D_list.Stack;

public class Test {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        System.out.println(stack);
        stack.push("aaa");
        System.out.println(stack);
        stack.push("bbb");
        System.out.println(stack);
        stack.push("ccc");
        System.out.println(stack);

        for (String s : stack) {
            System.out.println(s);
        }

        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);


    }

}
