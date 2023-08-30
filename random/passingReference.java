package random;

class Queue{
    int x;
    boolean flag = false;
    synchronized public void put(int j){
        try{
            if(flag == true)
            {
                wait();
            }
            else{
                x=j;
                System.out.println("I have produced value x "+x);
                flag = true;
                notify();

            }
        }catch (Exception e) {
            System.out.println("Something went wrong");
        }
        
    }
    synchronized public void get(){
        try{
            if (flag == false) {
                wait();
            } else {
                
                System.out.println("I have consume value "+x);
                flag = false;
                notify();
            }
        }catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}


class Producer extends Thread{
    Queue q;
    int i = 1;
    Producer(Queue a){
        q = a;
    }
    public void run(){
        while(true){
        q.put(i++);
        }
    }
    public void he(){
        System.out.println("hi");
    }
}
class Consumer extends Thread{
    Queue q;
    Consumer(Queue a){
        q = a;
    }
    public void run(){
        while(true){
        q.get();
        }
    }
}

public class passingReference {
    public static void main(String[] args) {
        Queue q = new Queue();

        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        p.start();
        c.start();


    }
}
