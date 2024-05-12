package practice2;

interface Codes {
    public void FindSumOfNumbers(int number);
}
public class FindSumOfNumbers implements Codes {
    private int sum;
    public void FindSumOfNumbers(int number) {
        int digit;
        int sum = 0;

        while(number != 0) {
            digit = number %10;
            sum += digit;
            number /= 10;
        }
        this.sum = sum;
    }
    // demonstrates the concepts of method overloading
    public void FindSumOfNumbers(float number) {
        float digit;
        float sum = 0;

        whileloop:
        while(number != 0) {
            digit = number %10;
            sum += digit;
            number /= 10;
        }
//        this.sum = sum;
    }
    public static void main(String[] args) {
        FindSumOfNumbers f = new FindSumOfNumbers();
        f.FindSumOfNumbers(462);
        System.out.println(f.sum);
    }
}
