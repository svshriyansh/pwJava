package multitasking;

class Car implements Runnable{
    // synchronising the method
    // synchronized public void run(){
    //     try {
    //         System.out.println(Thread.currentThread().getName()+" Entered the parking lot");
    //         Thread.sleep(2000);
    //         System.out.println(Thread.currentThread().getName()+" Entered the car");
    //         Thread.sleep(2000);
    //         System.out.println(Thread.currentThread().getName()+" Started driving the car");
    //         Thread.sleep(2000);
    //         System.out.println(Thread.currentThread().getName()+" Parked the kar in the parking");
    //         Thread.sleep(2000);
    //     } catch (Exception e) {
    //         System.out.println("Error occured");
    //     }
    //}
        // synchronising the block
        public void run(){
            try {
                System.out.println(Thread.currentThread().getName()+" Entered the parking lot");
                Thread.sleep(2000);
                synchronized(this)
                {
                    System.out.println(Thread.currentThread().getName()+" Entered the car");
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName()+" Started driving the car");
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName()+" Parked the kar in the parking");
                    Thread.sleep(2000);
                }

            } catch (Exception e) {
                System.out.println("Error occured");
            }
        }
}
public class thread7 {
 public static void main(String[] args) {
    Car c = new Car();
    Thread t1 = new Thread(c);
    Thread t2 = new Thread(c);
    Thread t3 = new Thread(c);

    t1.setName("Son1");
    t2.setName("Son2");
    t3.setName("Son3");

    t1.start();
    t2.start();
    t3.start();
 }   
}
