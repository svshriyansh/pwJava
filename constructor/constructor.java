package constructor;

class Demo3{

    private int num1;
    private int num2;

    public Demo3()
    {
        num1 = 10;
        num2 = 20;
    }
    public Demo3(int num1,int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    void display()
    {
        System.out.println(num1);
        System.out.println(num2);
    }
}
public class constructor {
    public static void main(String[] args) {
        Demo3 d= new Demo3();
        d.display();
    }
}
