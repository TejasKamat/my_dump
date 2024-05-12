class A {
    void displayA() {
        System.out.println("A");
    }
}
class B {
    void displayB() {
        System.out.println("B");
    }
}
class C {
    void displayC() {
        System.out.println("C");
    }
}
public class Multi {
    public static void Main() {
        A a = new A();
        B b = new B();
        C c = new C();
        a.displayA();
        b.displayB();
        c.displayC();
    }
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        C c = new C();
        a.displayA();
        b.displayB();
        c.displayC();
        Multi m = new Multi();
        m.Main();
}
