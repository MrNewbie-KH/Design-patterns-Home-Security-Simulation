package AbstractFactory;

public class MotionSensorB extends MotionSensor{
    @Override
    public void detect() {
        System.out.println("Motion detected via B");
        notifyObservers();

    }

    @Override
    public void notifyObservers() {
        System.out.println("Motion sensor B notify the home owner : "+ homeOwner.getName());

    }
}
