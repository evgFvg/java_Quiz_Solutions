public class QuizString {
    public static void main(String[] args) throws ClassNotFoundException {
        MyString.printReversed("Hello");
        System.out.println(MyString.isPalindrome("1221"));
        System.out.println(MyString.isPalindrome("123351"));
        MyString.printPermutations("ABC");

    }
}

class MyString {
    public static void printReversed(String str) {
        // String reversed = new StringBuilder(str).reverse().toString(); best way

        char[] arrStr = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            Swap(arrStr, left, right);
            ++left;
            --right;
        }

        System.out.println(String.valueOf(arrStr));
    }

    private static void Swap(char[] arr, int left, int right) {
        char tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }

    public static boolean isPalindrome(String str) {
        char[] arrStr = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (arrStr[left] != arrStr[right]) {
                return false;
            }
            ++left;
            --right;
        }
        return true;
    }

    public static void printPermutations(String str) {
        printRec(str.toCharArray(), 0, str.length() - 1);
    }

    private static void printRec(char[] str, int left, int right) {
        if (left == right) {
            System.out.println(String.valueOf(str));
        } else {
            for (int i = left; i <= right; ++i) {
                Swap(str, left, i);
                printRec(str, left + 1, right);
                Swap(str, left, i);
            }
        }
    }
}


