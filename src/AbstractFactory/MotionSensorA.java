package AbstractFactory;

public class MotionSensorA extends MotionSensor{
    @Override
    public void detect() {

        System.out.println("Motion detected via A");
        notifyObservers();
        logger.log("LOGGER:  Motion detected via B");
    }

        @Override
        public void notifyObservers() {
            System.out.println("Motion sensor A notify the home owner : "+ homeOwner.getName());

        }
}
