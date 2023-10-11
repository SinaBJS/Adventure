import Items.*;

public class Map {
    private Room startingRoom;


    public void buildMap() {

        //Items
        MeleeWeapon rustySword = new MeleeWeapon("Rusty sword", " a blade showing signs of age and neglect", 5);
        MeleeWeapon mace = new MeleeWeapon("Powerful mace", "A potent mace with a menacing spiked head.", 30);
        MeleeWeapon battleAxe = new MeleeWeapon("Battle axe", "A brutal battle axe, with a massive double-edged blade, ready to cleave through foes with devastating force.", 15);
        MeleeWeapon woodenClub = new MeleeWeapon("Wooden club", "A crude, oversized wooden club, unmistakably the chosen weapon of a formidable troll, bears the scars of countless brutal encounters.", 20);
        MeleeWeapon longSword = new MeleeWeapon("Long sword", "A finely crafted long sword, its gleaming blade honed to perfection for precise strikes in combat.", 15);
        MeleeWeapon goldenDagger = new MeleeWeapon("Golden dagger", "A gleaming golden dagger, its ornate hilt and razor-sharp blade reflecting opulence and danger in equal measure.",20);
        MeleeWeapon magicalSword = new MeleeWeapon("Magical sword","A mystical sword, its blade shimmering with arcane runes, bestows the wielder with the ability to harness and channel the forces of magic.", 40);
        RangedWeapon bow = new RangedWeapon("Wooden bow", "An elegant bow, expertly designed for precise archery.", 25, 5);

        Item torch = new Item("torch", ",useful in dark rooms");
        Item magicalAmulet = new Item("Magical amulet", "An enchanted amulet, pulsating with an otherworldly energy, grants its wearer extraordinary powers over the elements and the unseen.");

        Food greenPotion = new Food("A green potion", "A repulsive, green potion exudes an eerie glow, emanating an unsettling odor of decay and mystery.", -20);
        Food redPotion = new Food("A red potion", "A nourishing red potion glistens with a tempting allure, promising rejuvenation and vitality.", 30);

        //Rooms
        Room room1 = new Room("Room 1", "You enter a dimly lit chamber, the walls adorned with faded murals of long-forgotten heroes, their stories lost to time.", true);
        Room room2 = new Room("Room 2", "A narrow, ominous corridor stretches before you, the walls bearing intricate, mysterious carvings.", true);
        Room room3 = new Room("Room 3", "In this chamber, arrow slits are visible in the walls, remnants of battles long past.",true);
        Room room4 = new Room("Room 4", "You find a small alcove filled with various-sized niches, each containing remnants of past adventurers' belongings.", true);
        Room room5 = new Room("Room 5", "The final room is illuminated by an ethereal, bluish light, and strange symbols are etched into the floor.", false);
        Room room6 = new Room("Room 6", "This room has a mosaic floor that tells a story of ancient glory and sorrow, the images fading with age.", true);
        Room room7 = new Room("Room 7", "The walls in this room are adorned with sconces holding torches, their flames flickering and casting eerie shadows.", true);
        Room room8 = new Room("Room 8", "Two passageways lead away from this room, one going north and one going west, each marked with cryptic runes that defy easy interpretation.", true);
        Room room9 = new Room("Room 9", "An imposing statue of a forgotten warrior stands in this room, a silent sentinel over the centuries.", true);

        //enemies
        Enemy skeleton = new Enemy( 35, rustySword,"skeleton", "a feeble green skeleton");
        room2.addEnemy(skeleton);

        Enemy snakeman = new Enemy(50, battleAxe, "snakeman", "a agile enemy, half man half snake, wieleding a battleaxe");
        room3.addEnemy(snakeman);

        Enemy troll = new Enemy(70, woodenClub, "troll", "a giant troll, stupid but very powerful");
        room9.addEnemy(troll);

        Enemy assassin = new Enemy(40, goldenDagger, "assassin", "a quick assassin. not very durable but very lethal");
        room7.addEnemy(assassin);

        Enemy warrior = new Enemy(60,longSword ,"warrior", "A battle-hardened warrior, clad in intricately engraved armor, emanates an aura of unwavering resolve.");
        room4.addEnemy(warrior);

        Enemy ancientWarrior = new Enemy(150, magicalSword, "Ancient Warrior", "an ancient undead warrior, guarding the amulet" );
        room5.addEnemy(ancientWarrior);


        //add items to rooms
        room1.addItem(rustySword);
        room1.addItem(magicalAmulet);
        room3.addItem(bow);
        room7.addItem(torch);
        room4.addItem(redPotion);
        room6.addItem(redPotion);
        room6.addItem(greenPotion);
        room9.addItem(mace);
        room8.addItem(redPotion);
        room8.addItem(greenPotion);
        room5.addItem(magicalAmulet);


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

