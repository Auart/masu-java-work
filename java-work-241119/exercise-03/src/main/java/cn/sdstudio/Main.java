package cn.sdstudio;

/**
 * Description: TODO
 *
 * @author auart
 */
import java.util.Scanner;

public class Main {
    public static void get(ObjectVolume obj) {
        System.out.println(obj.getVolume());
    }

    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("请输入1-3之间的任一个数字进行选择：");
        int n = st.nextInt();
        ObjectVolume obj=null;
        if (n == 1) {// 球体
            System.out.println("请输入半径：");
            int r = st.nextInt();
            obj=new Sphere(r);
        }
        if (n == 2) {// 立方体
            System.out.println("请输入边长：");
            int a = st.nextInt();
            obj=new Cube(a);
        }
        if (n == 3) {// 圆柱体
            System.out.println("请输入半径和高：");
            int r = st.nextInt();// 半径
            int h = st.nextInt();// 高
            obj=new Cylinder(r, h);
        }
        Main.get(obj);
    }

}
abstract class ObjectVolume {
    abstract double getVolume(); // 返回物体的体积
}
//分别定义三个类球体（Sphere）、立方体（Cube）、圆柱体（Cylinder），让它们继承ObjectVolume类并重写getVolume()方法。
class Sphere extends ObjectVolume{
    private int r;
    public Sphere(int r) {
        this.r=r;
    }

    @Override
    double getVolume() {
        return (4/3)*3.14*r*r*r;
    }
}
class Cube extends ObjectVolume {
    private int a;
    public Cube(int a) {
        this.a=a;

    }

    @Override
    double getVolume() {
        return a*a*a;
    }
}

class  Cylinder extends ObjectVolume{
    private int r ,h;
    public Cylinder(int r, int h) {
        this.r=r;
        this.h=h;
    }

    @Override
    double getVolume() {
        return 3.14*r*r*h;
    }
}



