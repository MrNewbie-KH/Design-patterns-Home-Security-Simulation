package AbstractFactory;

public class AbstractFactoryB implements IAbstractFactory {
    @Override
    public SmokeSensor createSmokeSensor() {
        return new SmokeSensorB();
    }@Override
    public MotionSensor createMotionSensor() {
        return new MotionSensorB();
    }
}
