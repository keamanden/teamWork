public class Fish {
    private String name;
    private String healthStatus;

    // Konstruktor
    public Fish(String name) {
        this.name = name;
        this.healthStatus = "Healthy";  // Standardværdien
    }

    // Getter for navn
    public String getName() {
        return name;
    }

    // Getter for sundhedsstatus
    public String getHealthStatus() {
        return healthStatus;
    }

    // Metode til at opdatere sundhedsstatus
    public void updateHealthStatus(String newStatus) {
        this.healthStatus = newStatus;
    }

    // toString metode for at vise information om fisken
    @Override
    public String toString() {
        return name + " - Health: " + healthStatus;
    }
}

