package inheretance;

/*
 * If we had declared clss as a final the we can't extend or inherit in other classes
 final class Animal
 {
     public void eat()
     {
         System.out.println("Animal eats food");
     }
     public void age(int x){
         System.out.println("Animal age is"+x);
     }
 }
 */
class Animal
{   
    final int y = 10;
    final public void eat()
    {
        /*
         * If we had declared final variable then it will act as constant
         y = 9;
         */
        System.out.println("Animal eats food");
    }
    public void age(int x){
        System.out.println("Animal age is"+x);
    }
}
class Tiger extends Animal
{

    /*
     * Final methods can be inhereted but can't be modified
     public void eat()
     {
         System.out.println("Tiger eats flesh");
     }
     */
    public void age(int x){
        System.out.println("Animal age is as low as "+x);
    }

}
class finalK {
    public static void main(String[] args) {
        System.out.println("Hi");
    }
    
}
