package Homework;

/**
 * @version 1.0
 * @Author Cxc
 */
@SuppressWarnings({"all"})
public class Person {
    private String name;
    private Vehicles vehicles;
    //在创建人对象时，先分配交通工具
    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void passRiver(){
        //先得船
        if(!(vehicles instanceof Boat)) {
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();
    }
    public void common(){
        //判断是否有交通工具，没有用工具去获取
        if(!(vehicles instanceof Horse)) {
            vehicles = VehiclesFactory.getHorse();
        }
        vehicles.work();
    }
    public void passFireHill(){
        if(!(vehicles instanceof Plane)) {
            vehicles = VehiclesFactory.getPlane();
        }
        vehicles.work();
    }
}
