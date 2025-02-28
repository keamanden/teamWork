import java.util.*;
import java.util.Scanner;
public class FishtankAppUI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MenuUi(sc);


    }


    public static void WelcomeMessage() {

        System.out.println("Welcome to Fishtank Manager");

    }

    public static void LineBreak() {

        System.out.println("-------------------------------");

    }

    public static void Menu(Scanner sc) {

        System.out.println("Please select one of the following options:\n");

        System.out.println("1. View fish status");

        System.out.println("2. Update fish health");

        System.out.println("3. Change water");

        System.out.println("4. View last water change");

        System.out.println("5. Exit program");

        int getUserInput = getUserInput(sc);

        if (getUserInput == 1) {
            SelectFish(sc);
        } else if (getUserInput == 2) {
            updateFishHealth(sc);
        } else if (getUserInput == 3) {
            ChangeWater(sc);
        } else if (getUserInput == 4) {
            lastWaterChange();
        } else if (getUserInput == 5) {
            System.out.println("Thank you for using Fishtank Manager");
            System.exit(0);
        }


    }

    public static void MenuUi(Scanner sc) {

        WelcomeMessage();
        LineBreak();
        Menu(sc);

    }

    public static int getUserInput(Scanner sc) {

        System.out.println("Please enter your choice: ");

        int userInput = sc.nextInt();

        return userInput;

    }

    public static void SelectFish(Scanner sc) {


        System.out.println("You have selected View fish status");
        LineBreak();
        System.out.println("Please select one of fish:");
        System.out.println("1."); //add fish
        System.out.println("2."); //add fish

        getUserInput(sc);


    }


    public static void updateFishHealth(Scanner sc) {

        System.out.println("You have selected Fish health");
        LineBreak();
        System.out.println("Please select one of fish:");
        System.out.println("1.");
        System.out.println("2.");
        getUserInput(sc);



    }


    public static void ChangeWater(Scanner sc) {
        System.out.println("You have selected Water change");
        LineBreak();
        System.out.println("Did you change the water? (Y/N)");

        if (Objects.equals(sc.nextLine(), "Y")) {
        System.out.println("You have changed the water");
        } else {
            MenuUi(sc);
        }

    }

    public static void lastWaterChange() {
      // display last water change  System.out.println();
    }





}