package AbstractFactory;

public class SmokeSensorA extends SmokeSensor{

    @Override
    public void detect() {
        System.out.println("Smoke detected via A");
        notifyObservers();
        logger.log("LOGGER:  Smoke detected via A");

    }

    @Override
    public void notifyObservers() {
        System.out.println("smoke sensor A notify the home owner : "+ homeOwner.getName());

    }
}
