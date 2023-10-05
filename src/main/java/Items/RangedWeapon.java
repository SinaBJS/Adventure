package Items;

public class RangedWeapon extends Weapon{
    private double damage;
    private int ammo;
    public RangedWeapon(String name, String description, double damage, int ammo){
        super(name,description);
        this.damage = damage;
        this.ammo = ammo;

    }

    @Override
    public void attack() {
        if (ammo > 0){
            ammo -= 1;
            System.out.println("You fire your weapon");
        }else {
            System.out.println("You do not have any ammo");
        }

    }
}
