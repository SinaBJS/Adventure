package Items;

public class RangedWeapon extends Weapon{

    public RangedWeapon(String name, String description,int damage, int uses){
        super(name,description,damage);
        this.uses = uses;

    }

    @Override
    public void use() {
        if (uses > 0){
            uses -= 1;
        }else {
        }

    }
}
