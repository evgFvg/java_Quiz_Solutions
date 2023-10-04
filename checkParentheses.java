import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class CountParentheses {

    public static void main(String[] args) {
        CountParentheses cs = new CountParentheses();
        System.out.println(cs.checkParentheses("[()](){[()]()}"));
        System.out.println(cs.checkParentheses("[{}(])"));
    }
    
    private static final HashMap<Character, Character> parentheses = new HashMap<>();
    CountParentheses(){
        parentheses.put('(', ')');
        parentheses.put('{', '}');
        parentheses.put('[', ']');
    }
    private final Deque<Character> deq = new ArrayDeque<>();

    public boolean checkParentheses(String str){
        if(null == str){
            throw new NullPointerException("Null string is not allowed");
        }
        char[] strArr = str.toCharArray();
        for(Character c: strArr){
            if(parentheses.containsKey(c)){
                deq.push(c);
                continue;
            }
            if(parentheses.containsValue(c)){
                Character deletedChar = deq.pop();
                if(!parentheses.get(deletedChar).equals(c)){
                    return false;
                }
            }
        }
        return deq.isEmpty();
    }
}

