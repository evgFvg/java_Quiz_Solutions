public class Solution {
    public static void main(String[] args) {
        printPermutations("ABC");
    }
    public static void printPermutations(String str) {
        if (null == str) {
            return;
        }
        permutationsRec(str.toCharArray(), 0);
    }

    private static void permutationsRec(char[] strArr, int left) {
        if (left == strArr.length - 1) {
            System.out.println(new String(strArr));
        }
        for (int i = left; i < strArr.length; ++i) {
            swap(strArr, left, i);
            permutationsRec(strArr, left + 1);
            swap(strArr, left, i);
        }
    }

    private static void swap(char[] strArr, int i, int j) {
        char temp = strArr[i];
        strArr[i] = strArr[j];
        strArr[j] = temp;
    }
}

