package AbstractFactory;

public interface IAbstractFactory {
    public Sensor createMotionSensor();
    public Sensor createSmokeSensor();
}
