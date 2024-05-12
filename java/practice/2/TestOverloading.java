import TestThreads.*;

final class TestOverloading {
    int add(int a, int b) {
        return a + b;
    }

    float add(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        TestOverloading t = new TestOverloading();
        System.out.println("The sum is : " + t.add(2, 8));
        System.out.println("The sum is : " + t.add( 2.57654f, 8.5f));
        TestThread et = new TestThread();
        System.out.println(et.x);
    }
}
