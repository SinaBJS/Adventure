package Items;

public class MeleeWeapon extends Weapon {
    public MeleeWeapon(String name, String description,double damage) {
        super(name, description,damage);
    }

    @Override
    public void attack() {
        System.out.println("You swing your weapon across the room");
    }
}
