public class Adventure {

    public Player getPlayer() {
        return player;
    }

    private Player player;

    public Adventure() {
        Map map = new Map();
        map.buildMap();
        Room startingRoom = map.getStartingRoom();
        player = new Player(startingRoom);

    }



    /*public void goEast() {
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
    public Room getCurrentRoom(){
        return currentRoom;
    }*/

   /* public void xyzzy(){
        currentRoom = room1;


        System.out.println("You just teleported");
    }
*/
}
