package AbstractFactory;

public class AbstractFactoryA implements IAbstractFactory {



    @Override
    public Sensor createSmokeSensor() {
        return new SmokeSensorA();
    }@Override
    public Sensor createMotionSensor() {
        return new MotionSensorA();
    }

}
