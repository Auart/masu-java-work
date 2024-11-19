package cn.sdstudio;

/**
 * Description: TODO
 *
 * @author auart
 */
import java.util.Scanner;

public class Main {
    UnitPrice u;
    //通过调用static double get(UnitPrice u)方法可以得到商品的单价

    private static double get(UnitPrice u) {
        return u.unitprice();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        System.out.println("依次输入电视、计算机和手机的销售个数：");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        System.out.println("电视总销售额为：" + a * Main.get(new TV(4000.0)));
        System.out.println("计算机总销售额为：" + b * Main.get(new Computer(6000.0)));
        System.out.println("手机总销售额为：" + c * Main.get(new Phone(3000.0)));
    }

}
interface UnitPrice {
    public double unitprice(); // 返回商品的单价
}
//定义三个类电视TV、计算机Computer和手机Phone来实现接口UnitPrice。
class TV implements UnitPrice {
    double unitprice;

    public TV(double unitprice) {
        this.unitprice = unitprice;
    }

    @Override
    public double unitprice() {
        return this.unitprice;
    }
}
class Computer implements UnitPrice {

    double unitprice;
    public Computer(double v) {
        this.unitprice = v;
    }

    @Override
    public double unitprice() {
        return unitprice;
    }
}
class Phone implements UnitPrice {
    double unitprice;
    public Phone(double v) {
        unitprice=v;
    }

    @Override
    public double unitprice() {
        return unitprice;
    }
}

