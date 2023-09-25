import java.util.Scanner;

public class UserInterface {


    public void start() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type look to look around ");
        System.out.println("Type help for instructions");
        System.out.println("Type exit to shutdown the program");
        while (true) {
            String userchoice = keyboard.nextLine();


            switch (userchoice.toLowerCase()){
                case "look":
                    System.out.println();
                System.out.println("Looking around");
                break;
                case "help":
                System.out.println("Type a direction (North,South,West,East) to go in that direction");
                break;
                case "exit":
                System.out.println("Shutting down the program");
                System.exit(0);

                break;
            }


        }
    }
}
