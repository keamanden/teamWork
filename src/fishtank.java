import java.sql.Time;
import java.time.LocalDateTime;

public class fishtank {
    //Attributes
    private String lastWaterChange;
    private String waterQuality;

    public void Constructor(String lastWaterChange, String waterQuality){
        //Contructor
        this.lastWaterChange = lastWaterChange;
        this.waterQuality = waterQuality;
    }

    public void changeWater(){
        System.out.println("Water changed at " + LocalDateTime.now());
        System.out.println("Note (max 60 characters): ");
    }

    public String toString() {
        Time tid = new Time(0);
        String s = tid.toString();
        return s;
    }

}
