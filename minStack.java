import java.util.EmptyStackException;
import java.util.Stack;

public class MinStack{
    public static void main(String[] args) {
        MinStack ms = new MinStack();
        int arr[] = {5,6,3,0,4};
        for(Integer i: arr) {
            ms.push(i);
        }
        int min = ms.getMin();
        System.out.println(min);
        ms.pop();
        ms.pop();
        System.out.println(ms.getMin());
    }
    private static final Stack<Integer> stack = new Stack<>();
    private static final Stack<Integer> minStack = new Stack<>();

    public void push (Integer elm){
        if(null == elm){
            return;
        }
        if(stack.isEmpty()){
            stack.push(elm);
            minStack.push(elm);
            return;
        }
        Integer min = elm < minStack.peek() ? elm : minStack.peek();
        minStack.push(min);
        stack.push(elm);
    }

    public Integer getMin(){
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }
        return minStack.peek();
    }
    public Integer pop(){
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }
        minStack.pop();
        return stack.pop();
    }

}
