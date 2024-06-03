package statedesign;
public abstract class BulbState {

    public String stateName;

    public abstract void changeState(Bulb bulb);
}