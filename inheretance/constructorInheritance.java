/*
 * Constructor execution in case of inheritance
 */
package inheretance;
interface hello{
    void abc();
}
class Demo1
{
    public Demo1()
    {
        System.out.println("parent class constructor");
    }

    public Demo1(int x, int y)
    {
        System.out.println("parent class paramaterised constructor");
    }
}

class Demo2 extends Demo1
{
    public Demo2()
    {
        this(4,5);
        System.out.println("child class constructor");
    }

    public Demo2(int x, int y)
    {
        //super class will be called by default
        System.out.println("child class paramaterised constructor");
    }
}
public class constructorInheritance {
    public static void main(String[] args) {
        System.out.println("hi");
        
    }
}
