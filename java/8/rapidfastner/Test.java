package rapidfastner;

public class Test {
    public static void main(String args[]) {
        try {
            int a[] = {1};
            int b = 0;
            int c = a[1]/b;
            System.out.println("value of c = " + c);
        } catch(ArithmeticException e) {
            System.err.println(e.getMessage());
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Ive reached end");
        }
    }
}