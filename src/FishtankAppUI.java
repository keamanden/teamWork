import java.util.*;
import java.util.Scanner;
public class FishtankAppUI {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    MenuUi();


    }


    public static void WelcomeMessage(){

        System.out.println("Welcome to Fishtank Manager");

    }

    public static void LineBreak(){

        System.out.println("-------------------------------");

    }

    public static void Menu(){

        System.out.println("Please select one of the following options:\n");

        System.out.println("1. View fish status");

        System.out.println("2. Update fish health");

        System.out.println("3. Change water");

        System.out.println("4. View last water change");

        System.out.println("5. Exit program");


    }

    public static void MenuUi(){

        WelcomeMessage();
        LineBreak();
        Menu();

    }

    public static int getUserInput(Scanner sc){


       return sc.nextInt();
    }

    public static void SelectFish(int userInput){

        if(userInput == 1){

            System.out.println("You have selected View fish status");
            LineBreak();
            System.out.println("Please select one of fish:");
            System.out.println("1." ); //add fish
            System.out.println("2."); //add fish

            getUserInput();

        }

    }


}
