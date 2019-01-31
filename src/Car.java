
public class Car {

    String model;
    int maxSpeed;
    int minSpped;
    double weight;
    String license;

    double mileage;
    int currentFuel;
    int maxFuel;
    int consumption; // per 1km

    int maxCapacity;
    int currentCapacity;

    public Car() {
        this.model = "Demo";
        this.maxSpeed = 120;
        this.weight = 1000;
        this.license = "test drive";
        this.mileage = 0;
        this.maxFuel = 50;
        this.consumption = 1;
        this.currentFuel = 50;
        this.maxCapacity = 5;
        this.currentCapacity = 1;

    }

    public Car(String customModel, String customLicense) {
        this.model = customModel;
        this.license = customLicense;

    }

    public Car(String model, int maxSpeed, double weight, String license, double mileage, int currentFuel, int maxFuel, int consumption, int maxCapacity, int currentCapacity) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.license = license;
        this.mileage = mileage;
        this.currentFuel = currentFuel;
        this.maxFuel = maxFuel;
        this.consumption = consumption;
        this.maxCapacity = maxCapacity;
        this.currentCapacity = currentCapacity;

    }

    public void printAttributes() {
        System.out.println();
        System.out.println("Model: " + this.model);
        System.out.println("Maksimalna brzina: " + this.maxSpeed);
        System.out.println("Tezina: " + this.weight);
        System.out.println("Kapacitet rezervoara: " + this.maxFuel);
        System.out.println("Potrosnja: " + this.consumption);
        System.out.println("Registracija : " + this.license);
        System.out.println("Trenutno stanje rezervoara : " + this.currentFuel);
        System.out.println("Kilometraza: " + this.mileage);
        System.out.println("Broj mesta: " + this.maxCapacity);
        System.out.println("Trenutno zauzeto: " + this.currentCapacity);
        System.out.println();
    }

    public void setWeight(double customWeight) {
        this.weight = customWeight;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setConsumption(int customConsumption) {
        this.consumption = customConsumption;
    }

    public void travel(int distance) {
        if (this.currentFuel > distance * this.consumption) {
            this.mileage = this.mileage + distance;
            this.currentFuel = this.currentFuel - this.consumption * distance;
        } else {
            System.out.println("Nema dovoljno goriva za toliki put");
        }

    }

    public void fuelUp() {
        this.currentFuel = this.maxFuel;
        System.out.println("U automibil " + this.model + "je sipano " + (this.maxFuel - this.currentFuel) + " litara goriva");
    }

    public void getIn(int newPassangers) {

        this.currentCapacity = this.currentCapacity + newPassangers;
        System.out.println("Uslo je " + newPassangers + " putnika. Sada ih ima " + this.currentCapacity);

    }

    public void getOut(int outPassangers) {

        this.currentCapacity = this.currentCapacity - outPassangers;
        System.out.println("Izaslo je " + outPassangers + " putnika. Ostalo ih je " + this.currentCapacity);

    }

}
