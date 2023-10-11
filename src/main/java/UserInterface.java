import java.util.Scanner;

public class UserInterface {
    public void start() {
        Scanner keyboard = new Scanner(System.in);
        Adventure adventure = new Adventure();

        System.out.println("You're the chosen adventurer tasked with recovering the stolen Amulet of Radiance, a cherished treasure of the kingdom, deep within a perilous dungeon. The fate of the realm is in your hands.");
        System.out.println("Type look to look around ");
        System.out.println("Type help for instructions");
        System.out.println("Type exit to shutdown the program");


        while (true) {
            System.out.print(">");
            String userchoice = keyboard.nextLine();

            switch (userchoice.trim().toLowerCase()) {
                case "look", "l" -> adventure.lookAround();

                case "help" -> {
                    System.out.println("Type a direction (for example 'go west', 'west' or 'w') to go in that direction");
                    System.out.println("Look around you by typing 'look around', 'look' or 'l'");
                    System.out.println("Turn on the light by typing 'turn on' or 'light on");
                    System.out.println("Turn off the light by typing 'turn off' or 'light off'");
                    System.out.println("Take a look in your inventory by typing 'inventory', 'inv' or 'i'");
                    System.out.println("Check your health by typing 'health");
                    System.out.println("Take an item by typing 'take'");
                    System.out.println("Drop an item by typing 'drop'");
                    System.out.println("Equip an item by typing 'equip'");
                    System.out.println("Attack by typing 'attack'");
                    System.out.println("You can always go back in the direction you came from if an enemy is too strong!");
                }
                case "go east", "east", "e" -> {
                    adventure.goEast();
                    adventure.lookAround();
                }
                case "go north", "north", "n" -> {
                    adventure.goNorth();
                    adventure.lookAround();
                }
                case "go west", "west", "w" -> {
                    adventure.goWest();
                    adventure.lookAround();
                }
                case "go south", "south", "s" -> {
                    adventure.goSouth();
                    adventure.lookAround();
                }
                case "take", "t" -> {
                    System.out.println("What item do you wish to take?");
                    System.out.print(">");
                    String chosenItem = keyboard.nextLine();
                    adventure.takeItem(chosenItem);
                }
                case "drop", "d" -> {
                    System.out.println("What item do you wish to drop?");
                    System.out.print(">");
                    String chosenItem = keyboard.nextLine();
                    adventure.dropItem(chosenItem);
                }
                case "inventory", "inv", "i" -> adventure.printInventory();


                case "turn on", "light on" -> adventure.turnOnLight();


                case "turn off", "light off" -> adventure.turnOffLight();

                case "health" -> {
                    System.out.println(adventure.health());
                    adventure.health();
                }
                case "eat" -> {
                    System.out.println("What item do you wish to eat?");
                    System.out.print(">");
                    String chosenItem = keyboard.nextLine();
                    adventure.eatResult(chosenItem);

                }
                case "equip" -> {
                    System.out.println("What weapon do you wish to equip?");
                    System.out.print(">");
                    String chosenItem = keyboard.nextLine();
                    adventure.equipResult(chosenItem);
                }
                case "equipment" -> {
                    System.out.println(adventure.equippedWeapon());
                }
                case "attack" -> {
                    System.out.println("What do you wish to attack?");
                    String chosenEnemy = keyboard.nextLine();
                    adventure.attackResult(chosenEnemy);
                }
                case "ammo" ->{
                    System.out.println("You have:" + adventure.remainingUses() + " remaining ammo");

                }
                case "exit" -> {
                    System.out.println("Shutting down the program");
                    System.exit(0);
                }
            }
            if (adventure.playerIsDead()) {
                System.out.println("YOU DIED!");
                System.exit(0);
            }
            if (adventure.victory()){
                System.out.println("Congratulations! you have succeeded in obtaining the magical amulet.");
                System.out.println("Do you want to leave the game [Yes/No]");
                String userInput = keyboard.nextLine();
                if(userInput.equalsIgnoreCase("yes")){
                    System.exit(0);
                } else if (userInput.equalsIgnoreCase("no")) {

                    System.out.println("Okay! You can exit the game by typing 'exit' when you have finished your adventures,");
                }
            }

        }
    }
}
