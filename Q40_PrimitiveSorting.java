class BSTToList {
    public static void main(String[] args) {
        int[] arr = {9,4,10,3,5,1};
//        insertionSort(arr);
//        bubbleSort(arr);
//        selectionSort(arr);
        for(int t: arr) {
            System.out.println(t);
        }
    }

    public static void insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; ++i) {
            int elm = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > elm) {
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = elm;
        }
    }

    public static void bubbleSort(int[] arr){
        boolean sorted = false;
        for(int i = 0; i < arr.length - 1 && !sorted; ++i) {
            sorted = true;
            for(int j = 0; j < arr.length - i - 1; ++j) {
                if(arr[j] > arr[j + 1]){
                    swap(arr, j, j + 1);
                    sorted = false;
                }
            }
        }
    }

    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; ++i) {
            int minIndex = i;
            for(int j = i + 1; j < arr.length; ++j){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(arr, minIndex, i);
        }
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}


