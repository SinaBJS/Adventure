import java.util.ArrayList;

public class Room {
    public String name;
    public String description;
    private boolean lightOn;
    public Room east;
    public Room west;
    public Room south;
    public Room north;
    public ArrayList<Item> items = new ArrayList<>();

    public Room(String name, String description, boolean lightOn) {
        this.name = name;
        this.description = description;
        this.lightOn = lightOn;

    }
    public ArrayList<Item> getItems(){
        return items;
    }

    public void turnOn() {
        this.lightOn = true;
        System.out.println("You light up a torch hanging on the wall, and the room lights up.");
    }


    public void turnOff() {
        this.lightOn = false;
        System.out.println("You extingiush a torch hanging on the wall, and the light in the room dies");
    }

    public boolean getIsLightOn() {
        return lightOn;
    }
    public void setLightOn(boolean lightOn) {
        this.lightOn = lightOn;
    }



    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }


    public void setEastRoom(Room room) {
        this.east = room;
        if (room != null) {
            room.west = this;
        }

    }

    public void setWestRoom(Room room) {
        this.west = room;
        if (room != null) {
            room.east = this;
        }
    }

    public void setSouthRoom(Room room) {
        this.south = room;
        if (room != null) {
            room.north = this;
        }
    }

    public void setNorthRoom(Room room) {
        this.north = room;
        if (room != null) {
            room.south = this;
        }
    }

    public void addItem(Item item) {
        items.add(item);
    }
}
