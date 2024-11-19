

/**
 * Description: TODO
 *
 * @author auart
 */
import java.util.Scanner;
//声明DiscountStrategy接口
interface DiscountStrategy {
    double calculatePrice(double price,int count);
}
//初级会员:实现DiscountStrategy接口，折扣为1
class JuniorMember implements DiscountStrategy
{
    private final double DISCOUNT=1;

    @Override
    public double calculatePrice(double price, int count) {
        return DISCOUNT*price*count;
    }

    //实现了接口中的方法



}
//中级会员：实现DiscountStrategy接口，折扣为0.95
class IntermediateMember implements DiscountStrategy
{
    private final double DISCOUNT=0.95;

    @Override
    public double calculatePrice(double price, int count) {
        return DISCOUNT*price*count;
    }
    //实现了接口中的方法


}
//高级会员：实现DiscountStrategy接口，折扣为0.9
class SeniorMember implements DiscountStrategy
{
    private final double DISCOUNT=0.9;

    @Override
    public double calculatePrice(double price, int count) {
        return DISCOUNT*price*count;
    }
    //实现了接口中的方法


}
//会员类
class VIP {
    private double price; //单价
    private DiscountStrategy discount;//打折的会员对象
    private int count; //数量

    public double getTotal() {
        //返回原始价格
        return price*count;

    }
    public void setTotal(double price,int count) {
        this.price=price;
        this.count=count;
    }
    //折扣:参数是对象。不同的对象，有不同的折扣。每个对象的折扣写在自己的类中的。
    public void setDiscount(DiscountStrategy discount) {
        this.discount=discount;
    }
    //声明getDiscount()方法：返回折扣的对象
    public DiscountStrategy getDiscount() {
        return discount;
    }

}
public class Main{
    public static void main(String[] args) {
        //原始价格originalPrice，数量count，从键盘输入
        //折扣由身份决定的
        double originalPrice;
        int count;
        DiscountStrategy[] DS=new DiscountStrategy[3]; //声明折扣对象数组，该数组中有3个元素
        DS[0]=new JuniorMember(); //初级对象
        DS[1]=new IntermediateMember(); //中级对象
        DS[2]=new SeniorMember();   //高级对象

        Scanner in=new Scanner(System.in);

        VIP vip=new VIP();//会员
        //测试不同的会员，相同价格，相同数量，不同折扣下的商品总和
        originalPrice=in.nextDouble();
        count=in.nextInt();
        //原始价格：
        vip.setTotal(originalPrice, count);
        System.out.println("原价："+vip.getTotal());

        for(int i=0;i<3;i++) {
            //输出不同会员的折扣价格：
            System.out.print("折扣价格：");
            System.out.print(DS[i].getClass()+":"); //反射机制获取类名
            //输出折扣后的价格
            System.out.println(DS[i].calculatePrice(originalPrice, count));
        }
    }
}

