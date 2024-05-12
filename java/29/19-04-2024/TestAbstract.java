abstract class Ab {
    abstract void honda(int a, int b);
    abstract void hyundai();
}

public class TestAbstract extends Ab {
    public void honda(int a, int b) {
        System.out.println("honda" + (a + b));
    }
    public void hyundai() {
        System.out.println("Creta");
    }
    public static void main(String args[]) {
        TestAbstract t = new TestAbstract();
        t.honda(2, 5);
        t.hyundai();

    }
}
