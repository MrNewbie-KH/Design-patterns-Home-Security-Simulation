package AbstractFactory;

public class SmokeSensorB extends SmokeSensor{
    @Override
    public void detect() {
        System.out.println("Smoke detected via B");
        notifyObservers();
        logger.log("LOGGER:  Smoke detected via B");

    }

    @Override
    public void notifyObservers() {
        System.out.println("smoke sensor B notify the home owner : "+ homeOwner.getName());

    }
}
