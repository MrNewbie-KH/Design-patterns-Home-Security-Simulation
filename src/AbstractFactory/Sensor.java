package AbstractFactory;


import Observer.MyObserver;
import lombok.Data;

@Data
public abstract class Sensor {
    public MyObserver homeOwner;
    public abstract void detect();
    public abstract void notifyObservers();
}
