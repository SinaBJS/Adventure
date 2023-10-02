import java.util.Scanner;

public class UserInterface {


    public void start() {
        Scanner keyboard = new Scanner(System.in);
        Adventure adventure = new Adventure();

        System.out.println("Type look to look around ");
        System.out.println("Type help for instructions");
        System.out.println("Type exit to shutdown the program");

        Player player =adventure.getPlayer();

        while (true) {
            String userchoice = keyboard.nextLine();

            switch (userchoice.trim().toLowerCase()) {
                case "look", "l" -> {
                    player.lookAround();
                }
                case "help", "h"->
                        System.out.println("Type a direction (for example 'go west', 'west' or 'w') to go in that direction" + "\n" +
                                "");
                case "go east", "east", "e" -> {
                    player.goEast();
                    player.lookAround();
                }
                case "go north", "north", "n" -> {
                    player.goNorth();
                    player.lookAround();
                }
                case "go west", "west", "w" -> {
                    player.goWest();
                    player.lookAround();
                }
                case "go south", "south", "s" -> {
                    player.goSouth();
                    player.lookAround();
                }
                case "take", "t" ->{
                    System.out.println("What item do you wish to take?");
                    String chosenItem = keyboard.nextLine();
                    player.takeItem(chosenItem);

                }
                case "drop", "d" ->{
                    System.out.println("What item do you wish to take?");
                    String chosenItem = keyboard.nextLine();
                    player.dropItem(chosenItem);
                }
                case "turn on", "light on" -> {

                }
                case "inventory", "inv", "i" ->{
                    player.printInventory();
                }


                case "turn off", "light off" -> {

                }

                case "exit" -> {
                    System.out.println("Shutting down the program");
                    System.exit(0);
                }
            }


        }
    }
}
