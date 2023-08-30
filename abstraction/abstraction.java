package abstraction;

/*
 ! if all the methods of abstract class are abstract then we call it 100% abstraction
 */
abstract class Aeroplane3{
    /*
     ! We cann't make abstract variable and constructor { reason for constructor :- Because by default 
     ! constructor have super() method thus it will contain body but abstract method don't have any body in it}
     abstract int age;
     abstract public Aeroplane3()
     */
    abstract public void takeoff();
    //overridden method
    abstract public void fly();
    /*
     * If we have a concreate method or non-astract method in abstract class with abstract method then we have not 
     * achieved 100% abstraction
     */
    public void landing(){
        System.out.println("Landing");
    };

}
class CargoPlane extends Aeroplane3
{

    //overriding method
    public void fly(){
        System.out.println("CargoPlane fly at low altitude");
    }
    //specialized method - oly present in child class
    public void carry(){
        System.out.println("Cardoplane takes goods");
    }
    public void takeoff(){
        System.out.println("CargoPlane has taken off on big size runway");
    }
}

class PassengerPlane extends Aeroplane3
{
    //overriding method

    public void fly(){
        System.out.println("PassengerPlane fly at low altitude");
    }
    //specialized method 
    public void carry(){
        System.out.println("Passengerplane takes passenger");
    }
    public void takeoff(){
        System.out.println("CargoPlane has taken off on medium size runway");
    }
}

class FighterPlane extends Aeroplane3
{
    //overriding method
    public void fly(){
        System.out.println("PassengerPlane fly at low altitude");
    }
    //specialized method 
    public void carry(){
        System.out.println("Fighterplane takes missiles");
    }
    public void takeoff(){
        System.out.println("CargoPlane has taken off on short size runway");
    }
}


public class abstraction {
    public static void main(String[] args) {
        // ?abstract class object cannot be made
        // Aeroplane3 ref = new Aeroplane3();

        Aeroplane3 cp = new CargoPlane();
        Aeroplane3 pp = new PassengerPlane();
        Aeroplane3 fp = new FighterPlane();
        /*
         !We can  not access child class methods with parent type reference 
         ! if we want to access it we need to down cast the reference object
         fp.carry()
         */
        ((FighterPlane) fp).carry();
        cp.fly();
        pp.fly();
        fp.fly();
        fp.landing();

    }
}
