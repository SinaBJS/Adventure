import Items.*;

import java.util.ArrayList;

public class Player {
    private int maxHealth = 100;
    private Room currentRoom;
    private int health;
    Weapon equippedWeapon;
    Enemy enemy;
    Player player;
    ArrayList<Item> inventory = new ArrayList<>();
    //starter inventory
    Item rock = new Item("rock", "bigger than a pebble");
    Food healthpotion = new Food("health potion", "heals the player", 20);


    public Player(Room startingRoom, int health, Weapon equippedWeapon) {
        this.currentRoom = startingRoom;
        this.health = health;
        this.equippedWeapon=equippedWeapon;
    }

    public void setInventory() {
        inventory.add(rock);
        inventory.add(healthpotion);
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void goEast() {
        if (currentRoom.east == null) {
            System.out.println("I can't go this way.");
        } else {
            System.out.println("Going east...");
            currentRoom = currentRoom.east;
        }
    }

    public void goNorth() {
        if (currentRoom.north == null) {
            System.out.println("I can't go this way.");
        } else {
            System.out.println("Going north...");
            currentRoom = currentRoom.north;
        }

    }

    public void goWest() {
        if (currentRoom.west == null) {
            System.out.println("I cant go this way.");
        } else {
            System.out.println("Going west...");
            currentRoom = currentRoom.west;
        }

    }

    public void goSouth() {
        if (currentRoom.south == null) {
            System.out.println("I can't go this way.");
        } else {
            System.out.println("Going south...");
            currentRoom = currentRoom.south;
        }
    }

    public void lookAround() {
        if (!currentRoom.getIsLightOn()) {
            System.out.println("Darkness surrounds you. You should turn on a light.");
        } else if (!currentRoom.getItems().isEmpty() && currentRoom.getIsLightOn()) {
            System.out.println(currentRoom.getDescription());

            System.out.println("There are following items in the room: ");

            for (Item item : currentRoom.getItems()) {
                System.out.println(item.getName() + " " + item.getDescription());
            }
            if (!currentRoom.getEnemies().isEmpty()){
                System.out.println("There is following enemies in the room: ");
                for (Enemy enemy:currentRoom.getEnemies()) {
                    System.out.println(enemy.getName() + " " + enemy.getDescription());

                }

            }
        } else {
            System.out.println(currentRoom.getDescription());
        }
    }
    public Item findItem(String itemName) {
        for (Item item : inventory) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null;
    }
    public Enemy findEnemy(String enemyname){
        for (Enemy enemy: currentRoom.enemies) {
            if (enemy.getName().equalsIgnoreCase(enemyname)){
                return enemy;
            }
        }
        return null;
    }

    public void takeItem(String name) {
        if (currentRoom.getIsLightOn()){
            ArrayList<Item> itemArrayList = currentRoom.getItems();
            ArrayList<Item> itemTaken = new ArrayList<>();
            boolean itemFound = false;
            for (Item item : itemArrayList) {
                if (item.getName().equalsIgnoreCase(name.toLowerCase())) {
                    itemTaken.add(item);
                    inventory.add(item);
                    System.out.println("You have taken " + item.getName());
                    itemFound = true;
                }
            }
            itemArrayList.removeAll(itemTaken);
            if (!itemFound) {
                System.out.println("There is no such item in the room!");
            }
        }else{
            System.out.println("You cant find the item when there is no light!");
        }
    }

    public void dropItem(String name) {
        ArrayList<Item> itemArrayList = currentRoom.getItems();
        ArrayList<Item> itemDropped = new ArrayList<>();
        boolean itemFound = false;
        for (Item item : inventory) {
            if (item.getName().equalsIgnoreCase(name.toLowerCase())) {
                itemDropped.add(item);
                itemArrayList.add(item);
                System.out.println("You have dropped " + item.getName());
                itemFound = true;
                if (item.equals(equippedWeapon)) {
                    equippedWeapon = null;
                }
            }
        }
        if (!itemFound) {
            System.out.println("There is no such item in your inventory!");
        }
        inventory.removeAll(itemDropped);
    }

    public void printInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Your inventory is empty.");
        } else {
            for (Item item : inventory) {
                System.out.println(item.getName() + ": " + item.getDescription());
            }
        }
    }

    public void turnOnLight() {
        if (!currentRoom.getIsLightOn() && findItem("torch") != null) {
            currentRoom.turnOn();
            System.out.print("You see ");
            lookAround();
        } else if (!inventory.contains(findItem("torch"))) {
            System.out.println("You need a torch to turn on the light");
        } else System.out.println("The light is already on.");
    }

    public void turnOffLight() {
        if (currentRoom.getIsLightOn()) {
            currentRoom.turnOff();
        } else {
            System.out.println("The light is already off.");
        }
    }

    public int getHealth() {
        return health;
    }

    public returnMessage eat(String name) {
        Item item = findItem(name);
        if (item != null) {
            if (inventory.contains(item)) {
                if (item instanceof Food) {
                    inventory.remove(item);
                    health += ((Food) item).getHealthPoints();
                    return returnMessage.OK;
                } else {
                    return returnMessage.NOT_THERE;
                }
            } else {
                return returnMessage.CANT;
            }
        }
        return null;
    }

    public void eatResult(String name) {
        switch (eat(name)) {
            case OK -> {
                Item item = findItem(name);
                System.out.println("You ate " + name + " and gained " + ((Food) item).getHealthPoints() + "HP");
            }
            case CANT -> System.out.println("You can not eat that!");
            case NOT_THERE -> System.out.println("You do not have that in your inventory");
        }
    }
    public returnMessage equipWeapon(String name) {
        Item item = findItem(name);
        if (item != null && item instanceof Weapon) {
            Weapon weapon = (Weapon)item;
            if (inventory.contains(weapon)) {
                equippedWeapon = weapon;
                return returnMessage.OK;
            } else {
                return returnMessage.NOT_THERE;
            }
        } else {
            return returnMessage.CANT;
        }
    }
        public void equipResult(String name) {
            switch (equipWeapon(name)) {
                case OK -> System.out.println("You equipped " + name);
                case CANT -> System.out.println("You can not equip that!");
                case NOT_THERE -> System.out.println("You do not have that in your inventory");
            }
        }

    public String getEquippedWeaponName() {
        if (equippedWeapon != null) {
            return equippedWeapon.getName();
        } else {
            return  "You do not have a weapon equipped";
        }
    }

    public returnMessage attack() {
        if(currentRoom.enemies.isEmpty())
        if(equippedWeapon instanceof MeleeWeapon) {
            int damageTaken = (int) (enemy.getHealth() - equippedWeapon.getDamage());
            enemy.setHealth(damageTaken);
           if (!enemy.isDead()){
               enemy.attack();
           }


           equippedWeapon.use();
           return returnMessage.OK;


        }else if (equippedWeapon instanceof RangedWeapon) {


       } else
            return returnMessage.CANT;

        return null;
    }

    public void attackResult() {
        switch (attack()) {
            case CANT -> System.out.println("You dont have a weapon equipped! ");

        }
    }
    public int getRemainingUses(){
        if (!(equippedWeapon == null)){
            return equippedWeapon.remainingUses();
        }
        return 0;
    }

    public boolean isDead() {
        if (health < 1){
            return true;
        }
        return false;
    }
}






