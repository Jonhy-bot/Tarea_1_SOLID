package DIP.fixed;

public class Main {
    public static void main(String[] args) {

        EngineFixed electricEngine = new ElectricEngine();
        CarFixed carWithElectricEngine = new CarFixed(electricEngine);
        carWithElectricEngine.start();

        EngineFixed gasolineEngine = new GasolineEngine();
        CarFixed carWithGasolineEngine = new CarFixed(gasolineEngine);
        carWithGasolineEngine.start();

    }
}
