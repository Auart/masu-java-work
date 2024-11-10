import java.util.Scanner;

/**
 * Description: TODO
 *
 * @author auart
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double len = in.nextDouble();
        double wid = in.nextDouble();
        Rectangle r = new Rectangle();
        r.setLength(len);
        r.setWidth(wid);
        System.out.println("长方形的长："+r.getLength()+",宽为："+r.getWidth());
        r.getPer();
        r.getArea();

    }
}

class  Rectangle{
    private double width;
    private double length;



    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    //定义一个setLength()方法，判断如果length<=0,则输出“长方形的长不能为0或负数”，否则给length赋值。
    public void setLength(double len) {
        if(len<=0){
            System.out.println("长方形的长不能为0或负数");
            return;
        }
        this.length = len;
    }
    //定义一个setWidth()方法，判断如果width<=0,则输出”长方形的宽不能为0为负数”，否则给width赋值。
    public void setWidth(double wid) {
        if(wid<=0){
            System.out.println("长方形的宽不能为0或负数");
            return;
        }

            this.width = wid;
    }

    //定义一个getPer()方法，判断如果length <=0 || width <=0 ,则输出“长和宽为0或负数时无法求出周长
    public void getPer() {
        if(length<=0||width<=0){
            System.out.println("长和宽为0或负数时无法求出周长");
            return;
        }
        System.out.println((length + width) * 2);
    }
    //定义一个getArea()方法 ，判断如果length <= 0 ||width <=0 ,则输出”长和宽为0或负数时无法求出面积“，否则按格式输出面积
    public void getArea() {
        if(length<=0||width<=0){
            System.out.println("长和宽为0或负数时无法求出面积");
            return;
        }

        System.out.println(length * width);
    }
}
