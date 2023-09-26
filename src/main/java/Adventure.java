public class Adventure {


    private Room currentRoom;
    private Room room1;

    public void buildMap(){
        Room room1 = new Room("Room 1", "rum 1", false);
        Room room2 = new Room("Room 2", "rum 2", true);
        Room room3 = new Room("Room 3", "rum 3", true);
        Room room4 = new Room("Room 4", "rum 4", true);
        Room room5 = new Room("Room 5", "rum 5", true);
        Room room6 = new Room("Room 6", "rum 6", true);
        Room room7 = new Room("Room 7", "rum 7", true);
        Room room8 = new Room("Room 8", "rum 8", true);
        Room room9 = new Room("Room 9", "rum 9", true);


        room1.setEastRoom(room2);
        room1.setSouthRoom(room4);

        room2.setEastRoom(room3);
        room2.setWestRoom(room1);

        room3.setWestRoom(room2);
        room3.setSouthRoom(room6);

        room6.setNorthRoom(room3);
        room6.setSouthRoom(room9);

        room9.setNorthRoom(room6);
        room9.setWestRoom(room8);

        room8.setWestRoom(room7);
        room8.setNorthRoom(room5);
        room8.setEastRoom(room9);

        room7.setEastRoom(room8);
        room7.setNorthRoom(room4);

        room4.setSouthRoom(room7);
        room4.setNorthRoom(room1);
        //start room
        currentRoom = room1;
    }

    public void lookAround(){
        if (currentRoom.getIsLightOn()==false){
            System.out.println("Darkness surrounds you. You should turn on a light.");
        }else
        System.out.println(currentRoom.getDescription());
    }
    public void goEast(){
        if (currentRoom.east == null) {
            System.out.println("I can't go this way.");
        }else {
            System.out.println("Going east...");
            currentRoom = currentRoom.east;
        }
    }
    public void goNorth(){
        if (currentRoom.north == null){
            System.out.println("I can't go this way.");
        }else {
            System.out.println("Going north...");
            currentRoom = currentRoom.north;
        }

    }
    public void goWest(){
        if (currentRoom.west == null){
            System.out.println("I cant go this way.");
        }else {
            System.out.println("Going west...");
            currentRoom = currentRoom.west;
        }

    }
    public void goSouth(){
        if (currentRoom.south==null){
            System.out.println("I can't go this way.");
        }else{
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
