public class Car {
    private String name;
    private String color;
    private String model;
    private int doors;

    public Car(String name, String color, String model, int doors){
        this.name = name;
        this.color = color;
        this.model = model;
        this.doors = doors;
    }

    public Car(){
        this("Name", "Color", "Model", 5);
    }

    public void move(){
        System.out.printf("The car %s is moving\n", this.name);
    }

    public void stop(){
        System.out.printf("The car %s has stopped\n", this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
