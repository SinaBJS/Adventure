public class Map {
    private Room startingRoom;


    public void buildMap() {
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
        room2.setEastRoom(room3);
        room3.setSouthRoom(room6);
        room6.setSouthRoom(room9);
        room9.setWestRoom(room8);
        room8.setNorthRoom(room5);
        room8.setWestRoom(room7);
        room7.setNorthRoom(room4);
        room4.setNorthRoom(room1);
        startingRoom = room1;
    }

    public Room getStartingRoom() {
        return startingRoom;
    }
}

