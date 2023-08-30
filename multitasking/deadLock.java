package multitasking;

class Library implements Runnable{
    String res1 = "DSA";
    String res2 = "Java";
    String res3 = "CS";

    public void run()
    {
        if(Thread.currentThread().getName().equals("Student1")){
            try {
                Thread.sleep(3000);
                synchronized(res1){
                    System.out.println("Student1 has accquired "+res1);
                    Thread.sleep(3000);
                    synchronized(res2){
                        System.out.println("Student1 has accquired "+res2);
                        Thread.sleep(3000);
                        synchronized(res3){
                            System.out.println("Student1 has accquired "+res3);
                        }
                    }
                }

            } catch (Exception e) {
                System.out.println("Some error occured");
            }
        }
        else{
            try {
                Thread.sleep(3000);
                synchronized(res3){
                    System.out.println("Student2 has accquired "+res3);
                    Thread.sleep(3000);
                    synchronized(res2){
                        System.out.println("Student2 has accquired "+res2);
                        Thread.sleep(3000);
                        synchronized(res1){
                            System.out.println("Student2 has accquired "+res1);
                        }
                    }
                }

            } catch (Exception e) {
                System.out.println("Some error occured");
            }
        }
    }
}
public class deadLock {
    public static void main(String[] args) {
        Library lib1 = new Library();
        // Library lib2 = new Library();
        Thread t1 = new Thread(lib1);
        // Thread t2 = new Thread(lib2);

        t1.setName("Student1");
        // t2.setName("Student2");
        System.out.println(t1.isDaemon());

        t1.start();
        // t2.start();
        // Thread t = Thread.currentThread();
        // //main
        // System.out.println(t.currentThread().getName());
    }
}
