import java.util.HashMap;

public class Q11_InnerClass {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int res = c.operate("+", 4,66);
        System.out.println(res);
        res = c.operate("-", 44,5);
        System.out.println(res);
        res = c.operate("*", 44,5);
        System.out.println(res);
        res = c.operate("/", 44,4);
        System.out.println(res);

    }
}

class Calculator {
    private HashMap<String, Operator> mapOperator = new HashMap<String, Operator>();

    public Calculator() {
        Operator sum = (a, b) -> (a + b);
        Operator subtr = new Operator() {

            @Override
            public int operate(int a, int b) {
                return a - b;
            }
        };
        Operator mult = new Mult();
        class Div implements Operator {
            @Override
            public int operate(int a, int b) {
                return a / b;
            }
        }
        addOperator("+", sum);
        addOperator("-", subtr);
        addOperator("*", mult);
        addOperator("/", new Div());
    }

    interface Operator {
        int operate(int a, int b);
    }

    public void addOperator(String key, Operator o) {
        mapOperator.put(key, o);
    }

    public int operate(String key, int a, int b) {
        return mapOperator.get(key).operate(a, b);
    }

    class Mult implements Operator {
        @Override
        public int operate(int a, int b) {
            return a * b;
        }
    }
}

