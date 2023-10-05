package Items;

public abstract class Weapon extends Item {
    protected int uses;
    public Weapon(String name, String description) {
        super(name, description);

    }
    public abstract void attack();
    public void remainingUses(){

    }


}
