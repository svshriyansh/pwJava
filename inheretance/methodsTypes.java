package inheretance;
class Areoplane{
    public void takeoff(){
        System.out.println("Aeroplane has taken off");
    }
    //overridden method
    public void fly(){
        System.out.println("aeroplane is flying");
    }
}
class CargoPlane extends Areoplane
{
    /*
     * Inherited methods - the methods which are extended from the parent class and been used directly
     */
    //overriding method
    public void fly(){
        System.out.println("CargoPlane fly at low altitude");
    }
    //specialized method - oly present in child class
    public void carry(){
        System.out.println("Cardoplane takes goods");
    }
}

class PassengerPlane extends Areoplane
{
    //overriding method
    public void fly(){
        System.out.println("PassengerPlane fly at low altitude");
    }
    //specialized method 
    public void carry(){
        System.out.println("Passengerplane takes passenger");
    }
}
public class methodsTypes {
 public static void main(String[] args) {
    CargoPlane cp = new CargoPlane();
    PassengerPlane pc = new PassengerPlane();
    cp.takeoff();
    cp.fly();
    cp.carry();
    pc.takeoff();
    pc.fly();;
    pc.carry();
 }   
}
