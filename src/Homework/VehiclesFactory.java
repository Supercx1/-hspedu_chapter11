package Homework;

/**
 * @version 1.0
 * @Author Cxc
 */
public class VehiclesFactory {
    private static Horse horse = new Horse();
    private VehiclesFactory(){}
    public static Horse getHorse(){
        return new Horse();
    }
    public static Boat getBoat(){
        return new Boat();
    }
    public static Plane getPlane(){
        return new Plane();
    }
}
