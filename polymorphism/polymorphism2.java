package polymorphism;

class Aeroplane {
    public void takeoff() {
        System.out.println("Aeroplane has taken off");
    }

    // overridden method
    public void fly() {
        System.out.println("aeroplane is flying");
    }
}

class CargoPlane extends Aeroplane {

    // overriding method
    public void fly() {
        System.out.println("CargoPlane fly at low altitude");
    }

    // specialized method - oly present in child class
    public void carry() {
        System.out.println("Cardoplane takes goods");
    }

    public void takeoff() {
        System.out.println("CargoPlane has taken off on big size runway");
    }
}

class PassengerPlane extends Aeroplane {
    // overriding method
    public void fly() {
        System.out.println("PassengerPlane fly at low altitude");
    }

    // specialized method
    public void carry() {
        System.out.println("Passengerplane takes passenger");
    }

    public void takeoff() {
        System.out.println("CargoPlane has taken off on medium size runway");
    }
}

class FighterPlane extends Aeroplane {
    // overriding method
    public void fly() {
        System.out.println("PassengerPlane fly at low altitude");
    }

    // specialized method
    public void carry() {
        System.out.println("Passengerplane takes passenger");
    }

    public void takeoff() {
        System.out.println("CargoPlane has taken off on short size runway");
    }
}

class Airport {
    // to achieve polymorphism when we are making the reference of parent for child
    // type object
    public void Poly(Aeroplane ref) {
        ref.fly();
        ref.takeoff();
        System.out.println("-------------------");
    }
}

public class polymorphism2 {
    public static void main(String[] args) {
        // Aeroplane ap = new Aeroplane(); just for curioucity
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();
        Airport a = new Airport();
        a.Poly(cp);
        a.Poly(pp);
        a.Poly(fp);
        // a.Poly(ap);
    }
}
