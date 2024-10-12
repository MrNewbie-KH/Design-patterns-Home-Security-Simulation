package AbstractFactory;

public class MotionSensorA implements MotionSensor{
    @Override
    public void detect() {
        System.out.println("Motion detected via A");
    }
}
