package expt8;

class Hello extends Thread {
    public void run() {
        try {
            for(int i = 1; i <= 5; i++) {
                System.out.println("Hello " + i);
                Thread.sleep(2000);
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}