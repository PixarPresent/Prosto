package MASHINI;

public abstract class Transport{

    private float speed;
    private int weight;
    private String color;
    private int[] coordinate;
    private String type;


    public Transport(String type, float speed, int weight, String color, int[] coordinate){
        setValues(type, speed, weight, color, coordinate);
        System.out.println(getValues());
    }

    public Transport(int weight, int[] coordinate){
        this.weight = weight;
        this.coordinate = coordinate;
        System.out.println(getValues());
    }

    public void setValues(String type, float speed, int weight, String color, int[] coordinate) {
        this.type = type;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
        this.type = type;
    }
    public String getValues() {
        String Transport = "Transport\n";
        String Type = "type: " + type;
        String info = "\nspeed: " + speed + ".\nWeight: " + weight + ".\nColor: " + color;
        String info_coor = "\nCoordinate:\n";
        for (int i = 0; i < coordinate.length; i++)
            info_coor += coordinate[i] + "\n";
        return Transport + Type + info + info_coor;
    }

    class Engine {
        private boolean isReady;
        private int km;

        public void setValues(boolean isReady, int km) {
            this.isReady = isReady;
            this.km = km;
        }

        public void info() {
            if (isReady)
                System.out.println("Engine is ready");
            else
                System.out.println("Engine isn't ready. Km = " + km + ".");
        }
    }
}

