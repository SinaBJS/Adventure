import java.util.Scanner;

public class UserInterface {


    public void start() {
        Scanner keyboard = new Scanner(System.in);
        Adventure adventure = new Adventure();

        System.out.println("Type look to look around ");
        System.out.println("Type help for instructions");
        System.out.println("Type exit to shutdown the program");


        while (true) {
            String userchoice = keyboard.nextLine();

            switch (userchoice.trim().toLowerCase()) {
                case "look", "l" -> {
                    adventure.lookAround();
                }
                case "help", "h" -> {
                    System.out.println("Type a direction (for example 'go west', 'west' or 'w') to go in that direction");
                    System.out.println("Look around you by typing 'look around', 'look' or 'l'");
                    //System.out.println("Turn on the light by typing 'turn on' or 'light on");
                    //System.out.println("Turn off the light by typing 'turn off' or 'light off'");
                    System.out.println("Take a look in your inventory by typing 'inventory', 'inv' or 'i'");
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
                    String chosenItem = keyboard.nextLine();
                    adventure.takeItem(chosenItem);
                }
                case "drop", "d" -> {
                    System.out.println("What item do you wish to drop?");
                    String chosenItem = keyboard.nextLine();
                    adventure.dropItem(chosenItem);
                }
                case "inventory", "inv", "i" -> {
                    adventure.printInventory();
                }

                case "turn on", "light on" -> {
                    //adventure.turnOnLight();
                }

                case "turn off", "light off" -> {
                    adventure.turnOffLight();
                }

                case "exit" -> {
                    System.out.println("Shutting down the program");
                    System.exit(0);
                }
            }


        }
    }
}
