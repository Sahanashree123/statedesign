package statedesign;
public class OnState extends BulbState {

    public OnState() {
        this.stateName = "ON";
    }

    @Override
    public void changeState(Bulb bulb) {
        System.out.println("Bulb is currently ON. Dimming.");
        bulb.setBulbState(new DimState());
    }
}