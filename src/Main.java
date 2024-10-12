import AbstractFactory.AbstractFactoryA;
import AbstractFactory.AbstractFactoryB;
import AbstractFactory.IAbstractFactory;
import AbstractFactory.Sensor;
import Observer.MyObserver;
import Singleton.Logger;

public class Main {
    public static void main(String[] args) {
        IAbstractFactory aCompany = new AbstractFactoryA();
        IAbstractFactory bCompany = new AbstractFactoryB();
        Logger logger = Logger.getInstance();
        MyObserver homeowner = new MyObserver("mohamed");
//        =================================================
        Sensor motionSensorA = aCompany.createMotionSensor(); // no user
        Sensor smokeSensorA = aCompany.createSmokeSensor();
        motionSensorA.setHomeOwner(homeowner);
        smokeSensorA.setHomeOwner(homeowner);
        motionSensorA.detect();
        smokeSensorA.detect();
    }
}