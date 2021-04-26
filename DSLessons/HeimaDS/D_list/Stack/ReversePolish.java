package D_list.Stack;

public class ReversePolish {

    public static void main(String[] args) {
        String[] notation = {"3", "17", "15", "-", "*", "18", "6", "/", "+"};
        System.out.println(calculate(notation));
    }

    public static int calculate(String[] notation) {
        Stack<String> stack = new Stack<>();
        for (String s : notation) {
            switch (s) {
                case "+": {
                    int latter = Integer.parseInt(stack.pop());
                    int former = Integer.parseInt(stack.pop());
                    stack.push(String.valueOf(former + latter));
                    break;
                }
                case "-": {
                    int latter = Integer.parseInt(stack.pop());
                    int former = Integer.parseInt(stack.pop());
                    stack.push(String.valueOf(former - latter));
                    break;
                }
                case "*": {
                    int latter = Integer.parseInt(stack.pop());
                    int former = Integer.parseInt(stack.pop());
                    stack.push(String.valueOf(former * latter));
                    break;
                }
                case "/": {
                    int latter = Integer.parseInt(stack.pop());
                    int former = Integer.parseInt(stack.pop());
                    stack.push(String.valueOf(former / latter));
                    break;
                }
                default:
                    stack.push(s);
                    break;
            }
        }
        return Integer.parseInt(stack.pop());
    }


}
