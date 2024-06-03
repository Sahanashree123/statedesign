package statedesign;
public class OffState extends BulbState {

    public OffState() {
        this.stateName = "OFF";
    }

    @Override
    public void changeState(Bulb bulb) {
        System.out.println("Bulb is currently OFF. Turning ON.");
        bulb.setBulbState(new OnState());
    }
}