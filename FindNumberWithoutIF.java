public class FindNumberWithoutIF {
    public static void main(String[] args) {
        int[] arr = {2,4,67,-6, 6,10,22};
        System.out.println(isHaveNumber(arr, 777));
    }

    public static boolean isHaveNumber(int[] arr, int target){
        int xorSum = 1;
        for(Integer elm: arr){
            xorSum *= (target ^ elm);
        }
        return xorSum == 0;
    }
}
