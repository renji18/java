public class Weapon extends Item {
    private final int damage;

    public Weapon(String name, int quantity, int damage){
        super(name, quantity);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public void displayInfo(){
        System.out.println("Item: " + getName() + ". Quantity: " + getQuantity() + ". Damage: " + damage);
    }
}
