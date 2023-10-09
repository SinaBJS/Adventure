import Items.Item;
import Items.MeleeWeapon;
import Items.RangedWeapon;
import Items.Weapon;

public class Map {
    private Room startingRoom;


    public void buildMap() {

        //Items
        MeleeWeapon sword = new MeleeWeapon("sword", ", a sharp weapon", 20);
        MeleeWeapon knife = new MeleeWeapon("knife", ", a sharp little weapon", 10);
        RangedWeapon bow = new RangedWeapon("bow", ", a powerful ranged weapon", 15, 5);
        RangedWeapon throwingDaggers = new RangedWeapon("throwing daggers", "small daggers you should throw", 20, 3);
        RangedWeapon warhammer = new RangedWeapon("warhammer", "a big sturdy and powerful hammer", 20, 3);
        Item torch = new Item("torch", ",useful in dark rooms");


        //Rooms
        Room room1 = new Room("Room 1", "You find yourself in a dimly lit chamber, the flickering torch on the moss-covered stone wall casting eerie shadows.", true);
        Room room2 = new Room("Room 2", "The room is bathed in a soft, ethereal glow from a mystical orb hanging from the ceiling.\n" +
                "On a stone altar, you spot a shimmering sword and a vial of healing potion.", false);
        Room room3 = new Room("Room 3", "You enter a chamber shrouded in darkness, but a shimmering crystal chandelier reveals a hidden treasure.\n" +
                "Across the room, a crossbow and a quiver of arrows await your discovery.", true);
        Room room4 = new Room("Room 4", "As you step into the room, you hear the ominous growl of a lurking beast.\n" +
                "A flickering lantern reveals a rusted shield and a bottle of poison antidote.", true);
        Room room5 = new Room("Room 5", "In this chamber, ancient tomes line dusty shelves, and the scent of forgotten knowledge fills the air.\n" +
                "You also notice a pair of throwing daggers glinting atop a weathered oak desk.", true);
        Room room6 = new Room("Room 6", "The room is alive with the soothing sound of trickling water from an underground stream.\n" +
                "On a moss-covered stone pedestal, a vial of invisibility elixir awaits, alongside a sturdy warhammer.", true);
        Room room7 = new Room("Room 7", "A mysterious aura envelops the room as a full moon shines through a cracked ceiling.\n" +
                "On an ornate table, you spot a crystal vial containing a potion of levitation and a sharp silver dagger.", true);
        Room room8 = new Room("Room 8", "The chamber is eerily silent, save for a faint, ghostly whisper that sends shivers down your spine.\n" +
                "You find a longbow propped against an ancient crypt and a flask of fire-breathing elixir.", true);
        Room room9 = new Room("Room 9", "The room is swathed in eerie mist, making it difficult to discern the shadows.\n" +
                "In the corner, a pair of menacing red eyes glow, revealing a lurking enemy. Nearby, a poisoned dart lies next to a mystical staff adorned with runes.", true);

        Enemy troll = new Enemy(room1, 40, knife,"troll", "green monster");
        room2.addEnemy(troll);

        //add items to rooms
        room1.addItem(knife);
        room1.addItem(sword);
        room1.addItem(torch);
        room1.addItem(bow);
        room2.addItem(sword);
        room2.addItem(knife);
        room5.addItem(throwingDaggers);
        room6.addItem(warhammer);


        //attach rooms
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

