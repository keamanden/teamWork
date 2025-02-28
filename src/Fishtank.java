import java.time.LocalDateTime;
import java.util.Scanner;

public class Fishtank {

    //Enum til afkrydsnings muligheder
    public enum waterQualityBefore {
        Dårligt, Okay, Godt, Perfekt
    }

    //Attributter
    private LocalDateTime lastWaterChange;
    private waterQualityBefore beforeChange;
    private String changingNote;


    public Fishtank() {
        //Konstruktører DEFAULT
        this.beforeChange = (waterQualityBefore.Okay);

        this.lastWaterChange = null;

        this.changingNote = "Ingen bemærkninger";
    }

    public void changeWater(waterQualityBefore tilstand, String note) {
        if (note.length() > 60) {
            System.out.println("Max 60 characters!");
            return;
        }

        this.beforeChange = tilstand;
        this.lastWaterChange = LocalDateTime.now();
        this.changingNote = note;

    }

    public LocalDateTime getLastWaterChange() {
        return lastWaterChange;
    }

    public waterQualityBefore getBeforeChange() {
        return beforeChange;
    }

    public String getChangingNote() {
        return changingNote;
    }

    public String toString() {
        return
                "\nWater changed at: " + (lastWaterChange != null ? lastWaterChange : "Endnu ikke skiftet") +
                        "\nQuality before change: " + beforeChange +
                        "\nNote: " + changingNote + "\n";

    }

    public static waterQualityBefore svarMulighed(Scanner scanner) {

        System.out.println("Quality before change:\n(1) Dårligt\n(2) Okay\n(3) Godt\n(4) Perfekt");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                return waterQualityBefore.Dårligt;
            case 2:
                return waterQualityBefore.Okay;
            case 3:
                return waterQualityBefore.Godt;
            case 4:
                return waterQualityBefore.Perfekt;
            default:
                System.out.println("Ugyldigt valg. Standard: Okay");
                return waterQualityBefore.Okay;

        }
        /*
    public void hej(){
            this.lastWaterChange = LocalDateTime.now();
        }

        */

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1 Opret et Fishtank-objekt
        Fishtank a = new Fishtank();
        System.out.println("Standard Fishtank:");
        System.out.println(a);

        // 2 Kald `svarMulighed()` for at få en ny vandkvalitet
        Fishtank.waterQualityBefore valgtKvalitet = Fishtank.svarMulighed(scanner);

        // 3 Brugeren indtaster en note
        System.out.println("Skriv en kort note (max 60 tegn): ");
        String note = scanner.nextLine();

        // 4 Opdater vandskiftet
        a.changeWater(valgtKvalitet, note);
        System.out.println("Efter vandskift:");
        System.out.println(a);


        scanner.close();  // Luk scanner
    }
}
