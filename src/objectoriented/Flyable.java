package objectoriented;

public interface Flyable {

    public static final double FLIGHT_VELOCITY = 10.0;

    default public void fly() {
        System.out.println("Default fly method");
    }
}
