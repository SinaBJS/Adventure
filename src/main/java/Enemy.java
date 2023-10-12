import Items.Weapon;

public class Enemy {
    private String name;
    private String description;
    private int health;

    private Weapon equippedWeapon;
    public Enemy(int health, Weapon equippedWeapon, String name, String description) {
        this.health = health;
        this.equippedWeapon = equippedWeapon;
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public boolean isDead() {
        return health < 1;
    }

    public String getDescription() {
        return description;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int newHealth) {
        health = newHealth;
    }


}
