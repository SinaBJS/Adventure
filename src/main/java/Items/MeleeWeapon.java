package Items;

public class MeleeWeapon extends Weapon {
    public MeleeWeapon(String name, String description,int damage) {
        super(name, description,damage);
    }

    @Override
    public void use() {
        System.out.println("You swing your weapon across the room");
    }
}
