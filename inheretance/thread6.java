package inheretance;
class Example implements Runnable
{
    public void run()
    {
        for(int i =0;i<10;i++){
        try{            
                System.out.println("Focus is the key");
                Thread.sleep(2000);
        }
        catch(InterruptedException e){
            System.out.println("Interrupt occured");
        }
    }
    }
}

public class thread6 {
    public static void main(String[] args) {
        Example m = new Example();
        Thread T = new Thread(m);
        T.start();
        T.interrupt();
    }
}
