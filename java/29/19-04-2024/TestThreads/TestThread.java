package TestThreads;

class pHello implements Runnable {
    public void run() {
        for(int i = 10; i > 0; i--) {
            System.out.println("Hello " + i);
        }
    }
}
class pHi implements Runnable {
    public void run() {
        for(int i = 10; i > 0; i--) {
            System.out.println("hiiii " + i);
        }
    }
}

public class TestThread {
    public static void main(String[] args) {
        pHello hello = new pHello();
        pHi hi = new pHi();
        Thread obj = new Thread(hello);
        Thread obj2 = new Thread(hi);

        obj.start();
        obj2.start();
    }
}