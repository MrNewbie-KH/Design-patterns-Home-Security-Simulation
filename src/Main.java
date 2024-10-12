import AbstractFactory.AbstractFactoryA;
import AbstractFactory.AbstractFactoryB;
import AbstractFactory.IAbstractFactory;
import AbstractFactory.Sensor;

public class Main {
    public static void main(String[] args) {
        IAbstractFactory aCompany = new AbstractFactoryA();
        IAbstractFactory bCompany = new AbstractFactoryB();
//        =================================================
        Sensor motionSensorA = aCompany.createMotionSensor();
        motionSensorA.detect();
    }
}