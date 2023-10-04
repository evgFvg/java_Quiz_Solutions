class FibonacciHashMap{
    public int getNumber(int n){
        return recFibonacci(n, new HashMap<>());
    }

    private int recFibonacci(int num, HashMap<Integer, Integer> fibNumbers) {
        if(num < 2){
            return num;
        }
        if(fibNumbers.containsKey(num)){
            return fibNumbers.get(num);
        }
        int res = recFibonacci(num - 1, fibNumbers) + recFibonacci(num - 2, fibNumbers);
        fibNumbers.put(num, res);
        return  res;
    }
}
