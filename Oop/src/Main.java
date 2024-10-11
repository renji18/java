public class Main {
    public static void main(String[] args) {
        Car tesla = new Car("tesla", "red", "supra", 4);
        Car ford = new Car("Ford", "green", "Mustang", 2);
        Car jaguar = new Car();

        tesla.move();
        tesla.stop();
        System.out.println(tesla.getModel());
        System.out.println(tesla.getName());
        System.out.println(tesla.getColor());
        System.out.println(tesla.getDoors());

        ford.move();
        ford.stop();
        System.out.println(ford.getModel());
        System.out.println(ford.getName());
        System.out.println(ford.getColor());
        System.out.println(ford.getDoors());

        jaguar.move();

        Bike dugati = new Bike("Dugati", "Green", "x42");
        dugati.move();
        dugati.stop();

        Plane boieng = new Plane("Boeing", "Blue and White", "3342", 5);
        boieng.move();
        boieng.stop();
    }
}

class Vehicle {
    private String name;
    private String color;

    public Vehicle(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void move(){
        System.out.printf("The vehicle %s is moving\n", this.name);
    }

    public void stop(){
        System.out.printf("The vehicle %s has stopped\n", this.name);
    }
}

class Bike extends Vehicle{
    private String model;

    public Bike(String name, String color, String model) {
        super(name, color);
        this.model = model;
    }

}

class Plane extends Vehicle {
    private String model;
    private int engines;

    public Plane(String name, String color, String model, int engines) {
        super(name, color);
        this.model = model;
        this.engines = engines;
    }

    @Override
    public void move() {
        System.out.println("Moving in the air");
        super.move();
    }
}