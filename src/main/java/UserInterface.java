import java.util.Scanner;

public class UserInterface {


    public void start() {
        Scanner keyboard = new Scanner(System.in);

        Adventure adventure = new Adventure();
        adventure.buildMap();

        System.out.println("Type look to look around ");
        System.out.println("Type help for instructions");
        System.out.println("Type exit to shutdown the program");
        while (true) {
            String userchoice = keyboard.nextLine();

            switch (userchoice.toLowerCase()) {
                case "look" -> adventure.lookAround();
                case "help" -> System.out.println("Type a direction (North,South,West,East) to go in that direction");
                case "go east", "east", "e" -> {
                    adventure.goEast();
                    System.out.println("Going east");
                    adventure.lookAround();
                }
                case "go north", "north", "n" -> {
                    adventure.goNorth();
                    System.out.println("Going north");
                    //adventure.lookAround();
                }
                case "go west", "west", "w" -> {
                    adventure.goWest();
                    System.out.println("Going west");
                    adventure.lookAround();
                }
                case "go south", "south", "s" -> {
                    adventure.goSouth();
                    System.out.println("Going south");
                    adventure.lookAround();
                }
                case "exit" -> {
                    System.out.println("Shutting down the program");
                    System.exit(0);
                }
            }


        }
    }
}
