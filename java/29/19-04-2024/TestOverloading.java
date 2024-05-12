final class TestOverloading {
    final int add(int a, int b) {
        return a+b;
    }
    public float add(float a, float b) {
        return a+b;
    }
    public static void main(String args[]) {
        TestOverloading t = new TestOverloading();
        System.out.println("The sum is : " + t.add(2, 8));
        System.out.println("The sum is : " + t.add((float)2.57654, (float)8.5));
    }
}