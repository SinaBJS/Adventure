public class Room {
    public String name;
    public String description;
    public Room east;
    public Room west;
    public Room south;
    public Room north;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void setEastRoom(Room room) {
        this.east = room;
    }
    public void setWestRoom(Room room) {
        this.west = room;
    }
    public void setSouthRoom(Room room) {
        this.south = room;
    }
    public void setNorthRoom(Room room) {
        this.north=room;
    }
}
