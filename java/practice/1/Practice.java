public class Practice {
    public long calculateFactorial(int number) {
        long factorial = 1;
        for(int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

}