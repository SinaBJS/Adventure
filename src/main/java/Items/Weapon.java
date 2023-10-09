package Items;

public abstract class Weapon extends Item {
    protected int uses;
    protected double damage;
    public Weapon(String name, String description, int damage) {
        super(name, description);
        this.damage=damage;

    }

    public double getDamage() {
        return damage;
    }

    public abstract void use();

    public int remainingUses(){
        return uses;
    }


}
