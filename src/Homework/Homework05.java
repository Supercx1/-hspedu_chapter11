package Homework;

/**
 * @version 1.0
 * @Author Cxc
 */
public class Homework05 {
    public static void main(String[] args) {
        new A().f1();
    }
}
class A{
    private String name = "hello";
    public void f1(){
        class B{
            private final String NAME="韩顺平教的好";
            public void show(){
                System.out.println(NAME);
                System.out.println(name);
            }


        }
        B b = new B();
        b.show();
    }



}
