package statedesign;
public class DimState extends BulbState {

    public DimState() {
        this.stateName = "DIM";
    }

    @Override
    public void changeState(Bulb bulb) {
        System.out.println("Bulb is currently DIM. Flickering.");
        bulb.setBulbState(new FlickerState());
    }
}