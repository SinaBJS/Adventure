import Items.MeleeWeapon;
import Items.Weapon;

public class Enemy extends Player {
    private String name;
    private String description;
    public Enemy(Room startingRoom, int health, Weapon equippedWeapon, String name, String description) {
        super(startingRoom, health, equippedWeapon);
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    @Override
    public returnMessage attack() {
        if(equippedWeapon instanceof MeleeWeapon) {
            int damageTaken = (int) (player.getHealth() - equippedWeapon.getDamage());
            player.setHealth(damageTaken);
            return returnMessage.OK;
        }//lav ranged weapon
        else return returnMessage.CANT;
    }

    public String getDescription() {
        return description;
    }
}
