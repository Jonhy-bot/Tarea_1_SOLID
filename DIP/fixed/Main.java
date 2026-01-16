package DIP.fixed;

public class Main {
    public static void main(String[] args) {
        EngineFixed electricEngine = new ElectricFixed();
        CarFixed electricCar = new CarFixed(electricEngine);
        electricCar.start();

        EngineFixed gasolineEngine = new GasolineFixed();
        CarFixed gasolineCar = new CarFixed(gasolineEngine);
        gasolineCar.start();
    }
}
