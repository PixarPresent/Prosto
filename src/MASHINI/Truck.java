package MASHINI;

public class Truck extends Transport{

    private boolean isLoaded;
    public Engine engine = new Engine();



    public Truck(String type, int speed, int weight, String color, int[] coordinate, boolean isLoaded){
        super(type, speed, weight, color, coordinate);
        this.isLoaded = isLoaded;
    }


    public Truck(int weight, int[] coordinate, boolean isLoaded){
        super(weight, coordinate);
        this.isLoaded = isLoaded;
    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }

    public void getLoaded(){
        if (isLoaded)
            System.out.println("Truck is loaded");
        else
            System.out.println("Truck isn't loaded");
    }

}


