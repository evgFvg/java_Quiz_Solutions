import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int[] arr = {34,3,31,98,92,23};
        for(int i = 0; i < arr.length; ++i) {
            st.push(arr[i]);
        }
        SortedStack.sortStackAscending(st);
        for(Integer a: st) {
            System.out.println(a);
        }
    }
}

class SortedStack {
    public static void sortStackAscending(Stack<Integer> stackToSort) {
        Stack<Integer> aux = new Stack<>();
        Integer curr ;
        while(!stackToSort.empty()) {
            curr = stackToSort.peek();
            stackToSort.pop();
            insertToAux(aux, curr);
        }

        stackToSort.addAll(aux);
    }

    private static void insertToAux(Stack<Integer> aux, Integer data) {
        Integer curr;
        if(aux.empty()) {
            aux.push(data);
            return;
        }
        if(Integer.compare(data, aux.peek()) > 0) {
            aux.push(data);
        }
        else {
            curr = aux.peek();
            aux.pop();
            insertToAux(aux, data);
            aux.push(curr);
        }
    }
}
