package Items;

public abstract class Weapon extends Item {
    protected int uses;
    protected double damage;
    public Weapon(String name, String description, double damage) {
        super(name, description);
        this.damage=damage;

    }
    public abstract void attack();
    public void remainingUses(){

    }


}
