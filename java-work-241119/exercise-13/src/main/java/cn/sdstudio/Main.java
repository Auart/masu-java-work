package cn.sdstudio;

/**
 * Description: TODO
 *
 * @author auart
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//通过键盘录入两个变量one,two
    Scanner sc = new Scanner(System.in);
    int one = sc.nextInt();
    int two=sc.nextInt();
        UseComputer use=new UseComputer();
        use.useCom(new Add(), one, two);
        use.useCom(new Sub(), one, two);
        use.useCom(new Mul(), one, two);
        use.useCom(new Div(), one, two);

    }

}
interface ICompute{
    int computer(int n,int m);
}
class Add implements ICompute{
    @Override
    public int computer(int n, int m) {
        return n+m;
    }
    //重写接口中的方法实现加法运算


}
class Sub implements ICompute{
    @Override
    public int computer(int n, int m) {
        return n-m;
    }
    //重写接口中的方法实现减法运算


}
class Mul implements ICompute{
    @Override
    public int computer(int n, int m) {
        return n*m;
    }
    //重写接口中的方法实现乘法运算


}
class Div implements ICompute{
    @Override
    public int computer(int n, int m) {
        return n/m;
    }
    //重写接口中的方法实现除法运算。并要求如果除数为0，则返回0，否则返回除结果


}

class UseComputer{
    //类中含有方法：public void useCom( ICompute com,int one,int two)，此方法能够用传递过来的对象调用computer方法完成运算，并输出运算结果。

    public void useCom( ICompute com,int one,int two){
        System.out.println(com.computer(one, two));
    }
}