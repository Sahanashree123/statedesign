package statedesign;
public class StatePatternTest {

    public static void main(String[] args) {
        Bulb bulb = new Bulb();

        // Initial State is OFF
        System.out.println("Initial State: " + bulb.getBulbState().stateName);
        bulb.pressButton(); // Should transition to ON

        // Transition from ON to DIM
        System.out.println("Current State: " + bulb.getBulbState().stateName);
        bulb.pressButton(); // Should transition to DIM

        // Transition from DIM to FLICKER
        System.out.println("Current State: " + bulb.getBulbState().stateName);
        bulb.pressButton(); // Should transition to FLICKER

        // Transition from FLICKER to OFF
        System.out.println("Current State: " + bulb.getBulbState().stateName);
        bulb.pressButton(); // Should transition to OFF

        // Demonstrating cycle again
        System.out.println("Current State: " + bulb.getBulbState().stateName);
        bulb.pressButton(); // Should transition to ON
        System.out.println("Current State: " + bulb.getBulbState().stateName);
        bulb.pressButton(); // Should transition to DIM
        System.out.println("Current State: " + bulb.getBulbState().stateName);
        bulb.pressButton(); // Should transition to FLICKER
        System.out.println("Current State: " + bulb.getBulbState().stateName);
        bulb.pressButton(); // Should transition to OFF
    }
}