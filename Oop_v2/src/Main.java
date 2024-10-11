public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Fruit item1 = new Fruit("Apple", 20, "Green Apple");
        Weapon item2 = new Weapon("Blades", 40, 8);
        Weapon item3 = new Weapon("Sword", 2, 25);
//        Item item4 = new Item("Generic Item", 7);

        inventory.addItem(item1);
        inventory.addItem(item2);
        inventory.addItem(item3);
//        inventory.addItem(item4);

        inventory.displayInventory();
    }
}