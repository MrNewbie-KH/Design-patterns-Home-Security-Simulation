package AbstractFactory;

public class SmokeSensorB implements SmokeSensor{
    @Override
    public void detect() {
        System.out.println("Smoke detected via B");
    }
}
