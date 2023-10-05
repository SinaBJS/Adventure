package Items;

public class MeleeWeapon extends Weapon {
    public MeleeWeapon(String name, String description) {
        super(name, description);
    }

    @Override
    public void attack() {
        System.out.println("You swing your weapon across the room");
    }
}
