interface Animals {
    public void Cat();
    public void Dog();
}
class Pig implements Animals {
    public void Cat() {
        System.out.println("Im a cat ");
    }
    public void Dog() {
        System.out.println("Im a dog");
    }
    public static void main(String args[]) {
        Pig p = new Pig();
        p.Cat();
        p.Dog();
    }
}