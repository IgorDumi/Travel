
public class Bus {

    String provider;
    int maxSpeed;
    String type;
    int maxCapacity;
    int maxFuel;
    int currentFuel;

    public Bus() {

        this.provider = "Top Turist";
        this.maxSpeed = 150;
        this.type = "Double Decker";
        this.maxCapacity = 80;

    }

    public void printAttributes() {
        System.out.println("Prevoznik: " + this.provider);
        System.out.println("Maksimalna brzina: " + this.maxSpeed);
        System.out.println("Tip: " + this.type);
        System.out.println("Broj sedista: " + this.maxCapacity);
        System.out.println();
        System.out.println();
        System.out.println();

    }

    public Bus(String provider, int maxSpeed, String type, int maxCapacity, int maxFuel, int currentFuel) {
        this.provider = provider;
        this.maxSpeed = maxSpeed;
        this.type = type;
        this.maxCapacity = maxCapacity;
        this.maxFuel = maxFuel;
        this.currentFuel = currentFuel;

    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
