package D_list.Stack;

public class BracketMatch {

    public static void main(String[] args) {
        String str1 = "((ych))(yy)";
        String str2 = "((ych(yy))";
        String str3 = "((ych(yy))))))";

        System.out.println(isMatch(str1));
        System.out.println(isMatch(str2));
        System.out.println(isMatch(str3));

    }

    // 括号匹配
    public static boolean isMatch(String line) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                Character temp = stack.pop();
                if (temp == null) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
