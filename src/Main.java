
public class Main {

    public static void main(String[] args) {

        Car defaultCar = new Car();
//        defaultCar.printAttributes();

        Car audi = new Car("Audi A4", "BG-1234");
//        audi.printAttributes();
        audi.setWeight(1400);
        audi.setConsumption(10);
//        audi.printAttributes();

        Car bmw = new Car("BMW", 200, 1300, "BG-54567", 0, 0, 100, 15, 5, 1);
//        bmw.fuelUp();
//        bmw.printAttributes();
//        
//        bmw.travel(4);
//        bmw.printAttributes();
//        
//         bmw.travel(6);
//        bmw.printAttributes();

        bmw.printAttributes();
        bmw.getIn(3);
        bmw.getOut(2);
        bmw.printAttributes();

        Bus defaultBus = new Bus();
        defaultBus.printAttributes();

        Bus bus2 = new Bus();
        bus2.setProvider("Nis Expres");
        bus2.setType("Medjugradski");
        bus2.printAttributes();

        Bus bus3 = new Bus("Nikolic", 80, "Medjugradski", 100, 1300, 900);
        bus3.printAttributes();

    }

}
