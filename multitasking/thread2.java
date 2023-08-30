package multitasking;

class Thread23 extends Object
{
    public void hello()
    {
        System.out.println("123");
    }
}
class Mythread extends Thread
{
    public void run()
    {
        System.out.println("Child thread");
    }
}
public class thread2 {
    public static void main(String[] args) {
        System.out.println("Main thread");
        Mythread t = new Mythread();
        // it will invoke the run method by Thread Scheduler as start method will regester the thread in it.
        t.start();
    }
}
