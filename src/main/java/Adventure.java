public class Adventure {
    private final Player player;

    public Adventure() {
        Map map = new Map();
        map.buildMap();
        Room startingRoom = map.getStartingRoom();
        player = new Player(startingRoom, 100, null);
        player.setInventory();

    }
//metode kald til Player klasse
    public void goEast(){
        player.goEast();
    }
    public void goSouth(){
        player.goSouth();
    }
    public void goNorth() {
        player.goNorth();
    }
    public void goWest() {
        player.goWest();
    }

    public void takeItem(String name){
        player.takeItem(name);
    }
    public void dropItem(String chosenItem) {
        player.dropItem(chosenItem);
    }
    public void lookAround() {
        player.lookAround();
    }
    public void printInventory(){
        player.printInventory();
    }

   public int health(){return player.getHealth();}

    public boolean playerIsDead(){return player.isDead();}
    public boolean victory(){return player.victory();}

    public void eatResult(String name){
        player.eatResult(name);
    }
    public void equipResult(String name){
        player.equipResult(name);
    }

    public String equippedWeapon(){return player.getEquippedWeaponName();}

    public void turnOnLight() {
        player.turnOnLight();
    }

    public void attackResult(String enemyName){player.attackResult(enemyName);}

    public void turnOffLight() {
        player.turnOffLight();
    }

    public int remainingUses(){
        return player.getRemainingUses();
    }

}

