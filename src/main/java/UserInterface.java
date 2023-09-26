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


            switch (userchoice.toLowerCase()){
                case "look":
                    adventure.lookAround();
                    break;
                case "help":
                    System.out.println("Type a direction (North,South,West,East) to go in that direction");
                    break;
                case "go east":
                    System.out.println("Going east");
                    adventure.goEast();
                    adventure.lookAround();
                    break;
                case "go north":
                    System.out.println("Going north");
                    adventure.goNorth();
                    adventure.lookAround();
                    break;
                case "go west":
                    System.out.println("Going west");
                    adventure.goWest();
                    adventure.lookAround();
                    break;
                case "go south":
                    System.out.println("Going south");
                    adventure.goSouth();
                    adventure.lookAround();
                    break;
                case "exit":
                    System.out.println("Shutting down the program");
                    System.exit(0);
                    break;
            }


        }
    }
}
