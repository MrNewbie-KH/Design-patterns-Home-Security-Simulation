package AbstractFactory;


import Observer.MyObserver;
import Singleton.Logger;
import lombok.Data;

@Data
public abstract class Sensor {
    public MyObserver homeOwner;
    public Logger logger;
    public abstract void detect();
    public abstract void notifyObservers();
}
