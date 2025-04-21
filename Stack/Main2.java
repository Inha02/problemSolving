package Stack;
import java.util.ArrayDeque;
import java.util.Stack;

public class Main2 {
    public static String solution (int decimal) {
        Stack<Integer> stack = new Stack<>();

        while (decimal > 0) {
            int a = decimal % 2;
            stack.push(a);
            decimal = decimal / 2;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }
}
