class Animal {
    private void sound() {
        System.out.println("This animal creates sounds");
    }
}

public class TestOverriding extends Animal {
    public void sound() {
        System.out.println("hello this is from test and this animal creates sounds");
    }

    public static void main(String args[]) {
        TestOverriding t = new TestOverriding();
        t.sound();
        t.sound();
        t.sound();
    }
}