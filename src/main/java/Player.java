import java.util.ArrayList;

public class Player {
    private Room currentRoom;
    ArrayList<Item> inventory = new ArrayList<>();

    public Player(Room startingRoom) {
        this.currentRoom = startingRoom;

    }

    Item rock = new Item("rock", "bigger than a pebble");
    Item snake = new Item("snake", "a snake");

    public void setInventory() {
        inventory.add(rock);
        inventory.add(snake);
    }

    public Room getCurrentRoom() {
        return currentRoom;
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

            System.out.println("There are following items in the room");

            for (Item item : currentRoom.getItems()) {
                System.out.println(item.getName() + " " + item.getDescription());
            }

        } else {
            System.out.println(currentRoom.getDescription());
        }
    }

    //TODO find item method
    public ArrayList<Item> findItem(String name) {
        ArrayList<Item> itemsFound = new ArrayList<>();
        for (Item item : inventory) {
            if (item.getName().equalsIgnoreCase(name)) {
                itemsFound.add(item);
            }
        }
        return itemsFound;
    }

    public void takeItem(String name) {
        ArrayList<Item> itemArrayList = currentRoom.getItems();
        ArrayList<Item> itemTaken = new ArrayList<>();
        for (Item item : itemArrayList) {
            if (item.getName().toLowerCase().contains(name.toLowerCase())) {
                itemTaken.add(item);
                inventory.add(item);
                System.out.println("You have taken " + item.getName());
            }
        }

        itemArrayList.removeAll(itemTaken);
    }

    public void dropItem(String name) {
        ArrayList<Item> itemArrayList = currentRoom.getItems();
        ArrayList<Item> itemDropped = new ArrayList<>();
        for (Item item : inventory) {
            if (item.getName().toLowerCase().contains(name.toLowerCase())) {
                itemDropped.add(item);
                itemArrayList.add(item);
                System.out.println("You have dropped " + item.getName());
            }

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
        public void turnOnLight () {
            ArrayList<Item> torches = findItem("torch");

            if (!currentRoom.getIsLightOn() && !torches.isEmpty()) {
                currentRoom.turnOn();
                System.out.print("You see ");
                lookAround();
            } else if (!inventory.contains(findItem("torch"))) {
                System.out.println("You need a torch to turn on the light");
            }else System.out.println("The light is already on.");
            }
        public void turnOffLight () {
            if (currentRoom.getIsLightOn()) {
                currentRoom.turnOff();
            } else {
                System.out.println("The light is already off.");
            }
        }
    }




