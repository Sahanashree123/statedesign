package statedesign;
public class FlickerState extends BulbState {

    public FlickerState() {
        this.stateName = "FLICKER";
    }

    @Override
    public void changeState(Bulb bulb) {
        System.out.println("Bulb is currently FLICKERING. Turning OFF.");
        bulb.setBulbState(new OffState());
    }
}