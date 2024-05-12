interface Cars {
    public void suzuki();
    public void hyundai();
    public void honda();
    public void skoda();
}
public class TestInterface implements Cars {
    @Override
    public void suzuki() {
        System.out.println("Im suzuki");
    }
    @Override
    public void hyundai() {
        System.out.println("Im hyundai");
    }
    @Override
    public void honda() {
        System.out.println("Im honda");
    }
    @Override
    public void skoda() {
        System.out.println("Im skoda");
    }
    public static void main(String args[]) {
        TestInterface t = new TestInterface();
//        t.honda();
//        t.skoda();
//        t.suzuki();
//        t.hyundai();
        System.out.println("Hello world");
    }
}
