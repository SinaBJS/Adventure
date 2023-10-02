import java.util.Scanner;

public class UserInterface {


    public void start() {
        Scanner keyboard = new Scanner(System.in);
        Adventure adventure = new Adventure();

        System.out.println("Type look to look around ");
        System.out.println("Type help for instructions");
        System.out.println("Type exit to shutdown the program");
        Player player = adventure.getPlayer();
        while (true) {
            String userchoice = keyboard.nextLine();

            switch (userchoice.trim().toLowerCase()) {
                case "look around", "look", "l" -> player.lookAround();
                case "help" -> {
                    System.out.println("Type a direction (for example 'go west', 'west' or 'w') to go in that direction");
                    System.out.println("Look around you by typing 'look around', 'look' or 'l'");
                    System.out.println("Turn on the light by typing 'turn on' or 'light on");
                    System.out.println("Turn off the light by typing 'turn off' or 'light off'");
                }

                case "go east", "east", "e" -> {
                    player.goEast();
                    player.lookAround();
                }
                case "go north", "north", "n" -> {
                    player.goNorth();
                    player.lookAround();
                }
                case "go west", "west", "w" -> {
                    adventure.getPlayer().goWest();
                    player.lookAround();
                }
                case "go south", "south", "s" -> {
                    player.goSouth();
                    player.lookAround();
                }
                case "turn on", "light on" -> {

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
