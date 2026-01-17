package DIP.fixed;

public class CarFixed {
    private EngineFixed engine;

    public CarFixed(EngineFixed engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }
}

   
