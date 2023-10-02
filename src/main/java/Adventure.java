import java.util.ArrayList;

public class Adventure {

    public Player getPlayer() {
        return player;
    }

    private Player player;
    private Room room;
    //public ArrayList<Item> itemsRoom = room.getItems();
    public Adventure() {
        Map map = new Map();
        map.buildMap();
        Room startingRoom = map.getStartingRoom();
        player = new Player(startingRoom);

    }


   /* public void xyzzy(){
        currentRoom = room1;
        System.out.println("You just teleported");
    }
*/
}
