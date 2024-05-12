class Animal {
    void eat() {
        System.out.println("Animal is eating ");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}
class Labdor extends Dog {
    void colors() {
        System.out.println("Labdor is golden");
    }
}
public class MLI {
    public static void main(String args[]) {
        Labdor labdor = new Labdor();
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        labdor.colors();
    }
}
