package cn.sdstudio;

/**
 * Description: TODO
 *
 * @author auart
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //通过键盘输入轮胎个数n、CD机和空调品牌名称airC
        Scanner sc = new Scanner(System.in);
      int n=  sc.nextInt();
      String CD=  sc.next();
      String airC= sc.next();
        car c = new car(n, CD, airC);
        System.out.println(n + "轮小轿车装备了" + c.getCD() + "牌CD机和" + c.getAir_condition() + "牌空调");
        c.jiasu();
        c.jiansu();
        c.tingzhi();
    }
}

class Auto {
    private int luntai;
    public Auto(int luntai) {
        this.luntai = luntai;
    }
    public void jiasu() {
        System.out.println("加速啦！");
    }
    public void jiansu() {
        System.out.println("减速啦！");
    }
    public void tingzhi() {
        System.out.println("停车啦！");
    }
}

class car extends Auto {
   private String cd;
   private String airC;

    public car(int n, String cd, String airC) {
        super(n);
        this.cd = cd;
        this.airC = airC;
    }

    public String getCD() {

        return cd;
    }

    public String getAir_condition() {

        return airC;
    }
    //定义一个小汽车类Car继承Auto并添加空调、CD机成员变量,同时要求重写父类的加速和减速的方法。


}
