package polymorphism;

class Aeroplane{
    public void takeoff(){
        System.out.println("Aeroplane has taken off");
    }
    //overridden method
    public void fly(){
        System.out.println("aeroplane is flying");
    }
}
class CargoPlane extends Aeroplane
{

    //overriding method
    public void fly(){
        System.out.println("CargoPlane fly at low altitude");
    }
    //specialized method - oly present in child class
    public void carry(){
        System.out.println("Cardoplane takes goods");
    }
}

class PassengerPlane extends Aeroplane
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
public class polymorphism {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        Aeroplane ref = new Aeroplane(); // ref -> reference variable

        /* 
        * pp = cp --> cp address can not be given to pp because both have different types of reference
        */ 
        ref = cp; // cp address can be given to ap because cp parent is ap
        /*
         * 
         //!! this is not the proper way to achieve polymorphism as we need to reuse and reduce the code but we have used polymorphism through
         !! method overriding as same method is giving us different output
         ? We will able to achieve polymorphism when we are making the reference of parent for child type object 
         */

         ref.takeoff();
         ref.fly();
        System.out.println("-----------------------------");
        ref = pp;
        ref.takeoff();
        ref.fly();
    }
}
