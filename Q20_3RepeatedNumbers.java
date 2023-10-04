import java.util.*;

public class Quiz20 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3};
        printTopThreeRepeatedNumbers(arr);
    }

    public static void printTopThreeRepeatedNumbers(int[] arr) {
        Map<Integer, Element> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                Element elem = map.get(arr[i]);
                elem.count++;
            } else {
                map.put(arr[i], new Element(arr[i], 1, i));
            }
        }

        PriorityQueue<Element> queue = new PriorityQueue<>((a, b) -> {
            if (b.count == a.count) {
                return a.firstIndex - b.firstIndex;
            } else {
                return b.count - a.count;
            }
        });

        // add the numbers in PriorityQueue
        queue.addAll(map.values());

        // get the top three repeated numbers
        List<Integer> topNumbers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println(queue.poll().number);
        }
    }

    private static class Element {
        int number, count, firstIndex;

        Element(int number, int count, int firstIndex) {
            this.number = number;
            this.count = count;
            this.firstIndex = firstIndex;
        }
    }
}
