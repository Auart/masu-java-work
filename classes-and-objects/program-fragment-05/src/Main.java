import java.util.Scanner;

/**
 * Description: TODO
 *
 * @author auart
 */
public class Main {
    public static void main(String[] args) {
        //按要求创建汽车类对象，并通过键盘录入轮胎个数，汽车颜色，车身重量，并按要求输出
        Scanner sc = new Scanner(System.in);
        String count = sc.next();
        String width = sc.next();
        String color = sc.next();
        Car c = new Car(count, color, width);

        c.SpeedUp();
        c.SpeedDown();
        c.Stop();
    }
}

class Car {
    //利用构造方法建立一个汽车类Car：包括轮胎个数，汽车颜色，车身重量等属性,同时创建3个实例方法，要求 汽车能够加速，减速，停车。


    public Car(String count, String color, String width) {
        System.out.printf("%s轮的%s色%s吨汽车将有以下情况：\n", count, color, width);
    }

    public void SpeedUp() {
        System.out.println("加速啦！");

    }

    public void SpeedDown() {
        System.out.println("赶快减速！");
    }

    public void Stop() {
        System.out.println("车已停了！");
    }

}