import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int[] arr = {34,3,31,98,92,23};
        for(int i = 0; i < arr.length; ++i) {
            st.push(arr[i]);
        }
        SortedStack.sortStack(st);
        for(Integer a: st) {
            System.out.println(a);
        }
    }
}

class SortedStack {
    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> sortedStack = new Stack<>();

        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!sortedStack.isEmpty() && sortedStack.peek() > temp) {
                stack.push(sortedStack.pop());
            }
            sortedStack.push(temp);
        }

        stack.addAll(sortedStack);
    }
}
