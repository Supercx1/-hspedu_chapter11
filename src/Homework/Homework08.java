package Homework;

/**
 * @version 1.0
 * @Author Cxc
 */
public class Homework08 {
    public static void main(String[] args) {
        Color green = Color.GREEN;
        green.show();
        switch (green){
            case YELLOW:
                System.out.println("匹配到黄色");
                break;
            case BLACK:
                System.out.println("匹配到黑色");
                break;
            case GREEN:
                System.out.println("匹配到绿色");
                break;
            default:
                System.out.println("没有匹配。。。。");

        }
    }
}
interface IMyInterface{
    public void show();
}
@SuppressWarnings({"all"})
enum Color implements IMyInterface{
    RED(255,0,0),
    BULE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    private Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("属性值位："+redValue+","+greenValue+","+blueValue);
    }
}
