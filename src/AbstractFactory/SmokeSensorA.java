package AbstractFactory;

public class SmokeSensorA extends SmokeSensor{

    @Override
    public void detect() {
        System.out.println("Smoke detected via A");
        notifyObservers();

    }

    @Override
    public void notifyObservers() {
        System.out.println("smoke sensor A notify the home owner : "+ homeOwner.getName());

    }
}
