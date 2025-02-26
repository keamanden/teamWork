import java.time.LocalDate;

public class Fishtank {
private LocalDate lastWaterChange;
private WaterQuality waterQuality;
private String waterChangeNote;


//Definere de mulige status værdier for vandet uden at man kan indtaste en forkert værdi
public enum WaterQuality{
    PERFECT, GOOD, OKAY, BAD
}

public Fishtank(){
    this.lastWaterChange = LocalDate.now();
    this.waterQuality = WaterQuality.GOOD;
    this.waterChangeNote = "Standard note";

}

    public LocalDate getLastWaterChange(){
    return lastWaterChange;
    }

    public WaterQuality getWaterQuality(){
        return waterQuality;
    }
    public String getWaterChangeNote(){
    return waterChangeNote;
    }

    public void changeWater(String note, WaterQuality quality){
    this.lastWaterChange = quality;
    this.waterChangeNote = note;
    }
}
