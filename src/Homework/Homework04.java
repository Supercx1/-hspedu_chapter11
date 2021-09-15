package Homework;

/**
 * @version 1.0
 * @Author Cxc
 */
public class Homework04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new ICalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1+n2;
            }
        },10,8);

    }

}
interface ICalculate{
    public double work(double n1,double n2);

}
class Cellphone{
    //调用该方法时，写接口匿名内部类重写方法传参
    public void testWork(ICalculate iCalculate,double n1,double n2){
        double result = iCalculate.work(n1,n2);
        System.out.println("计算后结果："+result);
    }
}

