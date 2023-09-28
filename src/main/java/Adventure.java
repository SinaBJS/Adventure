public class Adventure {

    private Room currentRoom;
    private Room room1;

    public Adventure() {
        Map map = new Map();
        map.buildMap();
        currentRoom = map.getStartingRoom();
    }


    public void lookAround() {
        if (currentRoom.getIsLightOn() == false) {
            System.out.println("Darkness surrounds you. You should turn on a light.");
        } else
            System.out.println(currentRoom.getDescription());
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

   /* public void xyzzy(){
        currentRoom = room1;


        System.out.println("You just teleported");
    }
*/
}
