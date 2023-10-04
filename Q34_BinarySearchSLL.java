import java.util.*;

public class BinarySearchSLL {

    public static void main(String[] args) {
        List<Integer> sll = new LinkedList<>();
        List<Integer> arList = new ArrayList<>();

        fillList(sll);
        fillList(arList);

        Optional<Integer> sllIndex = BinarySearchSLL.binarySearch(sll, 2);
        Optional<Integer> arListIndex  = BinarySearchSLL.binarySearch(sll, 9);
        Optional<Integer> notExist = BinarySearchSLL.binarySearch(sll, 20);

        printIndex(sllIndex);
        printIndex(arListIndex);
        printIndex(notExist);

    }

    private static void printIndex(Optional<Integer> opt) {
        opt.ifPresentOrElse(
                index -> System.out.println("target index is " + index),
                () -> System.out.println("target was not found"));
    }

    private static void fillList(List<Integer> sll) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : arr) {
            sll.add(i);
        }
    }


    private static Optional<Integer> binarySearch(List<Integer> sll, int target) {
        return sll instanceof RandomAccess
                ? binSearchRandomAccess(sll, target)
                : iterativeBinarySearch(sll, target);
    }

    private static Optional<Integer> binSearchRandomAccess(List<Integer> sll, Integer target) {
        return binarySearchRec(sll, target, 0, sll.size() - 1);
    }

    private static Optional<Integer> iterativeBinarySearch(List<Integer> sll, Integer target) {
        int index = sll.indexOf(target);
        return index < 0 ? Optional.empty() : Optional.of(index);
    }


    private static Optional<Integer> binarySearchRec(List<Integer> sll, int target, int from, int to) {
        if (from <= to) {
            int mid = from + (to - from) / 2;
            int possibleTarget = sll.get(mid);
            if (possibleTarget == target) {
                return Optional.of(mid);
            } else if (target > possibleTarget) {
                return binarySearchRec(sll, target, mid + 1, to);
            } else {
                return binarySearchRec(sll, target, from, mid - 1);
            }
        }
        return Optional.empty();
    }
}
