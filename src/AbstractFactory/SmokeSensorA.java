package AbstractFactory;

public class SmokeSensorA implements SmokeSensor{
    @Override
    public void detect() {
        System.out.println("Smoke detected via A");
    }
}
