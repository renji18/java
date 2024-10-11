public class Fruit implements ItemStuff {
    private final String name;
    private final int quantity;
    private final String type;

    public Fruit(String name, int quantity, String type) {
        this.name = name;
        this.quantity = quantity;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void displayInfo(){
        System.out.println("Item: " + getName() + ". Quantity: " + getQuantity() + ". Type: " + type);
    }
}
