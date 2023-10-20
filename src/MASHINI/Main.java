package MASHINI;

public class Main {

    public static void main(String[] args) {
        Car bmw = new Car("Passenger", 250, 2500, "White", new int[] {134, 785, 684}, false);
        Truck truck = new Truck("Cargo", 180 , 9000, "Grey",  new int[] {23789, 8923, 9021}, true);

        truck.setLoaded(true);
        truck.getLoaded();

        bmw.setRegistered(true);
        bmw.getRegistered();

        bmw.engine.setValues(true, 123);
        bmw.engine.info();
        truck.engine.setValues(false, 9000);
        truck.engine.info();


    }
}

