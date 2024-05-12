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
class count extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                Thread.sleep(1);
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
public class TestThread {
    public int x = 4999;
    public static void main(String[] args) {
        pHello hello = new pHello();
        pHi hi = new pHi();
        Thread obj = new Thread(hello);
        Thread obj2 = new Thread(hi);

        obj.start();
        obj2.start();
        count c = new count();
        c.start();
    }
}