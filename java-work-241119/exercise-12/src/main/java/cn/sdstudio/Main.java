package cn.sdstudio;

/**
 * Description: TODO
 *
 * @author auart
 */
import java.util.*;
abstract class Shape{
    abstract void getArea();
}

class Circle extends Shape{
    private double r;
    public Circle(double r) {
        this.r = r;

    }

    @Override
    void getArea() {
        System.out.println("Circle area:" + r);
    }
    //该类继承自Shape，并实现了其抽象方法getArea()。在该类的构造方法中，获取了圆形的半径，以此在getArea()中计算面积。



}
class Rectangle extends Shape{
    private double length;
    private double width;


    public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
    }

    @Override
    void getArea() {
        System.out.println("Rectangle area:" +width* length);
    }
    //该类继承自Shape，并实现了其抽象方法getArea()。在该类的构造方法中，获取了矩形的长和宽，以此在getArea()中计算面积。


}

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double r=s.nextDouble();
        Shape shape;
        shape=new Circle(r);
//利用上转型对象，输出圆形的面积
                shape.getArea();
        double length=s.nextDouble();
        double width=s.nextDouble();
        shape=new Rectangle(length,width);
//利用上转型对象，输出矩形的面积
                shape.getArea();


    }
}
