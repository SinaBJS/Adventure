package Items;

public class RangedWeapon extends Weapon{

    public RangedWeapon(String name, String description,double damage, int uses){
        super(name,description,damage);
        this.uses = uses;

    }

    @Override
    public void attack() {
        if (uses > 0){
            uses -= 1;
            System.out.println("You fire your weapon");
        }else {
            System.out.println("You do not have any ammo");
        }

    }
}
