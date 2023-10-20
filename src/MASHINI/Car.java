package MASHINI;

public class Car extends Transport {

    private boolean isRegistered;
    public Engine engine = new Engine();

    public Car(String type, float speed, int weight, String color, int[] coordinate, boolean isRegistered){
        super(type, speed, weight, color, coordinate);
        this.isRegistered = isRegistered;
    }

    public Car(String type, float speed, int weight, String color, int[] coordinate){
        super(type, speed, weight, color, coordinate);
        this.isRegistered = isRegistered;
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }


    public void getRegistered(){
        if (isRegistered)
            System.out.println("Car is Registered");
        else
            System.out.println("Car isn't Registered");
    }
}

