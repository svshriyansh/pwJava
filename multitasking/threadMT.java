package multitasking;

public class threadMT {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        System.out.println("Before changing");
        String name = Thread.currentThread().getName();
        System.out.println(name);
        int priority = Thread.currentThread().getPriority();
        System.out.println(priority);

        System.out.println("After changing");
        Thread t = Thread.currentThread();
        t.setName("PW");
        t.setPriority(1);
        name = Thread.currentThread().getName();
        System.out.println(name);
        priority = Thread.currentThread().getPriority();
        System.out.println(priority);

    }
}
