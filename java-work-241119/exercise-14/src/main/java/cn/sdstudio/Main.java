package cn.sdstudio;

/**
 * Description: TODO
 *
 * @author auart
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int days = r.nextInt();
        Hotel h;
        h = new Inn("大理印象", "云南");
        h.show();
        System.out.println("房费总计：" + h.callRent(days));
        h = new StarHotel("希尔顿", "三亚");
        h.show();
        System.out.println("房费总计：" + h.callRent(days));
    }


}

abstract class Hotel {
    private String brand, adress;
    public Hotel(String brand, String adress) {
        this.brand = brand;
        this.adress = adress;
    }
    public abstract int callRent(int days);//根据天数计算住宿费
    //定义一个实例方法show（）,该方法可以直接输出品牌和地址
    public  void show(){
        System.out.println(brand + " " + adress);
    }

}
//定义两个类民宿Inn类与星级酒店StarHotel类继承自Hotel类
class  Inn extends Hotel {

    public Inn(String brand, String adress) {
        super(brand, adress);
    }

    @Override
    public int callRent(int days) {
        return days*300;
    }
}
class StarHotel extends Hotel {
    public StarHotel(String brand, String adress) {
        super(brand, adress);
    }

    @Override
    public int callRent(int days) {
        return days*1500;
    }
}
