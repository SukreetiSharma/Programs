public class Multilevel_Inheritance {
    public static void main(String args[]) {
        Maruti obj = new Maruti();
        obj.vehicleType();
        obj.brand();
        obj.Speed();
    }
}
    class Vehicle {
        void vehicleType() {
            System.out.println("Vehicle Type: Car");
        }
    }

    class Car extends Vehicle {
        void brand() {
            System.out.println("Brand: Maruti");
        }
    }

    class Maruti extends Car {
        void Speed() {
            System.out.println("Max: 90Kmph");
        }
    }
