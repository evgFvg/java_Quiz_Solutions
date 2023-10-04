import java.util.ArrayDeque;
import java.util.Deque;

public class StackSort {

    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] arr = {5, 3, 1, 11, 2};
        for (int i : arr) {
            stack.push(i);
        }
        sortStack(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    private static void sortStack(Deque<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int frameElement = stack.pop();
        sortStack(stack);
        insertToStack(stack, frameElement);
    }

    private static void insertToStack(Deque<Integer> stack, int elm) {
        if (stack.isEmpty() || stack.peek() > elm) {
            stack.push(elm);
        } else {
            int frameElement = stack.pop();
            insertToStack(stack, elm);
            stack.push(frameElement);
        }
    }
}

