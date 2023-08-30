//This java code is to know about rules for method overriding in child class
package inheretance;

class Animal {
    public Animal() {
        super();
        System.out.println("Hi");
    }

    public void eat() {
        System.out.println("Animal eats food");
    }

    public void age(int x) {
        System.out.println("Animal age is" + x);
    }
}

class Tiger extends Animal {
    // can not degrade the access specfier in child class extended method they can
    // only be updraded
    // private void eat()
    // {
    // System.out.println("Animal eats food");
    // }
    public void eat() {
        System.out.println("Tiger eats flesh");
    }
    /*
     * Return type will be same as the parent method
     * 
     * public int age(int x)
     * {
     * System.out.println("Animal age is"+x);
     * return
     * }
     * 
     * !! below is different concept
     * -> if the parameters are different from parents method it will not be
     * considered method overriding
     * -> it will come under method overloading and will be called specialisez
     * method
     * public int age()
     * {
     * System.out.println("Animal age is"+x);
     * return
     * }
     */
}

public class inheritanceMethodOverriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.age(10);

        // Tiger t = new Tiger();
        // t.age(10);
        // t.eat();

    }

}
