package cn.sdstudio;

/**
 * Description: TODO
 *
 * @author auart
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("输入圆的半径和圆柱的高：");
        //通过键盘录入圆的半径和圆柱的高

        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        Circle ci=new Circle(r);
        ci.show();
        Cylinder cyl=new Cylinder(r,h);
        cyl.show();
        cyl.showVolume();
    }
}

class Circle {
    private double radius;

    Circle(double r){
        radius=r;
    }
    double getPerimeter() {
        return 2*3.14*radius;
    }
    double getArea() {
        return 3.14*radius*radius;
    }
    void show() {
        System.out.println("圆半径="+radius+"圆周长"+getPerimeter()+"圆面积"+getArea());
    }


}

class Cylinder extends Circle {
    //Cylinder类包含：一个成员变量double hight(私有 浮点型)：圆柱体的高；构造方法Cylinder(double r,double h):创建Circle对象时将半径初始化为r;成员方法double getVolume():获取圆柱体的体积 void showVolume():将圆柱体的体积输出到屏幕。
    private double hight;


    Cylinder(double r, double h) {
            super(r);
           this.hight =h;

    }

    public void showVolume() {
        System.out.println(super.getArea() * hight);
    }
}
