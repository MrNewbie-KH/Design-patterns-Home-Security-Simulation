package AbstractFactory;

public class MotionSensorB implements MotionSensor{
    @Override
    public void detect() {
        System.out.println("Motion detected via B");
    }
}
