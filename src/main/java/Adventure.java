public class Adventure {


    private Player player;

    public Adventure() {
        Map map = new Map();
        map.buildMap();
        Room startingRoom = map.getStartingRoom();
        player = new Player(startingRoom);
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

    public void lookAround() {
        player.lookAround();
    }
    public void printInventory(){
        player.printInventory();
    }

    public void dropItem(String chosenItem) {
        player.dropItem(chosenItem);
    }

    public void turnOnLight() {
        player.turnOnLight();
    }

    public void turnOffLight() {
        player.turnOffLight();
    }
}

