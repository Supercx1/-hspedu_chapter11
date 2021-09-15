package Homework;

/**
 * @version 1.0
 * @Author Cxc
 */
public class Homework07 {
    public static void main(String[] args) {
        //实例化Car
        Car car = new Car(60);
        car.getAir().flow();
        Car car1 = new Car(-1);
        car1.getAir().flow();
        Car car2 = new Car(20);
        car2.getAir().flow();
    }
}
class Car{
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air{
        public void flow(){
            if(temperature>40){
                System.out.println("温度大于40，吹冷气");
            }else if(temperature<0){
                System.out.println("温度小于0度，吹热气");
            }else{
                System.out.println("温度正常，关闭空调");
            }
        }
    }
    public Air getAir(){
        return new Air();
    }
}
