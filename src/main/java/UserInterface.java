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
                case "look" -> adventure.lookAround();
                case "help" -> System.out.println("Type a direction (for example 'go west', 'west' or 'w') to go in that direction");
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
                case "turn on", "light on" ->{

                }


                    case "turn off", "light off" ->{

                    }

                case "exit" -> {
                    System.out.println("Shutting down the program");
                    System.exit(0);
                }
            }


        }
    }
}
