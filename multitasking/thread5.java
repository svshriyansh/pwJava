package multitasking;

class Message implements Runnable {
    public void run() {
        try {

            for (int i = 0; i < 3; i++) {
                System.out.println("Hello \n Focus is the key");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("Some error occured");
        }
    }
}

public class thread5 {
    public static void main(String[] args) throws Exception {
        System.out.println("Main thread started");
        Message thread2 = new Message();

        Thread t1 = new Thread(thread2);
        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());
        t1.join();
        System.out.println("Main thread ended");
    }
}
