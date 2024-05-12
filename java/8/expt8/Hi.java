package expt8;

class Hi extends Thread {
     public void run() {
        try {
            for(int i = 1; i <= 5; i++) {
            System.out.println("Hi " + i);
            Thread.sleep(1000);
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}